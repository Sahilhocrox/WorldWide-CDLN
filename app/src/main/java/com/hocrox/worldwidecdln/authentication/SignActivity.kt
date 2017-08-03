package com.hocrox.worldwidecdln.authentication

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.databinding.ActivityLoginBinding
import com.hocrox.worldwidecdln.databinding.LoginModels

class SignActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val loginModel: ViewDataBinding? = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_login)
        (loginModel as ActivityLoginBinding).user = LoginModels("", "")

        (loginModel).handlers = this
    /*    btnSubmit.setOnClickListener {

            (loginModel).user= LoginModels("Hlof","mrrrrr")
        }*/
    }


    fun loginMe(login: LoginModels) {

        Toast.makeText(this, "Cllededf", Toast.LENGTH_LONG).show()
        Log.e("Testing", "Call Me" + ">>" + login.email + ">>>" + login.password)

    }


}
