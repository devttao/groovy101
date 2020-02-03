package main.com.ttao.tutorialspoint._09Numbers

class _03equals {
    static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;

        //Comparison against an Integer of different value
        System.out.println(x.equals(y));

        //Comparison against an Integer of same value
        System.out.println(x.equals(z));
    }
}
