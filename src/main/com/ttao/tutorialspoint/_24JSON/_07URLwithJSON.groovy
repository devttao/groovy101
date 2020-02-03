package main.com.ttao.tutorialspoint._24JSON

import groovy.json.JsonSlurper

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL
import java.util.List
import java.util.Map

public class _07URLwithJSON {

    private static final String JSON_URL = "http://www.mrhaki.com/samples/sample.json"

    public static void main(String[] args) throws IOException, MalformedURLException {
        URL url = new URL(JSON_URL)
        InputStream urlStream = null
        try {
            urlStream = url.openStream()
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream))
            JsonSlurper jsonSlurper = new JsonSlurper()
            Object result = jsonSlurper.parse(reader)

            Map jsonResult = (Map) result
            Map user = (Map) jsonResult.get("user")
            String name = (String) user.get("name")
            Integer age = (Integer) user.get("age")
            List interests = (List) user.get("interests")

            assert name.equals("mrhaki")
            assert age == 38
            assert interests.size() == 2
            assert interests.get(0).equals("Groovy")
            assert interests.get(1).equals("Grails")

        } finally {
            if (urlStream != null) {
                urlStream.close()
                }
            }

        }
}