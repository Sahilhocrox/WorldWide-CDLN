package com.hocrox.worldwidecdln.lifts.driverInfo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_driver_onto.*

class DriverOntoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnCancelTrip -> {

                //  startActivity(Intent(this, DriverArrivedActivity::class.java))

            }
            R.id.ivBackArrow -> {
                finish()
            }


        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_onto)
        btnCancelTrip.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        Toast.makeText(this, "Move to next screen automatically after 5 seconds", Toast.LENGTH_LONG).show()

        var handler: Handler = Handler()
        handler.postDelayed(

                Runnable {

                    startActivity(Intent(this, DriverDropOffActivity::class.java))

                }, 5000

        )

    }
}
