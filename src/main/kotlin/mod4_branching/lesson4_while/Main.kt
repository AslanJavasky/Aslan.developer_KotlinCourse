package mod4_branching.lesson4_while

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    var knowledge = 200

    var i = 1

    do {
        println("The Lesson $i")
        i++
        knowledge += 20
        if (knowledge == 500) break
        println(knowledge)
    } while (true)


}