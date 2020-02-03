package main.com.ttao.tutorialspoint._20Closures

class _01FormalParameters {
    static void main(String[] args) {
        // 在上面的代码示例中，请注意${param}的使用，这会导致闭包采用参数。
        def clos = {param -> println "Hello ${param}"}
        clos.call("World")


        // 可以使用称为它的隐式单个参数 it 。
        def clos2 = {println "Hello ${it}"}
        clos2.call("World")

    }
}
