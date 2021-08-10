fun main() {
    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    println(user1.toString())
    println(user2.toString())

    if (user1 == user2)
        println("Equal")
    else
        println("Not Equal")

    var newUser = user1.copy()
    println(newUser.toString())
}

 data class User(var  name: String, var id:Int){

}