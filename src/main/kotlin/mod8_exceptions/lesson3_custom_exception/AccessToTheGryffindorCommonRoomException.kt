package mod8_exceptions.lesson3_custom_exception

/**
 * @author Aslan Javasky, android developer(java/kotlin):Telegram messenger @Aslan_Javasky
 */
class AccessToTheGryffindorCommonRoomException(
    val msg:String
): Throwable(msg)