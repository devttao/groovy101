package main.com.ttao.tutorialspoint._10Strings

// 输出String是否匹配给定的正则表达式。

class _13matches {
    static void main(String[] args) {
        String a = "Hello World"

        println(a.matches("Hello"))
        println(a.matches("Hello(.*)"))
    }
}
