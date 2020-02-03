package main.com.ttao.tutorialspoint._10Strings


// https://www.tutorialspoint.com/groovy/groovy_padright.htm
class _17padRight {
    static void main(String[] args) {
        String a = "Hello World"

        println(a.padRight(14))
        println(a.padRight(16))
        println(a.padRight(16,'*'))
        println(a.padRight(14,'='))
    }
}
