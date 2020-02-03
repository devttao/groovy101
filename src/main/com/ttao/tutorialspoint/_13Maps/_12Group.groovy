package main.com.ttao.tutorialspoint._13Maps


class _12Group {
    static void main(String[] args) {
        def map = [1:20, 2: 40, 3: 11, 4: 93]

        def subMap = map.groupBy{it.value % 2}
        println(subMap)

        def keySubMap = map.subMap([1,2])
        println(keySubMap)
    }
}
