package com.hocrox.worldwidecdln.ridealong.roundtrip

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.ridealong.RidePaymentOptionActivity
import kotlinx.android.synthetic.main.activity_carrier_interested.*

class RideCarrierInterestedActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tvAAccept -> {

                startActivity(Intent(this, RidePaymentOptionActivity::class.java))
            }
            R.id.ivBackArrow->{

                finish()
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrier_interested)

        //*****************This is to intialize the view************

        tv_toolbar.setText(R.string.rideAlong)
        tvAAccept.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }
}
