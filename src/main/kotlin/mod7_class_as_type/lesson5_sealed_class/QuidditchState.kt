package mod7_class_as_type.lesson5_sealed_class

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
sealed class QuidditchState {

    object GameStop:QuidditchState()
    object GameOn:QuidditchState()
    object Team1Won:QuidditchState()
    object Team2Won:QuidditchState()



}