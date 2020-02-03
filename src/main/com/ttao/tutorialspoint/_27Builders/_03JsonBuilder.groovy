package main.com.ttao.tutorialspoint._27Builders

def builder = new groovy.json.JsonBuilder()

def root = builder.students {
    student {
        studentname 'Joe'
        studentid '1'

        Marks(
                Subject1: 10,
                Subject2: 20,
                Subject3:30,
        )
    }
}
println(builder.toString());

// ---------------------------------------------------

def builder2 = new groovy.json.JsonBuilder()

class Student {
    String name
}

def studentlist = [new Student (name: "Joe"), new Student (name: "Mark"),
                   new Student (name: "John")]

builder2 studentlist, { Student student ->name student.name}
println(builder2)