package main.com.ttao.tutorialspoint._13Maps

class _07Add {
    static void main(String[] args) {
        def map = [name:"Jerry"]
        map["age"] = 42
        map.city = "New York"

        println(map)
        map.each{entry -> println "$entry.key: $entry.value"}


        println("-"*50)
        def hobbyLiteral = "hobby"
        def hobbyMap = [(hobbyLiteral): "Singing"]
        map.putAll(hobbyMap)

        println(map)
        map.each{entry -> println "$entry.key: $entry.value"}
    }
}
