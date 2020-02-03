package main.com.ttao.tutorialspoint._09Numbers
/*
- https://www.tutorialspoint.com/groovy/groovy_parseint.htm
 */


class _06parseInt {
    static void main(String[] args) {
        int x = Integer.parseInt("9")
        double y = Double.parseDouble("5")

        System.out.println(x)
        System.out.println(y)

        int z = Integer.parseInt("444",16) // 16 进制
        System.out.println(z)
    }
}
