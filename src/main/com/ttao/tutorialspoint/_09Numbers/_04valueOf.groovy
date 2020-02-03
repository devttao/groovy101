package main.com.ttao.tutorialspoint._09Numbers

/*
- https://www.tutorialspoint.com/groovy/groovy_valueof.htm
 */
class _04valueOf {

    static void main(String[] args) {
        int x = 5;
        Double z = 15.56;

        Integer xNew = Integer.valueOf(x);
        println(xNew);

        Double zNew = Double.valueOf(z);
        println(zNew);
    }
}
