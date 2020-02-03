package main.com.ttao.tutorialspoint._10Strings


/*
- https://www.tutorialspoint.com/groovy/groovy_split.htm
 */

class _22split {
    static void main(String[] args) {
        String a = "Hello-World"
        String[] str
        str = a.split('-')

        for( String values : str )
            println(values)

        println(str[0])
    }
}
