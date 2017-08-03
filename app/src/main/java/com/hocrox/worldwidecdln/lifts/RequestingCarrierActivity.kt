package com.hocrox.worldwidecdln.lifts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.clientinfo.ClientChatActivity
import com.hocrox.worldwidecdln.lifts.clientinfo.ClientTrackingActivity

import kotlinx.android.synthetic.main.activity_requesting_carrier.*


class RequestingCarrierActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requesting_carrier)

        ///************************This is to intialize the view*******************


        btnCancel.setOnClickListener(this)
        tvViewProfile.setOnClickListener(this)
        tvTime.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnCancel -> {


                startActivity(Intent(this,CancelRequestActivity::class.java))


            }
            R.id.tvViewProfile -> {

                //startActivity(Intent(this,DriverTripRequestActivity::class.java))


            }
            R.id.tvTime->{

                startActivity(Intent(this,ClientTrackingActivity::class.java))

            }
            R.id.ivBackArrow -> {

                finish()

            }

        }

    }

}
