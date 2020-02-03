package main.com.ttao.tutorialspoint._13Maps

class _13ClosuresWithMaps {
    static void main(String[] args) {
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        mp.each {println it}
        mp.each {println "${it.key} maps to: ${it.value}"}
    }
}
