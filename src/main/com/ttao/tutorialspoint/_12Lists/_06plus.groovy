package main.com.ttao.tutorialspoint._12Lists

// 创建一个由原始元素以及集合中指定的元素组成的新List。

class _06plus {
    static void main(String[] args) {
        def lst = [11, 12, 13, 14];
        def newlst = [];

        newlst = lst.plus([15,16]);

        println(newlst);
    }

}
