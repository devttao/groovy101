package main.com.ttao.tutorialspoint._10Strings

/*
- https://www.tutorialspoint.com/groovy/groovy_substring.htm
 */

class _23subString {
    static void main(String[] args) {
        String a = "HelloWorld";
        println(a.substring(4));
        println(a.substring(4,8)); // 不包含 8
    }
}
