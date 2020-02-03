package main.com.ttao.tutorialspoint._07FileIO

class WritingFiles {
    static void main(String[] args) {
        new File('src/main/resources/','Example.txt').withWriter('utf-8') {
            writer -> writer.writeLine 'Hello World'
        }
    }
}
