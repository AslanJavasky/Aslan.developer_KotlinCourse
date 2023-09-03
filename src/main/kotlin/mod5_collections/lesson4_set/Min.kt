package mod5_collections.lesson4_set

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {
    var students = mutableMapOf<String, String>(
        "Harry Potter" to "Gryffindor",
        "Draco Malfoy" to "Slytherin",
    )
    students.put("Hermione Granger", "Gryffindor")


    val setOfHouses = mutableSetOf<String>("Gryffindor", "Slytherin", "Hufflepuff")
    setOfHouses.add("Ravenclaw")
    setOfHouses.add("Gryffindor")

    println(setOfHouses)

}