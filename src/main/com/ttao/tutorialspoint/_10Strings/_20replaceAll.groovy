package main.com.ttao.tutorialspoint._10Strings
// https://www.tutorialspoint.com/groovy/groovy_replaceall.htm

class _20replaceAll {
    static void main(String[] args) {
        String a = "Hello World Hello"
        println(a.replaceAll("Hello","Bye"))
        println(a.replaceAll("World","Hello"))
    }
}
