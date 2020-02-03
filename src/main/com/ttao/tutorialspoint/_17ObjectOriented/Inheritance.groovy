package main.com.ttao.tutorialspoint._17ObjectOriented

class Inheritance {
    static void main(String[] args) {
        Student5 st = new Student5()
        st.StudentID = 1

        st.Marks1 = 10
        st.name = "Joe"

        println(st.name)
    }
}

class Person {
    public String name
    public Person() {}
}

class Student5 extends Person {
    int StudentID
    int Marks1

    public Student5() {
        super()
    }
}
