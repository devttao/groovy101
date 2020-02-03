package main.com.ttao.tutorialspoint._24JSON

import groovy.json.JsonSlurperClassic

class _06JsonSlurperClassic {
    static void main(String[] args) {
        def jsonText = '''
            {
                "message": {
                    "header": {
                        "from": "mrhaki",
                        "to": ["Groovy Users", "Java Users"]
                    },
                    "body": "Check out Groovy's gr8 JSON support."
                }
            }      
            '''

        def json = new JsonSlurperClassic().parseText(jsonText)
        def header = json.message.header
        println( header.from )
        println(json.message.body)
        println(json.message)
    }
}
