package main.com.ttao.tutorialspoint._17ObjectOriented

class InnerClasses {
    static void main(String[] args) {
        Outer outobj = new Outer()
        outobj.name = "Joe"
        outobj.callInnerMethod()
    }
}

class Outer {
    String name

    def callInnerMethod() {
        new Inner().methodA()
    }

    class Inner {
        def methodA() {
            println(name)
        }
    }

}
