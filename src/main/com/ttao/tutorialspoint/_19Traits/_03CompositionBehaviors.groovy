package main.com.ttao.tutorialspoint._19Traits

class _03CompositionBehaviors {
    static void main(String[] args) {
        Student3 st = new Student3();
        st.StudentID = 1;

        println(st.DisplayMarks());
        println(st.DisplayTotal());
    }
}

trait Marks3 {
    void DisplayMarks() {
        println("Marks1");
    }
}

trait Total3 {
    void DisplayTotal() {
        println("Total");
    }
}

class Student3 implements Marks3,Total3 {
    int StudentID
}
