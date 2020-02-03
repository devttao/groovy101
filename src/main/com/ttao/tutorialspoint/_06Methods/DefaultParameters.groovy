package main.com.ttao.tutorialspoint._06Methods

class DefaultParameters {
    static void sum(int a,int b = 5) {
        int c = a+b;
        println(c);
    }

    static void main(String[] args) {
        sum(6);
        sum(6,6);
    }
}
