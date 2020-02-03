package main.com.ttao.tutorialspoint._07FileIO

class TestFileIsDirectory {
    static void main(String[] args) {
        def file = new File('/Users/kutao/tmp/')

        println "File? ${file.isFile()}"

        println "Directory? ${file.isDirectory()}"
    }
}
