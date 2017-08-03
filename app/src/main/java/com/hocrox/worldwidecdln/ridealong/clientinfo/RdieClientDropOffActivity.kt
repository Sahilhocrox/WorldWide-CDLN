package com.hocrox.worldwidecdln.ridealong.clientinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.ridealong.RidePaymentOptionActivity
import com.hocrox.worldwidecdln.ridealong.driverinfo.RideDriverTripReqActivity
import kotlinx.android.synthetic.main.activity_drop_off.*

class  RdieClientDropOffActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tvPaymentType -> {

                startActivity(Intent(this, RidePaymentOptionActivity::class.java))

            }

            R.id.btnConfirmed->{
                startActivity(Intent(this, RideDriverTripReqActivity::class.java))


            }
            R.id.ivBackArrow->{

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
