package com.hocrox.worldwidecdln.authentication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_login_sign_up.*

class LoginSignUpActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        btnSignUp.setOnClickListener(this)
        btnSignIn.setOnClickListener(this)

    }


    override fun onClick(v: View?) {
        var ids: Int = v!!.id
        when (ids) {

            R.id.btnSignIn -> {

                startActivity(Intent(this, SignActivity::class.java))

            }

            R.id.btnSignUp -> {


                startActivity(Intent(this, SignUpActivity::class.java))


            }


        }


    }


}
