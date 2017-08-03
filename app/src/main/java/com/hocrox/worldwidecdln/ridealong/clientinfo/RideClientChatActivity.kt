package com.hocrox.worldwidecdln.ridealong.clientinfo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.RideChatAdapter
import kotlinx.android.synthetic.main.activity_client_chat.*

class RideClientChatActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_chat)

        //***********This is to intialize the view******************
        btnTrack.setOnClickListener(this)
        tv_toolbar.setText(R.string.rideAlong)
        ivBackArrow.setOnClickListener(this)
        setAdapter()
    }


    override fun onClick(v: View?) {


        when (v?.id) {

            R.id.btnTrack -> {

                startActivity(Intent(this, RideClientOntoDestActivity::class.java))

            }
            R.id.ivBackArrow -> {

                finish()
            }

        }

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
        var handler: Handler = Handler()
        Toast.makeText(this, "This Screen automatically moves to next screen after 5 sec.", Toast.LENGTH_LONG).show()


        handler.postDelayed(

                Runnable {

                    startActivity(Intent(this, RideDriverClientArrivalActivity::class.java))

                }, 5000

        )
    }
}
