package com.hocrox.worldwidecdln.lifts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_requesting_carrier.*

class RoundTripActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when(v!!.id){

            R.id.ivBackArrow->{
                finish()
            }

        }



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_round_trip)
        ivBackArrow.setOnClickListener(this)
    }
}
