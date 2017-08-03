package com.hocrox.worldwidecdln.ridealong.driverinfo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_driver_drop_off.*

class RideDriverDropOffActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_drop_off)
        btnConfirmed.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }


    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.btnConfirmed -> {

                Toast.makeText(this, "Status Recorded", Toast.LENGTH_LONG).show()

            }
            R.id.ivBackArrow -> {
                finish()
            }

        }

    }

}


