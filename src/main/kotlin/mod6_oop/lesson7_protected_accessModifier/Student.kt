package mod6_oop.lesson7_protected_accessModifier

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Student(
    name: String, house: String, var courseNumber: Int
) : Person(name, house) {

    fun getAgeField() = super.age
}