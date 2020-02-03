package main.com.ttao.tutorialspoint._19Traits

class _04ExtendingTraits {
    static void main(String[] args) {
        Student4 st = new Student4();
        st.StudentID = 1;
        println(st.DisplayMarks());
    }
}

trait Marks4 {
    void DisplayMarks() {
        println("Marks1");
    }
}

trait Total4 extends Marks4 {
    void DisplayMarks() {
        println("Total");
    }
}

class Student4 implements Total4 {
    int StudentID
}
