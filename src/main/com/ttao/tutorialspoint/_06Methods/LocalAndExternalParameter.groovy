package main.com.ttao.tutorialspoint._06Methods

class LocalAndExternalParameter {
    static int x = 100

    public static int getX() {
        int lx = 200
        println(lx) //print 200
        return x
    }

    static void main(String[] args) {
        println(getX())  // print 100 (return x)
    }
}
