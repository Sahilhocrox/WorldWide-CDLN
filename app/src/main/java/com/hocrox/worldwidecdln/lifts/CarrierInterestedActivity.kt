package com.hocrox.worldwidecdln.lifts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_carrier_interested.*

class CarrierInterestedActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id){

            R.id.tvAAccept->{

                startActivity(Intent(this,PaymentOptionActivity::class.java))
            }

            R.id.ivBackArrow -> {

                finish()

            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrier_interested)
        tvAAccept.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

    }
}
