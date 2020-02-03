package main.com.ttao.tutorialspoint._20Closures

class _05ClosuresWithMaps {
    static void main(String[] args) {
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        mp.each {println it}
        mp.each {println "${it.key} maps to: ${it.value}"}
    }
}
