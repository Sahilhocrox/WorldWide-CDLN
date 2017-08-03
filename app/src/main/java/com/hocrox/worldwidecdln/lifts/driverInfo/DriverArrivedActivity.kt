package com.hocrox.worldwidecdln.lifts.driverInfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_driver_arrived2.*

class DriverArrivedActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){

            R.id.tvArrived->{

                startActivity(Intent(this, DriverOntoActivity::class.java))

            }
            R.id.ivBackArrow -> {
                finish()
            }

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_arrived2)
        tvArrived.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }
}
