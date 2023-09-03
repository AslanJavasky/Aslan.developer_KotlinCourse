package mod6_oop.lesson10_functional_interface

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    WinnerHogwartsHouseCup { gryffindorPoints, slytherinPoints, ravenclawPoints, hufflepuffPoints ->
        when (maxOf(gryffindorPoints, slytherinPoints, ravenclawPoints, hufflepuffPoints)) {
            gryffindorPoints -> println("Gryffindor wins!")
            slytherinPoints -> println("Slytherin wins!")
            ravenclawPoints -> println("Ravenclaw wins!")
            hufflepuffPoints -> println("Hufflepuff wins!")
        }
    }
        .getWinner(100, 110, 50, 30)

}


fun interface WinnerHogwartsHouseCup {
    fun getWinner(gryffindorPoints: Int, slytherinPoints: Int, ravenclawPoints: Int, hufflepuffPoints: Int)
}