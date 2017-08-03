package com.hocrox.worldwidecdln.lifts.clientinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.DriverTripRequestActivity
import com.hocrox.worldwidecdln.lifts.PaymentOptionActivity
import kotlinx.android.synthetic.main.activity_drop_off.*

class ClientDropOffActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tvPaymentType -> {

                startActivity(Intent(this, PaymentOptionActivity::class.java))

            }
            R.id.btnConfirmed -> {

                startActivity(Intent(this, DriverTripRequestActivity::class.java))

            }
            R.id.ivBackArrow -> {
                finish()
            }


        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drop_off)
        tvPaymentType.setOnClickListener(this)
        btnConfirmed.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }
}
