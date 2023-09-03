package mod8_exceptions.lesson1_try_catch_finally

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    try {
//        val x:Int
//        x=5/0

        val students= listOf("Harry Potter","Neville Longbottom")
        println(students[5])
    }catch (e:ArithmeticException){
        println("There is an : $e")
    }catch (e:Throwable) {
        println("There is an : $e")
    }catch (e:ArrayIndexOutOfBoundsException) {
        println("There is an : $e")
    }finally {
        println("The end of the program")
    }


}