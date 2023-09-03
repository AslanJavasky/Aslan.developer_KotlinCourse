package mod5_collections.lesson2_list

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {
    var arrStudents = mutableListOf("Harry", "Hermione", "Ron")
    arrStudents.add("Severus")

    println(arrStudents[0])
    println(arrStudents.size)
    println(arrStudents.joinToString(","))
    println(arrStudents.joinToString(";"))


//    for (element in arrStudents) {
//        println(element)
//    }


}
