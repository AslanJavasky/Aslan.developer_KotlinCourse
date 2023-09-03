package mod6_oop.lesson6_inheritance

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Teacher : Person {
    constructor(name: String, house: String) : super(name, house)

    var subjectTaught = ""
}