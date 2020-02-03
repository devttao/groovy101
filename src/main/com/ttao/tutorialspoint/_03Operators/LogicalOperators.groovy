package main.com.ttao.tutorialspoint._03Operators
/*
逻辑运算符
 */
class LogicalOperators {
    static void main(String[] args) {
        boolean x = true
        boolean y = false
        boolean z = true

        println( x && y )
        println(x && z)

        println( x || z )
        println( x || y )
        println( ! x )
    }
}
