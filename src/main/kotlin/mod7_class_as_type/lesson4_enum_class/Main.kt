package mod7_class_as_type.lesson4_enum_class

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    val student=Student("Harry Potter", HogwartsHouse.GRIFFINDOR)
    val student2=Student("Cedric Diggory", HogwartsHouse.HUFFLEPUFF)


   println("The founder of ${HogwartsHouse.GRIFFINDOR} is ${HogwartsHouse.GRIFFINDOR.founder}")
   println("The founder of ${HogwartsHouse.SLYTHERIN} is ${HogwartsHouse.SLYTHERIN.founder}")
   println("The founder of ${HogwartsHouse.HUFFLEPUFF} is ${HogwartsHouse.HUFFLEPUFF.founder}")
   println("The founder of ${HogwartsHouse.RAVENCLAW} is ${HogwartsHouse.RAVENCLAW.founder}")

    println("The list of Hogwarts houses: ${HogwartsHouse.values().joinToString(",")}")

}