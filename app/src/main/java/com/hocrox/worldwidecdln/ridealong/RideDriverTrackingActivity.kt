package com.hocrox.worldwidecdln.ridealong

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.CancelRequestActivity
import com.hocrox.worldwidecdln.ridealong.driverinfo.RideDriverChatActivity
import kotlinx.android.synthetic.main.activity_driver_tracking.*

class RideDriverTrackingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnCancelTrip -> {

                startActivity(Intent(this, CancelRequestActivity::class.java))

            }

            R.id.tvViewProfile -> {

                //  startActivity(Intent(this, DriverClientArrivalActivity::class.java))


            }

            R.id.tvDriverReview -> {
                //  startActivity(Intent(this, DriverArrivedActivity::class.java))


            }
            R.id.btnSendMessage -> {

                startActivity(Intent(this, RideDriverChatActivity::class.java))
                finish()

            }
            R.id.ivBackArrow -> {
                finish()
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_tracking)
        btnCancelTrip.setOnClickListener(this)
        tvViewProfile.setOnClickListener(this)
        tvDriverReview.setOnClickListener(this)
        btnSendMessage.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }
}
