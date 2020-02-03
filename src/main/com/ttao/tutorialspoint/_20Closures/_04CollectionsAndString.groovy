package main.com.ttao.tutorialspoint._20Closures

class _04CollectionsAndString {
    static void main(String[] args) {
        def lst = [11, 12, 13, 14]
        lst.each {println it}

        println("The list will only display those numbers which are divisible by 2")
        lst.each{num -> if(num % 2 == 0) println num}
    }
}
