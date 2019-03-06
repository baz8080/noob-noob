package goddamn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mbcdev.goddamn.R
import kotlinx.android.synthetic.main.activity_god_damn.*

class GodDamnActivity : AppCompatActivity() {

    private val godDamnMessenger by lazy { GodDamnMessenger(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_god_damn)

        goddamn.setOnClickListener {
            GodDamnApp.get(this).godDamn()
            godDamnMessenger.shareGodDamn()
        }
    }

    override fun onResume() {
        super.onResume()

        GodDamnApp.get(this).godDamn()
    }

    override fun onStart() {
        super.onStart()
        godDamnMessenger.listenForGodDamns()
    }

    override fun onStop() {
        super.onStop()
        godDamnMessenger.ignoreGodDamns()
    }
}
