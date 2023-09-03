package mod5_collections.lesson1_array

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    var arrStudents = arrayOf("Harry", "Hermione", "Ron")
    var arrNums = arrayOf(4, 8, 15, 16, 23, 42)

    arrStudents.set(0, "Severus")

    for (element in arrStudents) {
        println(element)
    }

    for (i in arrNums.indices) {
        println(arrNums[i])
    }

}