package main.com.ttao.tutorialspoint._07FileIO

class ReadingFiles {
    static void main(String[] args) {
        new File("src/main/resources/Example.txt").eachLine {
            line -> println "line : $line"
        }
    }
}


// The method eachLine is in-built in the File class in Groovy for the purpose of ensuring that each line of the text file is read

/// https://www.baeldung.com/groovy-file-read