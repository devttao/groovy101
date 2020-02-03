package main.com.ttao.tutorialspoint._02Variables

/*
https://www.tutorialspoint.com/groovy/groovy_variables.htm
 */

class _02Variable {
    static void main(String[] args) {
        // x is defined as a variable
        String x = "Hello"

        // The value of the variable is printed to the console
        println(x)

        println("-"*50)
//Naming Variables
        // Defining a variable in lowercase
        int x1 = 5

        // Defining a variable in uppercase
        int X1 = 6

        // Defining a variable with the underscore in it's name
        def _Name = "Joe"

        println(x1)
        println(X1)
        println(_Name)

        println("-"*50)
//Printing Variables

        //Initializing 2 variables
        int x2 = 5
        int X2 = 6

        //Printing the value of the variables to the console
        println("The value of x is " + x2 + "The value of X is " + X2)

    }
}

