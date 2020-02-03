package main.com.ttao.tutorialspoint._10Strings
/*
 https://www.tutorialspoint.com/groovy/groovy_padleft.htm

 用左边的空格填充字符串。
 */

class _16padLeft {
    static void main(String[] args) {
        String a = "Hello World"

        println(a.padLeft(14))
        println(a.padLeft(16))

//        Padding − The character to apply for the padding.
        println(a.padLeft(16,'*'))
        println(a.padLeft(14,'='))
    }
}
