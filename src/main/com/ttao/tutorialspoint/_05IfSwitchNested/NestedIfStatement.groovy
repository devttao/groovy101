package main.com.ttao.tutorialspoint._05IfSwitchNested
/*
嵌套的if语句
 */
class NestedIfStatement {
    static void main(String[] args) {
        // Initializing a local variable
        int a = 12
        sleep(5)
        //Check for the boolean condition
        if (a>100) {
            //If the condition is true print the following statement
            println("The value is less than 100");

        // Check if the value of a is greater than 5
        } else if (a>5) {
            //If the condition is true print the following statement
            println("The value is greater than 5 and greater than 100");
        } else {
            //If the condition is false print the following statement
            println("The value of a is less than 5");
        }
    }
}


