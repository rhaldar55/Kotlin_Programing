//with, let, run, apply, also


class Person6 {
    var name: String = "RH"
    var age: Int = 26
}

fun main() {
    //Scope Function : 'with'
    //Property 1: Refer to context object by using 'this'
    //Property 2: The return value is the 'lambda result'

    val person = Person6()
    println(person.name)
    println(person.age)

    val afterAgeChange: Int = with(person) {
        println(this.name)
        println(this.age)

        println(name)
        println(name)

        //return
        age + 5
    }


    //Scope Function : 'apply'
    //Property 1: Refer to context object by using 'this'
    //Property 2: The return value is the 'context object'

    val person1 = Person6()
    person.name = "NK"
    person.age = 25

    val person2 = Person6().apply {
        name = "NK"
        age = 25
    }

    //Scope Function : 'also'
    //Property 1: Refer to context object by using 'it'
    //Property 2: The return value is the 'context object'

    val numberList: MutableList<Int> = mutableListOf(1, 3, 2)

    numberList.also {
        //println("elements are : $numberList")
        println("elements are : $it")

        numberList.add(7)
        // println("elements are : $numberList")
        println("elements are : $it")

        //numberList.remove(2)
        println("elements are : $it")
    }


    //Scope Function : 'apply'
    //Property 1: Refer to context object by using 'this'
    //Property 2: The return value is the 'context object'

    val person4 = Person6().apply {
        name = "NK"
        age = 25
    }

    with(person4) {
        println(name)
        println(age)
    }

    //Perform some other operation on 'person6' object
    person4.also {
        it.name = "RHRH"
        println("New name ${it.name}")
    }

    //Scope Function : 'let'
    //Property 1: Refer to context object by using 'it'
    //Property 2: The return value is the 'lambda result'

    //Use 'let'  function to avoid NullPointerExpection
    //val name:String? = null
    val name:String? = "HELLO"

    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        println(it.length)
        it.length
    }



    //Scope Function : 'run'
    //Property 1: Refer to context object by using 'this'
    //Property 2: The return value is the 'lambda result'
    //'run' is combition of 'with' and 'let'

    //operate a Nullable object and avoid NullPointerExpection

    //val person5 : Person6? = null
    val person5 : Person6? = Person6()

    val bio =person5?.run {
        println(name)
        println(age)
        "Return data"
    }


}
