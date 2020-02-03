package main.com.ttao.tutorialspoint._10Strings
// 处理给定String的每个正则表达式组（请参阅下一节）匹配的子字符串。
class _08eachMatch {
    static void main(String[] args) {
        String s = "HelloWorld"

        s.eachMatch(".") {
            ch -> println ch
        }
    }
}
