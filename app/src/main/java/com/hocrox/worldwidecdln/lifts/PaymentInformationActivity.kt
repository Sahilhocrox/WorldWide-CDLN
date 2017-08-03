package com.hocrox.worldwidecdln.lifts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_payment_information.*

class PaymentInformationActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_information)

        //**************This is to set the view*********************

        btnAddNote.setOnClickListener(this)
        btnRequest.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

    }


    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnAddNote -> {

                startActivity(Intent(this, AddNoteActivity::class.java))

            }

            R.id.btnRequest -> {

                startActivity(Intent(this, PaymentOptionActivity::class.java))

            }
            R.id.ivBackArrow -> {

                finish()
            }


        }


    }

}
