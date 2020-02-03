package main.com.ttao.tutorialspoint._13Maps

// 文字语法或属性符号可用于从地图中获取项目。
class _08Retrieving {
    static void main(String[] args) {
        def map = [name:"Jerry", age: 42, city: "New York", hobby:"Singing"]
        println(map["name"])
        println(map.hobby)

    }
}
