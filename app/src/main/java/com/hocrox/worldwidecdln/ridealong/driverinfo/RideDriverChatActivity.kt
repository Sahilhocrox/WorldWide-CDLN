package com.hocrox.worldwidecdln.ridealong.driverinfo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.RideChatAdapter
import com.hocrox.worldwidecdln.ridealong.RideDriverTrackingActivity
import kotlinx.android.synthetic.main.activity_driver_chat2.*

class RideDriverChatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {


        when (v?.id) {

            R.id.btnTrack -> {

                startActivity(Intent(this, RideDriverTrackingActivity::class.java))
                finish()

            }
            R.id.ivBackArrow->{

                finish()
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_chat2)

        //*******************This is to isnstiate all the views******************

        btnTrack.setOnClickListener(this)
        tv_toolbar.setText(R.string.rideAlong)
        ivBackArrow.setOnClickListener(this)
        Toast.makeText(this, "This Screen automatically moves to next screen after 5 sec.", Toast.LENGTH_LONG).show()
        var handler: Handler = Handler()

        handler.postDelayed(

                Runnable {

                    startActivity(Intent(this, RideDriverArrivedActivity::class.java))

                }, 5000

        )
        setAdapter()

    }
    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        var dataList = ArrayList<Any>()


        dataList.add("sender")
        dataList.add("reciever")

        dataList.add("sender")

        dataList.add("reciever")
        dataList.add("sender")
        dataList.add("sender")
        dataList.add("reciever")
        dataList.add("sender")
        dataList.add("reciever")
        dataList.add("reciever")
        var storageAdapter: RideChatAdapter = RideChatAdapter(this, dataList)
        var linearLayout = LinearLayoutManager(this)
        rl_chatList.layoutManager = linearLayout
        rl_chatList.adapter = storageAdapter

    }
}
