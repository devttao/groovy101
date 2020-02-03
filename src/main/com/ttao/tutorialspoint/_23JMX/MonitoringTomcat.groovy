import groovy.swing.SwingBuilder

/*
 - https://www.tutorialspoint.com/groovy/groovy_jmx.htm

In order to monitor tomcat, the following parameter should be set when tomcat is started −
```
set JAVA_OPTS = -Dcom.sun.management.jmxremote
Dcom.sun.management.jmxremote.port = 9004\

-Dcom.sun.management.jmxremote.authenticate=false
Dcom.sun.management.jmxremote.ssl = false
```
 */

'''

import javax.management.ObjectName
import javax.management.remote.JMXConnectorFactory as JmxFactory
import javax.management.remote.JMXServiceURL as JmxUrl
import javax.swing.WindowConstants as WC

import org.jfree.chart.ChartFactory
import org.jfree.data.category.DefaultCategoryDataset as Dataset
import org.jfree.chart.plot.PlotOrientation as Orientation

def serverUrl = 'service:jmx:rmi:///jndi/rmi://localhost:9004/jmxrmi'
def server = JmxFactory.connect(new JmxUrl(serverUrl)).MBeanServerConnection
def serverInfo = new GroovyMBean(server, 'Catalina:type = Server').serverInfo
println "Connected to: $serverInfo"

def query = new ObjectName('Catalina:*')
String[] allNames = server.queryNames(query, null)

def modules = allNames.findAll { name ->
    name.contains('j2eeType=WebModule')
}.collect{ new GroovyMBean(server, it) }

println "Found ${modules.size()} web modules. Processing ..."
def dataset = new Dataset()

modules.each { m ->
    println m.name()
    dataset.addValue m.processingTime, 0, m.path
}

'''