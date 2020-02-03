package main.com.ttao.tutorialspoint._12Lists

// 创建一个由原始元素组成的新List，而不包含集合中未指定的元素。
// https://www.tutorialspoint.com/groovy/groovy_lists_minus.htm

class _05minus {
    static void main(String[] args) {
        def lst = [11, 12, 13, 14]
        def newlst = []

        newlst = lst.minus([12,13])

        println( newlst )   // --> [11, 14]
    }
}
