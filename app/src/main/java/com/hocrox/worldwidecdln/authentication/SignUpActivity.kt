package com.hocrox.worldwidecdln.authentication

import android.content.Intent
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.HomeActivity
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.SpinnerCountryAdapter
import com.hocrox.worldwidecdln.databinding.ActivitySignUpBinding
import com.hocrox.worldwidecdln.databinding.SignUpModel
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.view_spinner.*

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    val countries = arrayOf("Mexico", "Russia", "USA", "Russia", "Mexico", "USA", "Germany", "Mexico", "Canada")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val signUpModel: ViewDataBinding? = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_sign_up)
        (signUpModel as ActivitySignUpBinding).signup = SignUpModel()
        (signUpModel).instance = this
        this.btnSignUp.setOnClickListener(this)
        this.btnCancel.setOnClickListener(this)
        setAdapter()

    }

    fun setAdapter() {

        //************THis is to set the adapter************************8

        var adapter: SpinnerCountryAdapter = SpinnerCountryAdapter(this, countries)
        sp_country.adapter = adapter


    }


    override fun onClick(v: View?) {


        when (v!!.id) {

            R.id.btnCancel -> {

                finish()

            }

            R.id.btnSignUp -> {

                startActivity(Intent(this, HomeActivity::class.java))

            }


        }

    }


}
