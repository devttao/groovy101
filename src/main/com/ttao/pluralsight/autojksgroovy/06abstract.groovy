abstract class User2 {
    String lastName
    String firstName

    String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }
}

class Artist extends User2 {
    public String[] Songs
}

//class Producer extends User2 {
//    void Produce() {}
//}

User2[] users = [new Artist(firstName: "Bob", lastName: "Dylan"),
                 new Artist(firstName: "Jeff", lastName: "Lynne"),
                 new Artist(firstName: "Roy", lastName: "Orbison"),
                 new Artist(firstName: "George", lastName: "Harrison"),
                 new Artist(firstName: "Tom", lastName: "Petty")]

users.each({ user -> println("UserName is ${user.UserName()}") })