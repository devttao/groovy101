package main.com.ttao.tutorialspoint._20Closures

class _08anyAndevery {
    static void main(String[] args) {
        def lst = [1,2,3,4];
        def value;

        // Is there any value above 2
        value = lst.any{element -> element > 2}
        println(value);

        // Is there any value above 4
        value = lst.any{element -> element > 4}
        println(value);


        def lst2 = [1,2,3,4];
        def value2;

        // Are all value above 2
        value2 = lst2.every{element -> element > 2}
        println(value2);

        // Are all value above 4
        value2 = lst2.every{element -> element > 4}
        println(value2);
        def largelst = [4,5,6];

        // Are all value above 2
        value2 = largelst.every{element -> element > 2}
        println(value2);
    }
}
