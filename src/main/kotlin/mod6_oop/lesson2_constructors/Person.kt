package mod6_oop.lesson2_constructors

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Person(
    var name: String,
    var house: String
) {


    constructor(
        nameAndHouse: Pair<String, String>
    ) : this(name = nameAndHouse.first, house = nameAndHouse.second)

    fun setNewName(name: String) {
        this.name = name
    }

}