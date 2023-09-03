package mod7_class_as_type.lesson6_generics

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
data class Student<T>(
    val name: String,
    val house: String,
    val age:T
)

