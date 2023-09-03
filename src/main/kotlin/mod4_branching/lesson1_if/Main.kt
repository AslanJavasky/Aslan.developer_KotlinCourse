package mod4_branching.lesson1_if

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
    if (gryffindorPoints > slytherinPoints
        && gryffindorPoints > hufflepuffPoints
        && gryffindorPoints > ravenclawPoints
    ) {
        println("Gryffindor wins!")
    } else if (slytherinPoints > gryffindorPoints
        && slytherinPoints > hufflepuffPoints
        && slytherinPoints > ravenclawPoints
    ) {
        println("Slytherin wins!")
    } else if (
        hufflepuffPoints > gryffindorPoints
        && hufflepuffPoints > slytherinPoints
        && hufflepuffPoints > ravenclawPoints
    ) {
        println("Hufflepuff wins!")
    } else if (
        ravenclawPoints > gryffindorPoints
        && ravenclawPoints > slytherinPoints
        && ravenclawPoints > hufflepuffPoints
    ) {
        println("Ravenclaw wins!")
    }

}
