package main.com.ttao.tutorialspoint._07FileIO

class _ReadingEachLine {
    static void main(String[] args) {
        def lines = []

        new File('src/main/resources/ioInput.text').eachLine { line ->
            lines.add(line)

        println(lines)
        }
    }
}
