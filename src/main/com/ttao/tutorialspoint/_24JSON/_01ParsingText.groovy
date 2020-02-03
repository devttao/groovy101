package main.com.ttao.tutorialspoint._24JSON

import groovy.json.JsonSlurper

class _01ParsingText {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "5"}')

        println(object.name);
        println(object.ID);
    }
}
