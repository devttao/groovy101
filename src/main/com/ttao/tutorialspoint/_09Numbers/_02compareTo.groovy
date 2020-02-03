package main.com.ttao.tutorialspoint._09Numbers

/*
- https://www.tutorialspoint.com/groovy/groovy_compareto.htm

Syntax:
    public int compareTo( NumberSubClass referenceName )
Parameters:
    referenceName - This could be a Byte, Double, Integer, Float, Long or Short.

Return Value:
    If the Integer is equal to the argument then 0 is returned.
    If the Integer is less than the argument then -1 is returned.
    If the Integer is greater than the argument then 1 is returned.

 */

class _02compareTo {
    static void main(String[] args) {
        Integer x = 5;

        //Comparison against a Integer of lower value
        System.out.println(x.compareTo(3));

        //Comparison against a Integer of equal value
        System.out.println(x.compareTo(5));

        //Comparison against a Integer of higher value
        System.out.println(x.compareTo(8));
    }

}
