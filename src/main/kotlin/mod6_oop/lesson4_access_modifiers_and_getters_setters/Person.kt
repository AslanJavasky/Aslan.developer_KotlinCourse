package mod6_oop.lesson4_access_modifiers_and_getters_setters

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
class Person(
    _name: String,
    _house: String
) {


    var name: String = _name
        private set


    var house: String = _house
        get() = "The house of student $name is $field"
        set(value) {
            field = "$value (Hogwarts)"
        }

}