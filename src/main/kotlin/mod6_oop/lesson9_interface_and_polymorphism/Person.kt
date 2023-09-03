package mod6_oop.lesson9_interface_and_polymorphism

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
abstract class Person(
    protected var name: String,
    private var house: String
) : Talking {

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