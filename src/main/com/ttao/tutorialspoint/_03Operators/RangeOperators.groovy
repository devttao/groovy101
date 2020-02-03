package main.com.ttao.tutorialspoint._03Operators

//范围运算符

class RangeOperators {
    static void main(String[] args) {
        def range = 5..10
        println(range)
        println(range.get(2))

        for (i in range) {
            println( "i = " + i)
        }
    }
}
