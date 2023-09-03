package mod6_oop.lesson7_protected_accessModifier

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
open class Person(
    private var name: String,
    private var house: String
) {

    protected var age: Int = 0


    fun setAgeField(value: Int) {
        age = value
    }

    var points = 0
        private set

    fun increasePoint() {
        points += 10
    }

    fun decreasePoints() {
        points -= 10
    }
}