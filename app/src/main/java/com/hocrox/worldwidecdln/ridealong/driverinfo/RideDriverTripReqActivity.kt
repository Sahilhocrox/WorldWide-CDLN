package com.hocrox.worldwidecdln.ridealong.driverinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_trip_information.*

class RideDriverTripReqActivity : AppCompatActivity(), View.OnClickListener, OnMapReadyCallback {
    override fun onMapReady(p0: GoogleMap?) {

    }

    override fun onClick(v: View?) {

        when(v?.id){

            R.id.btnAccept->{


                startActivity(Intent(this, RideDriverChatActivity::class.java))
                finish()
            }

            R.id.ivBackArrow->{

                finish()
            }
            R.id.tvViewMap->{

                ll_map.visibility=View.VISIBLE
                ll_tripInformation.visibility=View.GONE
            }
            R.id.tvTripInformation->{


                ll_map.visibility=View.GONE
                ll_tripInformation.visibility=View.VISIBLE            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_information)
        tv_toolbar.setText(R.string.rideAlong)
        btnAccept.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        tvTripInformation.setOnClickListener(this)
        tvViewMap.setOnClickListener(this)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
}
