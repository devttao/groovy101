package main.com.ttao.tutorialspoint._04Loops

class ContinueStatement {
    static void main(String[] args) {
        int[] array = [0,1,2,3]

        for(int i in array) {
            if(i == 2)
                continue
            println(i)
        }
    }
}
