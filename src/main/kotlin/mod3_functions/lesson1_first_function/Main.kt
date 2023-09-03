package mod3_functions.lesson1_first_function

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messanger @Aslan_Javasky
 */
fun main() {

    var hogwartsHeadmaster: String = "Armando Dippet"
    println(hogwartsHeadmaster)

    hogwartsHeadmaster = getDumbledoreName()
    println(hogwartsHeadmaster)

    var gringottsAccount = 5_000
    var storagePeriod = 8
    var percent = 15.0

    println(
        "After $storagePeriod years the account will have ${
            getGringottesResult(
                gringottsAccount,
                storagePeriod,
                percent
            )
        } galleons."
    )

}

fun getGringottesResult(
    gringottsAccount: Int, storagePeriod: Int, percent: Double
) = gringottsAccount + gringottsAccount * storagePeriod * percent


fun getDumbledoreName() = "Albus Dumbledore"

