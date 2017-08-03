package com.hocrox.worldwidecdln.imdriver

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_driver_home.*

class DriverHomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v!!.id){

            R.id.tvReadyDrive->{

                
            }


        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_home)
        tvReadyDrive.setOnClickListener(this)
    }
}
