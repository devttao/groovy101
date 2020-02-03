package main.com.ttao.tutorialspoint._19Traits

class _01ImplementingInterfaces {
    static void main(String[] args) {
        Student1 st = new Student1();
        st.StudentID = 1;
        st.Marks1 = 10;

        println(st.DisplayMarks());
        println(st.DisplayTotal());
    }
}

interface Total {
    void DisplayTotal()
}

trait Marks1 implements Total {
    void DisplayMarks() {
        println("Display Marks");
    }

    void DisplayTotal() {
        println("Display Total");
    }
}

class Student1 implements Marks1 {
    int StudentID
    int Marks1;
}
