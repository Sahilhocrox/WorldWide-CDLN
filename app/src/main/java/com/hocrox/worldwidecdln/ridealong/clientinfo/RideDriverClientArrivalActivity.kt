package com.hocrox.worldwidecdln.ridealong.clientinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_driver_arrival.*

class RideDriverClientArrivalActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){


            R.id.tvConfirm->{

                startActivity(Intent(this, RideClientOntoDestActivity::class.java))

            }
            R.id.ivBackArrow->{

                finish()
            }
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_arrival)
        tvConfirm.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }
}
