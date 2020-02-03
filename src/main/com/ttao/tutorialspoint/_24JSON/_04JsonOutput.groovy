package main.com.ttao.tutorialspoint._24JSON

import groovy.json.JsonOutput

class _04JsonOutput {
    static void main(String[] args) {
        def output = JsonOutput.toJson([name: 'John', ID: 1])
        println(output)


        def output_stu = JsonOutput.toJson([ new Student(name: 'John',ID:5),
                                         new Student(name: 'Mark',ID:6)])
        println(output_stu)
    }
}


class Student {
    String name
    int ID
}