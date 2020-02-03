package main.com.ttao.tutorialspoint._20Closures

class _06find {
    static void main(String[] args) {
        def lst = [1,2,3,4]
        def value

        value = lst.find {element -> element > 2}
        println(value)
    }
}
