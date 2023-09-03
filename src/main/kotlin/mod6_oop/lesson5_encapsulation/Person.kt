package mod6_oop.lesson5_encapsulation

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Person(
    private var name: String,
    private var house: String
) {
    var points = 0
        private set

    fun increasePoint() {
        points += 10
    }

    fun decreasePoints() {
        points -= 10
    }
}