package main.com.ttao.tutorialspoint._27Builders
String records = '''
   <library>
	
      <Student>
         <StudentName division = 'A'>Joe</StudentName>
         <StudentID>1</StudentID>
      </Student>
	  
      <Student>
         <StudentName division = 'B'>John</StudentName>
         <StudentID>2</StudentID>
      </Student>
	  
      <Student>
         <StudentName division = 'C'>Mark</StudentName>
         <StudentID>3</StudentID>
      </Student>
		
   </library>'''

def rd = new StringReader(records)
def doc = groovy.xml.DOMBuilder.parse(rd)
println(doc.documentElement)
