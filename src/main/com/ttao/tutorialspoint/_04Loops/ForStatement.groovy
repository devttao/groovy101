package main.com.ttao.tutorialspoint._04Loops

class ForStatement {
    static void main(String[] args) {

        for(int i = 0;i<5;i++) {
            println(i)
        }


        // String
        String a = "Hello-World"
        String[] str
        str = a.split('-')

        for( String values : str )
            println(values)
    }
}
