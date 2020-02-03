package main.com.ttao.tutorialspoint._19Traits

/*
- https://www.tutorialspoint.com/groovy/groovy_traits.htm
 */


class _00Example {
    static void main(String[] args) {
        Student st = new Student();
        st.StudentID = 1;
        st.Marks1 = 10;
        println(st.DisplayMarks());
    }
}

trait Marks {
    void DisplayMarks() {
        println("Display Marks");
    }
}

class Student implements Marks {
    int StudentID
    int Marks1;
}
