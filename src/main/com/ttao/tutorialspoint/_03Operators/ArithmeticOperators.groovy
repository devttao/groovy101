package main.com.ttao.tutorialspoint._03Operators
/*
算术运算符:
https://www.tutorialspoint.com/groovy/groovy_arithmetic_operators.htm
 */

class ArithmeticOperators {
    static void main(String[] args) {
        // Initializing 3 variables
        def x = 5
        def y = 10
        def z = 8

        //Performing addition of 2 operands
        println(x+y)

        //Subtracts second operand from the first
        println(x-y)

        //Multiplication of both operands
        println(x*y)

        //Division of numerator by denominator
        println(z/x)

        //Modulus Operator and remainder of after an integer/float division
        println(z%x)

        //Incremental operator
        println(x++)

        //Decrementing operator
        println(x--)
    }
}
