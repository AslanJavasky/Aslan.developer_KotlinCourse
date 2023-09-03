package mod6_oop.lesson5_encapsulation

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    val person = Person("Draco Malfoy", "Slytherin")

    println(person.points)
    person.increasePoint()
    person.increasePoint()
    person.increasePoint()

    println(person.points)

    person.decreasePoints()
    println(person.points)
}