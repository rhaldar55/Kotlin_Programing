fun main() {

    var name: String? = null
    val rollNo: Int? = null


    //1. Safe call (?.)
    //Returns the length if 'name' is null else returns NULL
    //Use it if you don't mind getting NULL value


    println("The length of name is ${name?.length}")
    //name = "RH"
    println("The length of name is ${name?.length}")



    //2. Safe call with let (?.let)
    //It execute the block ONLY IF name is NOT NULL
    name?.let {
        println("The length of name is ${name?.length}")
    }

    //3. Elvis-operator (?:)
    //when we have nullable reference 'name', we can say "is anem is not null", use ie,
    //otherwise use some non-null value
    val  len = if (name!=null)
                    name.length
                else
                    -1
    //name = "RH"
    val length = name?.length ?: -1
    println("The length of name is $length")


    //4. Non-null assertion operator (!!)
    //Use it when you are sure the value is NOT NULL
    //Thtough NullPointerExpection if thr value is found to be NULL

    name = "RH"
    println("The length of name is ${name!!.length}")

}

