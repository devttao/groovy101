package main.com.ttao.tutorialspoint._07FileIO

class GettingFileSize {
    static void main(String[] args) {
        File file = new File("src/main/resources/Example.txt")
        println "The file ${file.absolutePath} has ${file.length()} bytes"
    }
}
