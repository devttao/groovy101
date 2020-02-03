package main.com.ttao.tutorialspoint._17ObjectOriented

class Student2 {
    private int StudentID
    private String StudentName

    void setStudentID(int pID) {
        StudentID = pID
    }

    void setStudentName(String pName) {
        StudentName = pName
    }

    int getStudentID() {
        return this.StudentID
    }

    String getStudentName() {
        return this.StudentName
    }

    static void main(String[] args) {
        Student2 st = new Student2()
        st.setStudentID(1)
        st.setStudentName("Joe")

        println(st.getStudentID())
        println(st.getStudentName())
    }
}
