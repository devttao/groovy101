package main.com.ttao.tutorialspoint._13Maps


class _11Collect {
    static void main(String[] args) {
        def map = [
                1: [name:"Jerry", age: 42, city: "New York"],
                2: [name:"Long", age: 25, city: "New York"],
                3: [name:"Dustin", age: 29, city: "New York"],
                4: [name:"Dustin", age: 34, city: "New York"]]

        def names = map.collect{entry -> entry.value.name}
        println(names)

        def uniqueNames = map.collect([] as HashSet){entry -> entry.value.name}
        println(uniqueNames)

        def idNames = map.collectEntries{key, value -> [key, value.name]}
        println(idNames)

        def below30Names = map.findAll{it.value.age < 30}.collect{key, value -> value.name}
        println(below30Names)
    }
}
