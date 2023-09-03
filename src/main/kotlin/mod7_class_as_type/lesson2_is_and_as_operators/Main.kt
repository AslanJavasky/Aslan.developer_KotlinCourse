package mod7_class_as_type.lesson2_is_and_as_operators

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    val student:Person=Student()
    val person:Student?=Person() as? Student

    println(student is Person)

}