package main.com.ttao.tutorialspoint._10Strings

// 按字典顺序比较两个字符串，忽略大小写差异。

class _06compareToIgnoreCase {
    static void main(String[] args) {
        String str1 = "Hello World"
        String str2 = "HELLO WORLD"
        String str3 = "HELLO World World"

        System.out.println(str1.compareToIgnoreCase( str2 ))
        System.out.println(str2.compareToIgnoreCase( str3 ))
        System.out.println(str3.compareToIgnoreCase( str1 ))
    }
}
