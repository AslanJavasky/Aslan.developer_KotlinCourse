package mod7_class_as_type.lesson5_sealed_class

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
fun main() {

    var state:QuidditchState=QuidditchState.GameStop
    printStateMessage(state)
    state=QuidditchState.GameOn
    /*
    some game process
     */
    printStateMessage(state)
    state=QuidditchState.Team1Won
    printStateMessage(state)
}

fun printStateMessage(state: QuidditchState) {
    when(state){
        QuidditchState.GameOn -> println("game in progress")
        QuidditchState.GameStop -> println("the game hasn't started yet")
        QuidditchState.Team1Won -> println("Team1 is wins!")
        QuidditchState.Team2Won -> println("Team2 is wins!")
    }
}