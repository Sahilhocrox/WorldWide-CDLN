package com.hocrox.worldwidecdln

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.hocrox.worldwidecdln.authentication.LoginSignUpActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var handler: Handler = Handler()

        handler.postDelayed(

                Runnable {

                    startActivity (Intent(this, LoginSignUpActivity::class.java))

                }, 3000

        )


    }
}


