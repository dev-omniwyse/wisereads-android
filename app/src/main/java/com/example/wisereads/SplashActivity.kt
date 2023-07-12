package com.example.wisereads

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import com.example.wisereads.Utils.Constants


class SplashActivity : AppCompatActivity() {

    private var mDelayHandler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_splash)

        mDelayHandler = Handler()
        mDelayHandler!!.postDelayed(mRunnable, Constants.SPLASH_DELAY)

    }

    private val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }

}