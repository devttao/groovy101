package main.com.ttao.tutorialspoint._03Operators

/*
位运算符
 */
class BitwiseOperators {
    static void main(String[] args) {
        int a = 00111100
        int b = 00001101
        int x

        println(Integer.toBinaryString(a&b))
        println(Integer.toBinaryString(a|b))
        println(Integer.toBinaryString(a^b))

        a=~a
        println(Integer.toBinaryString(a))
    }
}
