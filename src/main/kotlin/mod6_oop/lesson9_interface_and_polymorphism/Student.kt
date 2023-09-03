package mod6_oop.lesson9_interface_and_polymorphism

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Student(
    name: String, house: String, var courseNumber: Int
) : Person(name, house) {

    fun getAgeField() = super.age


    override fun saySomething() {
        println("Hi, My name is ${super.name} and I'm a student of Hogwarts!")
    }


}