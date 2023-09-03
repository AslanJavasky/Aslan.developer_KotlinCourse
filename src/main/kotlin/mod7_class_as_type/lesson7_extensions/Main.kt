package mod7_class_as_type.lesson7_extensions

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {
    val student=Student("Harry Potter", "Gryffindor")
    val student2=Student("Draco Malfoy", "Slytherin")

    println("The student ${student.name} is from Gryffindor: ${student.isGriffindor}")
    println("The student ${student2.name} is from Gryffindor: ${student2.isGriffindor}")
}

//fun Student.isGryffindor() : Boolean{
//    return this.house == "Gryffindor"
//}

val Student.isGriffindor
    get() = this.house == "Gryffindor"