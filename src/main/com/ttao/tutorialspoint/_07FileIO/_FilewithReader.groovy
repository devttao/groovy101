package main.com.ttao.tutorialspoint._07FileIO

class _FilewithReader {
    static void main(String[] args) {
        File file = new File('src/main/resources/Example.txt')
        def line, noOfLines = 0;
        file.withReader { reader ->
            while ((line = reader.readLine()) != null) {
                println "${line}"
                noOfLines++

                // 忽略空行
                if(line.trim().length() > 0) {
                    println "print non-blank line: ${line}"
                }
            }
        }

        new File("src/main/resources/Example.txt").eachLine { line2 ->
            println line2
        }


        File file2 = new File("src/main/resources/Example.txt")
        def lines = file2.readLines()
        println(lines[3])
        for (i in lines) {
            println(i)
        }

        def list = new File("src/main/resources/Example.txt").collect {it}
        println(list)

        def array = new File("src/main/resources/Example.txt") as String[]
        println(array)

        String utf8Content = file2.getText("UTF-8")
        println(utf8Content)




    }
}
