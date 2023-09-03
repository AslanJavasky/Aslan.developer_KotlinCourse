package mod8_exceptions.lesson3_custom_exception

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    val harry=Student("Harry Potter","Gryffindor")
    val crabbe=Student("Vincent Crabbe","Slytherin")

    try {
        enterToGryffindorCommonRoom(crabbe)
    }catch (e:AccessToTheGryffindorCommonRoomException){}


}

fun enterToGryffindorCommonRoom(student:Student){
    if (student.house=="Gryffindor"){
        println("The ${student.name} has entered to Griffindor room!")
    }else{
        throw AccessToTheGryffindorCommonRoomException(
            "The student ${student.name} from house ${student.house} " +
                    "tried to get into the Gryffindor common room!"
        )
    }
}