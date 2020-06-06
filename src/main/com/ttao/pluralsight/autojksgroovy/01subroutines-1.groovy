package main.com.ttao.pluralsight.autojksgroovy

static String getUserName(String firstName, String lastName) {
    return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
}

assert getUserName("Dev", "TTao") == "dttao": "getUserName isn't working"

println(getUserName("Dev", "TTao"))

void printCredential(cred) {
    println("UserName is ${cred}")
}

printCredential(getUserName("Dev", "TTao"))

