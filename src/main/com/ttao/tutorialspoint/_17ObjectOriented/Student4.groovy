package main.com.ttao.tutorialspoint._17ObjectOriented

// Creating Multiple Objects
class Student4 {

    int StudentID
    String StudentName

    int Marks1
    int Marks2
    int Marks3

    int Total() {
        return Marks1+Marks2+Marks3
    }

    static void main(String[] args) {
        Student4 st = new Student4()
        st.StudentID = 1
        st.StudentName = "Joe"

        st.Marks1 = 10
        st.Marks2 = 20
        st.Marks3 = 30

        println(st.Total())

        Student st1 = new Student()
        st.StudentID = 1
        st.StudentName = "Joe"

        st.Marks1 = 10
        st.Marks2 = 20
        st.Marks3 = 40

        println(st.Total())

        Student st3 = new Student()
        st.StudentID = 1
        st.StudentName = "Joe"

        st.Marks1 = 10
        st.Marks2 = 20
        st.Marks3 = 50

        println(st.Total())
    }
}
