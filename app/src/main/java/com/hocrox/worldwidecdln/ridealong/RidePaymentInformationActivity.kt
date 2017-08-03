package com.hocrox.worldwidecdln.ridealong

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_payment_information.*

/**
 * Created by sahilgoyal on 11/7/17.
 */

class RidePaymentInformationActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_information)

        //**************This is to set the view*********************

        tv_toolbar.setText(R.string.rideAlong)
        btnAddNote.setOnClickListener(this)
        btnRequest.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

    }


    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnAddNote -> {

                startActivity(Intent(this, RideAddNoteActivity::class.java))

            }

            R.id.btnRequest -> {

                startActivity(Intent(this, RidePaymentOptionActivity::class.java))

            }
            R.id.ivBackArrow -> {
                finish()
            }


        }


    }

}
