package main.com.ttao.tutorialspoint._17ObjectOriented

class Interfaces {
    static void main(String[] args) {
        Student8 st = new Student8()
        st.StudentID = 1
        st.Marks1 = 10
        println(st.DisplayMarks())
    }
}

interface Marks {
    void DisplayMarks()
}

class Student8 implements Marks {
    int StudentID
    int Marks1

    void DisplayMarks() {
        println(Marks1)
    }
}
