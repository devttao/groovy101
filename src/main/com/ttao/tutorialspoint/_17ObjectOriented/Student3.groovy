package main.com.ttao.tutorialspoint._17ObjectOriented

class Student3 {
    int StudentID
    String StudentName

    int Marks1
    int Marks2
    int Marks3

    int Total() {
        return Marks1+Marks2+Marks3
    }

    static void main(String[] args) {

//        Instance Methods

        Student3 st = new Student3()
        st.StudentID = 1
        st.StudentName="Joe"

        st.Marks1 = 10
        st.Marks2 = 20
        st.Marks3 = 30

        println(st.Total())
    }
}
