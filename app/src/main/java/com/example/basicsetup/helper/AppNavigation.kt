import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.basicsetup.mvvm.home.view.HomeActivity
import com.example.basicsetup.mvvm.intro.view.IntroActivity
import com.example.basicsetup.mvvm.login.view.LoginActivity


object AppNavigation {
    fun Context.navigateToHome(msg: String = "", block: () -> Unit) {
        val intent = Intent(this, HomeActivity::class.java)
        if (msg.isNotEmpty()) intent.putExtra("msg", msg)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        block()
    }

    fun Context.navigateToLogin(clearBackStack: Boolean = false) {
        val intent = Intent(this, LoginActivity::class.java)
        if (clearBackStack) intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun Context.navigateToIntro() {
        val intent = Intent(this, IntroActivity::class.java)
        startActivity(intent)
    }


    fun Activity.backStackWithIntent(intent: Intent , resultCode:Int = Activity.RESULT_OK) {
        setResult(resultCode, intent)
        finish()
    }

}