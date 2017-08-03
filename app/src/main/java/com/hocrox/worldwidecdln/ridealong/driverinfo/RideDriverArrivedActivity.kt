package com.hocrox.worldwidecdln.ridealong.driverinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.driverInfo.DriverOntoActivity
import kotlinx.android.synthetic.main.activity_driver_arrived2.*

class RideDriverArrivedActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){

            R.id.tvArrived->{

                startActivity(Intent(this, DriverOntoActivity::class.java))

            }
            R.id.ivBackArrow->{

                finish()
            }
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_arrived2)
        tvArrived.setOnClickListener(this)
        tv_toolbar.setText(R.string.rideAlong)
        ivBackArrow.setOnClickListener(this)
    }
}
