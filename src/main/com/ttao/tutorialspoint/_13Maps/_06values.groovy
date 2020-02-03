package main.com.ttao.tutorialspoint._13Maps

class _06values {
    static void main(String[] args) {
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        println(mp.values());
        println(mp.TopicName)
        println(mp.TopicDescription)

        println("-"*15 + " print entry " + "-"*15 )
        mp.each{entry -> println "$entry.key: $entry.value"}

        println("-"*15 + " print eachWithIndex " + "-"*15 )
        mp.eachWithIndex{entry, i -> println "$i $entry.key: $entry.value"}

        println("-"*15 + " key, value, and index be supplied separately " + "-"*15 )
        mp.eachWithIndex{key, value, i -> println "$i $key: $value"}



    }
}
