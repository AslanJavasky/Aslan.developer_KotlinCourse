package mod6_oop.lesson9_interface_and_polymorphism

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Teacher : Person {
    constructor(name: String, house: String) : super(name, house)

    var subjectTaught = ""
    fun getAgeField() = super.age


    override fun saySomething() {
        println("Hi, My name is ${super.name} and I'm a teacher of Hogwarts school!")
    }


}