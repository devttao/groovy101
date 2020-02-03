package main.com.ttao.tutorialspoint._20Closures

class _07findAll {
    static void main(String[] args) {
        def lst = [1,2,3,4];
        def value;

        value = lst.findAll {element -> element > 2}
        value.each {println it}
    }
}
