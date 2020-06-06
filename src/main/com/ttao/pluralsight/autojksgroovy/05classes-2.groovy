package main.com.ttao.pluralsight.autojksgroovy

class User1 {
    String lastName
    String firstName

    String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }
}

User1[] users = [new User1(firstName: "Bob", lastName: "Dylan"),
                 new User1(firstName: "Jeff", lastName: "Lynne"),
                 new User1(firstName: "Roy", lastName: "Orbison"),
                 new User1(firstName: "George", lastName: "Harrison"),
                 new User1(firstName: "Tom", lastName: "Petty")]

users.each({ user -> println("UserName is ${user.UserName()}") })