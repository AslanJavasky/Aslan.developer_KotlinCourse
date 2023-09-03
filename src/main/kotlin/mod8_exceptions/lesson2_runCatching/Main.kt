package mod8_exceptions.lesson2_runCatching

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    val students = listOf("Harry Potter", "Neville Longbottom")
    val student = runCatching { students[5] }

    student.isSuccess
    student.isFailure
    student.getOrNull()
    student.exceptionOrNull()

}
