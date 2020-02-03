package main.com.ttao.tutorialspoint._07FileIO

class CopyFiles {
    static void main(String[] args) {
        def src = new File("src/main/resources/Example.txt")
        def dst = new File("src/main/resources/Example2.txt")
        dst << src.text
    }
}
