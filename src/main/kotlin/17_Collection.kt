fun main() {

    //simpleArray()
    //listAndArrayList()
    //map()
    set()

}

fun simpleArray() {

    //Array
    var myArray = Array<Int>(5) { 0 }  //Mutable. Fixed Size

    //Element : 0,0,0,0,0
    //Index:    0,1,2,3,4

    myArray[0] = 32        //can change the value
    myArray[3] = 54
    myArray[1] = 11
    //myArray [8] = 11    //ArrayIndexOutOfBoundsException

    println(myArray[3])

    for (element in myArray) {
        println(element)
    }

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }
}


fun listAndArrayList() {
    //List

    var list = listOf<String>("RH", "NK", "SS") //Immutable, Fixed Size, Read Only
    //list[2] = "RR" //can not modify

    for (element in list) {
        println(element)
    }

    for (index in 0..list.size - 1) {
        println(list.get(index))    //println(list[index])
    }


    //var listMutable = mutableListOf<String>("RH", "NK", "SS") //Mutable, No Fixed size, Can Add/Remove
    //var listMutable = mutableListOf<String>()
    //var listMutable = arrayListOf<String>()
    var listMutable = ArrayList<String>()
    listMutable.add("DS")
    listMutable.add("SS")
    listMutable.add("NK")
    listMutable.add("RH")

    listMutable.remove("DS")
    listMutable.add(1, "SH")
    for (element in listMutable) {
        println(element)
    }

    for (index in 0..listMutable.size - 1) {
        println(listMutable.get(index))    //println(list[index])
    }

}

fun map() {
    //KEY-VALUE Pair

    var myMap = mapOf<Int, String>(1 to "RH", 2 to "PK") //Immutable, Fixed Size, READ ONLY
    //var myMap = mapOf<Int, String>()

    for (key in myMap.keys) {
        println(myMap[key]) // println(myMap.get(key))
    }

    var myHashMap = HashMap<Int, String>() //Mutable, NO Fixed Size, READ AND WRITE
    // var myHashMap = mutableMapOf<>()<Int, String>( )
    //var myHashMap = hashMapOf<>()<Int, String>( )
    myHashMap.put(1, "RH")
    myHashMap.put(2, "PK")
    myHashMap.put(3, "SS")

    //myHashMap.replace(2,"BK")
    myHashMap.put(2, "BK")

    for (key in myHashMap.keys) {
        println(myHashMap[key]) // println(myMap.get(key))
    }

}

fun set(){
    //"Set" contains uniqque elements
    //"HashSet" also contain unique elements but Sequence is not gaurantedd in output


    var mySet = setOf<Int>(2,54,8,0,7,7,7,99)   //Immutable, READ ONLY

    for (element in mySet){
        println(element)
    }

    var myMutableSet = mutableSetOf<Int>(2,54,8,0,7,7,7,99) ////Mutable, READ AND WRITE
    var myMutableSet1 = hashSetOf<Int>(2,54,8,0,7,7,7,99) ////Mutable, READ AND WRITE

    myMutableSet.remove(54)
    myMutableSet.add(100)

    for (element in myMutableSet){
        println(element)
    }
}




