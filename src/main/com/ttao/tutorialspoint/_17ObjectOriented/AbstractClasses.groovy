package main.com.ttao.tutorialspoint._17ObjectOriented

class AbstractClasses {
    static void main(String[] args) {
        Student7 st = new Student7()
        st.StudentID = 1

        st.Marks1 = 10
        st.name="Joe"

        println(st.name)
        println(st.DisplayMarks())
    }
}

abstract class Person2 {
    public String name
    public Person2() { }
    abstract void DisplayMarks()
}

class Student7 extends Person2 {
    int StudentID
    int Marks1

    public Student7() {
        super()
    }

    void DisplayMarks() {
        println(Marks1)
    }
}
