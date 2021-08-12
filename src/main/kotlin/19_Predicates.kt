fun main() {

    val myNumber = listOf(2, 3, 6, 88, 9, 45)

    //myNumber.all { num -> num>10 }
    val check1 = myNumber.all { it > 10 }  //All element greater than 10?

    println(check1)

    val check2: Boolean = myNumber.any({ it > 10 }) // Does any of these elements satisfy the prediction
    println(check2)

    val totalCount: Int = myNumber.count({ it > 10 })
    println(totalCount)

    val num = myNumber.find { it > 10 }
    println(num)


    //Predicate as lambda var
    val myLambdaPredicate = { num :Int -> num > 10 }
    val check4 = myNumber.all (myLambdaPredicate)
    val num1 = myNumber.find (myLambdaPredicate)
    println(check4)
    println(num1)

}

