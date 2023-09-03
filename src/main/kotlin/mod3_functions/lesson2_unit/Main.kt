package mod3_functions.lesson2_unit

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    val anonymous: (Int, Int) -> Unit = { a: Int, b: Int -> println(a * b) }

    val greeting: (String) -> Unit = { println("Hello, $it") }

    greeting("Aslan")


}

