package main.com.ttao.tutorialspoint._04Loops

class ForinStatement {
    static void main(String[] args) {
        println("-"*50)
        int[] array = [0,1,2,3]

        for(int i in array) {
            println(i)
        }

        println("-"*50)
        for(int i in 1..5) {
            println(i)
        }

        println("-"*50)
        // for-in语句也可以用于遍历map。以下示例显示了如何完成此操作。
        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

        for(emp in employee) {
            println(emp)
        }

    }
}
