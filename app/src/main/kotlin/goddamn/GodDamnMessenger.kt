package goddamn

import com.google.android.gms.nearby.Nearby
import com.google.android.gms.nearby.messages.Message
import com.google.android.gms.nearby.messages.MessageListener
import java.util.*

class GodDamnMessenger(activity: GodDamnActivity) {

    private val godDamnClient by lazy {
        Nearby.getMessagesClient(activity)
    }
    private val godDamnListener = object : MessageListener() {
        override fun onFound(m: Message?) {
            GodDamnApp.get(activity).godDamn()
            nukeGodDamns()
            shareGodDamn()
        }
    }
    private val godDamnMessages = mutableListOf<Message>()

    fun listenForGodDamns() {
        godDamnClient.subscribe(godDamnListener)
    }

    fun ignoreGodDamns() {
        godDamnClient.unsubscribe(godDamnListener)
        nukeGodDamns()
    }

    fun shareGodDamn() {
        val godDamnMessage = Message(UUID.randomUUID().toString().take(6).toByteArray())
        godDamnMessages.add(godDamnMessage)
        godDamnClient.publish(godDamnMessage)
    }

    private fun nukeGodDamns() {
        godDamnMessages.forEach { godDamnMessage ->
            godDamnClient.unpublish(godDamnMessage)
        }
    }
}