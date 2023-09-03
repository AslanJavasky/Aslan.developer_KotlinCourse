package mod7_class_as_type.lesson1_comparison_by_ref_and_by_value

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    val object1=Student()
    val object2=Student()
    val object3=object1

    println(object1 === object2)//false
    println(object1 === object3)//true
    println(object1.courseNumber == object2.courseNumber
            &&object1.name == object2.name
            &&object1.house == object2.house
    )

}