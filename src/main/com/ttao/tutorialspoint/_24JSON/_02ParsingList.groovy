package main.com.ttao.tutorialspoint._24JSON

import groovy.json.JsonSlurper

class _02ParsingList {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
        lst.each { println it }
    }
}
