package mod7_class_as_type.lesson3_data_class

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
class Student {

    var name: String = ""
    var house: String = ""


    override fun toString(): String {
        return "Student[name=$name, house=$house]"

    }


}