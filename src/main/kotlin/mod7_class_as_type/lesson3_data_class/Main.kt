package mod7_class_as_type.lesson3_data_class

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

//    val student=Student()
//    student.name="Harry Potter"
//    student.house="Gryffindor"

    val student=
        StudentDataClass("Harry Potter", "Gryffindor",11)

    println(student)
    println("Student's name is : ${student.component1()}")
    println("Student's house is : ${student.component2()}")
    println("Student's age is : ${student.component3()}")


}