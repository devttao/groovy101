package main.com.ttao.tutorialspoint._10Strings

// 返回指定子字符串首次出现在此String中的索引。
// https://www.tutorialspoint.com/groovy/groovy_indexof.htm

class _12indexOf {
    static void main(String[] args) {
        String a = "Hello World"

        // Using public int indexOf(int ch)
        println(a.indexOf('e'))
        println(a.indexOf('o'))

        // Using public int indexOf(int ch, int fromIndex)
        println(a.indexOf('l',1))
        println(a.indexOf('e',4))

        // Using public int indexOf(string str)
        println(a.indexOf('el'))
        println(a.indexOf('or'))

        // Using public int indexOf(string str,int fromIndex)
        println(a.indexOf('el',1))
        println(a.indexOf('or',8))
    }
}
