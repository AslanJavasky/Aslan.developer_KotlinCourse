package mod6_oop.lesson3_init

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Person(
    var name: String,
    var house: String
) {

    init {
        println("init1")
        house = "$house (Hogwarts)"
    }

    constructor(
        nameAndHouse: Pair<String, String>
    ) : this(name = nameAndHouse.first, house = nameAndHouse.second)

    init {
        println("init2")
    }


    fun setNewName(name: String) {
        this.name = name
    }

}