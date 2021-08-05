fun main() {

    //Rangs
    val r1 = 1..5
    //This range contains the number 1,2,3,4,5

    val r2 = 5 downTo 1
    //This range contains the number 5,4,3,2,1

    val r3 = 5 downTo 1 step  2
    //This range contains the number 5,3,1

    val r4 = 1..5 step 2
    //This range contains the number 1,3,5

    var r5 = "a".."z"
    //"a", "b", ....."z"

    //
    var isPresent = "a" in r5

    var countDown = 10.downTo(1)    //10,9,8,7....1
    var moveUp = 10.rangeTo(1)     //1,2,3...10



}