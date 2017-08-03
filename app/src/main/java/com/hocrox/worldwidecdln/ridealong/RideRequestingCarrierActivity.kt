package com.hocrox.worldwidecdln.ridealong

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.CancelRequestActivity
import com.hocrox.worldwidecdln.ridealong.clientinfo.RideClientTrackingActivity
import kotlinx.android.synthetic.main.activity_requesting_carrier.*

/**
 * Created by sahilgoyal on 11/7/17.
 */
class RideRequestingCarrierActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requesting_carrier)

        ///************************This is to intialize the view*******************

        tv_toolbar.setText(R.string.rideAlong)
        btnCancel.setOnClickListener(this)
        tvViewProfile.setOnClickListener(this)
        tvTime.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnCancel -> {

                startActivity(Intent(this, CancelRequestActivity::class.java))

            }
            R.id.tvViewProfile -> {
               // startActivity(Intent(this, RideDriverTripReqActivity::class.java))


            }
            R.id.tvTime->{

                startActivity(Intent(this, RideClientTrackingActivity::class.java))

            }
            R.id.ivBackArrow->{
                finish()
            }


        }

    }

}