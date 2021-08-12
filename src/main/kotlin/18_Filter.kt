fun main() {

    val myNumbers: List<Int> = listOf(2, 8, 6, 3, 23)

    //Filter
    val mySmallNums = myNumbers.filter { v -> v < 10 }
    //val mySmallNums = myNumbers.filter { it<10 }

    for (num in mySmallNums) {
        println(num)
    }
    println("------------------")
    //Map
    val mySquaredNums = myNumbers.map { num -> num * num }
    //val mySquaredNums = myNumbers.map { it*it }

    for (num in mySquaredNums) {
        println(num)
    }

    println("------------------")
    //Filter and Map
    val mySmallSqquaredNums = myNumbers.filter { it < 10 }.map { it * it }
    for (num in mySmallSqquaredNums) {
        println(num)
    }

    println()
    var people = listOf<Person5>(Person5(10, "RH"), Person5(15, "RK"), Person5(12, "PK"))
    //var names = people.map { it.name }
    var names = people.filter { it.name.startsWith("R") }.map { it.name }

    for (name in names) {
        println(name)
    }

}


class Person5(var age: Int, var name: String) {

}

