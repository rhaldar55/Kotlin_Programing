fun main() {

    var student = Student2()
    student.name = "RAMS"
    println("Student has got a name as ${student.name}")

    var student3 = Student3("RAMS")
    println("Student has got a name as ${student.name}")

}


//CLASS
class Student2 {
    var name: String = "DUMMY NAME"
}

//          Primary Constrctor
class Student3(_name: String) {
    var name: String = "DUMMY"

    //init block
    init {
        this.name = _name
        println("Student has got a name as $name")
    }
}

// Secondary Constrctor
class Student4(var name: String) {

    var id: Int = 1

    //init block
    init {
        println("Student has got a name as $name")
    }

    constructor(name_: String, id: Int) : this(name_) {
        //The body of the Secondry constructor is called after the init block
        this.id = id
    }
}