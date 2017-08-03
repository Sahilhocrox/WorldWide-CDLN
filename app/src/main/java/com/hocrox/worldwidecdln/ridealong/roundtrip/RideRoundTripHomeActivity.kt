package com.hocrox.worldwidecdln.ridealong.roundtrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_round_trip_home.*

class RideRoundTripHomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

        /*  R.id.btnPost -> {

              startActivity(Intent(this, RidePostListActivity::class.java))
          }*/
            R.id.ivBackArrow->{

                finish()
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_round_trip_home)

        //************This is to instate a view********************

        tv_toolbar.text = "Round Trip"
        tvMultiStops.visibility = View.GONE
        //  btnPost.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }
}
