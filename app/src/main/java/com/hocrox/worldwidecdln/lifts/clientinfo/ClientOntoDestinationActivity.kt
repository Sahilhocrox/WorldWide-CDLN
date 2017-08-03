package com.hocrox.worldwidecdln.lifts.clientinfo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_track2.*


class ClientOntoDestinationActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_track2)

        //*****************This is to set the view****************

        btnCancelOrder.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        Toast.makeText(this, "Move to next screen automatically after 5 seconds", Toast.LENGTH_LONG).show()
        var handler: Handler = Handler()

        handler.postDelayed(

                Runnable {

                    startActivity(Intent(this, ClientDropOffActivity::class.java))

                }, 5000

        )
    }

    override fun onClick(v: View?) {


        when (v?.id) {

            R.id.btnCancelOrder -> {

                //  startActivity(Intent(this, DriverClientArrivalActivity::class.java))


            }
            R.id.ivBackArrow -> {
                finish()
            }


        }

    }


}
