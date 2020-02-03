package main.com.ttao.tutorialspoint._11Ranges
// 布尔值true或false，用于确定范围是否相反。

class _05isReverse {
    static void main(String[] args) {
        // Example of an Integer using def
        def rint = 1..10
        println(rint.isReverse())

        def rint2 = 10..1
        println(rint2.isReverse())
    }
}
