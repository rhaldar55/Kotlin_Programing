fun main() {

    //FOR LOOP
    for(i in 1..4){
        println("Hello")
    }

    //WHILE LOOP
    var i: Int = 1
    while (i<10){
        println(i)
        i++
    }

    //DO WHILE LOOP
    var j: Int = 1
    do{
        println(j)
        j++
    }while (j<5)


    //BREAK
    for(i in 1..10){
        println(i)
        if(i==5)
            break
    }
}