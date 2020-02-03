package main.com.ttao.tutorialspoint._16Exception

class _02MultipleCatch {
    static void main(String[] args) {
        try {
            def arr = new int[3]
            arr[5] = 5
        }catch(ArrayIndexOutOfBoundsException ex) {
            println("Catching the Array out of Bounds exception")
        }catch(Exception ex) {
            println("Catching the exception")
        }

        println("Let's move on after the exception")
    }
}
