package mod6_oop.lesson8_abstract

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {


    val student =
        Student("Harry Potter", "Gryffindor", 1)
    val teacher = Teacher(name = "Severus Snape", "Slytherin")
    teacher.subjectTaught = "Potions"
    student.setAgeField(11)
    println(student.getAgeField())
    teacher.setAgeField(45)
    println(teacher.getAgeField())


}