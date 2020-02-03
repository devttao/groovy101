package main.com.ttao.tutorialspoint._10Strings

// 不考虑大小写，将此字符串与另一个字符串进行比较。
class _10equalsIgnoreCase {
    static void main(String[] args) {
        String a = "Hello World"
        String b = "HELLO World"
        String c = "HELLO WORLD"
        String d = "HELLO  WORLD"

        println(a.equalsIgnoreCase(b))
        println(a.equalsIgnoreCase(c))
        println(b.equalsIgnoreCase(c))
        println(b.equalsIgnoreCase(d))
    }
}
