package mod6_oop.lesson9_interface_and_polymorphism

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {


    val student: Person =
        Student("Harry Potter", "Gryffindor", 1)
    val teacher = Teacher(name = "Severus Snape", "Slytherin")
    teacher.subjectTaught = "Potions"

    student.saySomething()
    teacher.saySomething()


}