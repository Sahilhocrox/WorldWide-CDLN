package com.hocrox.worldwidecdln.bookingdetail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.eegeo.mapapi.EegeoApi
import com.eegeo.mapapi.MapView
import com.eegeo.mapapi.camera.CameraUpdateFactory
import com.eegeo.mapapi.geometry.LatLng
import com.eegeo.mapapi.geometry.LatLngBounds
import com.hocrox.worldwidecdln.R



class ConfirmationActivity : AppCompatActivity() {


    lateinit var mapvieww: MapView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EegeoApi.init(this, "45ca224135d7199c1143a0bf15549f30")

        setContentView(R.layout.activity_confirmation)

         mapvieww = findViewById(R.id.mapView) as MapView
         mapvieww.onCreate(savedInstanceState)
         mapvieww.getMapAsync {

             Toast.makeText(this, "Welcome to Eegeo Maps", Toast.LENGTH_LONG).show()
             it.moveCamera(CameraUpdateFactory.newLatLngBounds(
                     LatLngBounds.Builder()
                             .include(LatLng(135.7046, 76.7179))
                             .build(), 0))
         }

    }

    override fun onResume() {
        super.onResume()

        mapvieww.onResume()

    }


    override fun onPause() {
        super.onPause()
        mapvieww.onPause()

    }

    override fun onDestroy() {
        super.onDestroy()
        mapvieww.onDestroy()

    }


}
