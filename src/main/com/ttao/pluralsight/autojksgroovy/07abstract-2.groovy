package main.com.ttao.pluralsight.autojksgroovy

abstract class User_2 {
    String lastName
    String firstName

    String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }
}

class Artist extends User_2 {
    public String[] Songs
}

//public class Producer extends User_2{
//    public void Produce(){}
//}

User_2[] users = [new Artist(firstName: "Bob", lastName: "Dylan", Songs: ["It's Alright Ma"]),
//                  new Producer(firstName: "Jeff", lastName: "Lynne", Songs: ["Fire on High"]),
                  new Artist(firstName: "Roy", lastName: "Orbison", Songs: ["Crying"]),
                  new Artist(firstName: "George", lastName: "Harrison", Songs: ["Wah Wah"]),
                  new Artist(firstName: "Tom", lastName: "Petty", Songs: ["Running Down the Dream"])]

users.each({ user -> println("UserName is ${user.UserName()}") })