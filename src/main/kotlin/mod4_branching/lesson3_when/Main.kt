package mod4_branching.lesson3_when

import kotlin.math.max

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    val gryffindorPoints = 200
    val slytherinPoints = 250
    val hufflepuffPoints = 300
    val ravenclawPoints = 150

    getWinner(gryffindorPoints, slytherinPoints, hufflepuffPoints, ravenclawPoints)
}

fun getWinner(
    gryffindorPoints: Int, slytherinPoints: Int,
    hufflepuffPoints: Int, ravenclawPoints: Int
) {

    val maxValue =
        max(
            max(gryffindorPoints, slytherinPoints),
            max(hufflepuffPoints, ravenclawPoints)
        )

    when (maxValue) {
        gryffindorPoints -> println("Gryffindor wins!")
        slytherinPoints -> println("Slytherin wins!")
        hufflepuffPoints -> println("Hufflepuff wins!")
        ravenclawPoints -> println("Ravenclaw wins!")
    }
}
