package main.com.ttao.tutorialspoint._24JSON

import groovy.json.*

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

def json = new JsonSlurper().parseText(jsonText)

def header = json.message.header
assert header.from == 'mrhaki'
assert header.to[0] == 'Groovy Users'
assert header.to[1] == 'Java Users'
assert json.message.body == "Check out Groovy's gr8 JSON support."


def paramsList = []
def entryNum = 50
// get mop.json from jenkins master archive
def mop_file_path = "/Users/kutao/code/github.com/devttao/groovy101/src/main/resources/mop.json"
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parse(new File(mop_file_path))
object.eachWithIndex { it, i ->
    if ( i < entryNum ) {
        paramsList << it.keySet()[0]
    }
}
println(paramsList.join('\n'))