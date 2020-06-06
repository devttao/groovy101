package main.com.ttao.pluralsight.autojksgroovy

abstract class User3 {
    String lastName
    String firstName

    String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }
}

class Artist3 extends User3 {
    public String[] Songs
}

class Producer extends User3 {
    void Produce() {
        println("Album COMPLETE")
    };
}

User3[] users = [new Artist3(firstName: "Bob", lastName: "Dylan", Songs: ["It's Alright Ma"]),
                 new Producer(firstName: "Jeff", lastName: "Lynne"),
                 new Artist3(firstName: "Roy", lastName: "Orbison", Songs: ["Crying"]),
                 new Artist3(firstName: "George", lastName: "Harrison", Songs: ["Wah Wah"]),
                 new Artist3(firstName: "Tom", lastName: "Petty", Songs: ["Running Down the Dream"])]

users.each { user ->
    if (user instanceof Artist3) {
        println("UserName is ${user.UserName()}")
        user.Songs.each {
            println("${it}")
        }
    } else {
        user.Produce()
    }
}