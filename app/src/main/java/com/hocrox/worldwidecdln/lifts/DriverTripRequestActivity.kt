package com.hocrox.worldwidecdln.lifts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.driverInfo.DriverTrackingActivity
import kotlinx.android.synthetic.main.activity_trip_information.*

class DriverTripRequestActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnAccept -> {


                startActivity(Intent(this, DriverTrackingActivity::class.java))
            }


            R.id.ivBackArrow -> {

                finish()
            }
            R.id.tvTripInformation -> {

                if (ll_tripInformation.visibility == View.GONE) {

                    ll_tripInformation.visibility = View.VISIBLE

                } else {

                    ll_tripInformation.visibility = View.GONE

                }

            }
            R.id.tvViewMap -> {
                if (ll_map.visibility == View.GONE) {

                    ll_map.visibility = View.VISIBLE

                } else {

                    ll_map.visibility = View.GONE

                }
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_information)
        btnAccept.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        tvViewMap.setOnClickListener(this)
        tvTripInformation.setOnClickListener(this)

    }
}
