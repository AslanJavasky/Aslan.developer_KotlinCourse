package mod6_oop.lesson3_init

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    val person = Person("Harry Potter" to "Gryffindor")
    val person2 = Person("Draco Malfoy", "Slytherin")
    println(person.house)
    println(person2.house)
}