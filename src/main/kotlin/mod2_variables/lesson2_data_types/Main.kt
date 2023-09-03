package mod2_variables.lesson2_data_types

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */

fun main() {
//    Byte (-128)..(127)
//    Short (-32768)..(32767)
//    Int (-2,147,483,648)..(2,147,483,647)
//    Long (-9,223,372,036,854,775,808)..(9,223,372,036,854,775,807)

    var varName: Long = 5_000_000

    var intVar = varName.toInt()

    var longVar = 500L


//    Float
//    Double

    var fractionalNum = 3.14F

    var firstVar = 5
    var secondVar = 23.0

    println(firstVar + secondVar)
    println(firstVar - secondVar)
    println(firstVar * secondVar)
    println(firstVar / secondVar)

//    Boolean
    var isGreater = firstVar > secondVar
    var isLess = firstVar < secondVar
    var bool3 = firstVar >= secondVar
    var bool4 = firstVar <= secondVar

    println(isGreater && isLess)
    println(isGreater || isLess)

//    Char
    var charA = 'A'

//    String
    var stringExample: String = "Hello Hogwarts"

    var firstChar = stringExample[0]
    var secondChar = stringExample[1]

    println(firstChar)
    println(secondChar)

    println(stringExample.uppercase())
    println(stringExample.lowercase())
    println(stringExample.contains("Hogwarts"))
    println(stringExample.contains("Aslan"))

    println(stringExample.replace("Hogwarts", "Students"))
    println("Albus Dumbldore said: ${stringExample.replace("Hogwarts", "Students")}")


}