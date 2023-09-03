package mod5_collections.lesson3_map

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {
    var students = mutableMapOf<String, Int>(
        "Harry Potter" to 11,
        "Draco Malfoy" to 11,
    )
    students.put("Hermione Granger", 12)


    students.forEach { studentName, house ->
        println("The key is $studentName and value is $house")
    }
}