package main.com.ttao.tutorialspoint._27Builders

def nodeBuilder = new NodeBuilder()

def studentlist = nodeBuilder.userlist {
    user(id: '1', studentname: 'John', Subject: 'Chemistry')
    user(id: '2', studentname: 'Joe', Subject: 'Maths')
    user(id: '3', studentname: 'Mark', Subject: 'Physics')
}

println(studentlist)