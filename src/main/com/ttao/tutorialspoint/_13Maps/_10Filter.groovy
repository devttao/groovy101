package main.com.ttao.tutorialspoint._13Maps


class _10Filter {
    static void main(String[] args) {
        def map = [name:"Jerry", age: 42, city: "New York", hobby:"Singing"]

        println(map.find{it.value == "New York"}.key == "city")

        println(map.findAll{it.value == "New York"} == [city : "New York"])

        map.grep{it.value == "New York"}.each{it -> println(it.key == "city" && it.value == "New York")}

        map.grep{it.value == "New York"}.each{it -> println(it.key + ":" + it.value )}
    }
}
