package com.hocrox.worldwidecdln.lifts.driverInfo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.RideChatAdapter
import kotlinx.android.synthetic.main.activity_driver_chat2.*

class DriverChatActivity : AppCompatActivity(), View.OnClickListener {
    var dataList: ArrayList<Any> = ArrayList<Any>()
    lateinit var storageAdapter: RideChatAdapter
    override fun onClick(v: View?) {


        when (v?.id) {

            R.id.btnTrack -> {

                startActivity(Intent(this, DriverChatActivity::class.java))
                finish()

            }
            R.id.ivBackArrow -> {
                finish()
            }

            R.id.ivSend -> {

                dataList.clear()
                initData()
                dataList.add(et_message.text.toString())
                dataList.add("sender")

                setAdapter()
            }


        }


    }

    fun initData() {

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



    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_chat2)
        btnTrack.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        ivSend.setOnClickListener(this)
        var handler: Handler = Handler()
        Toast.makeText(this, "This Screen automatically moves to next screen after 5 sec.", Toast.LENGTH_LONG).show()

        handler.postDelayed(

                Runnable {

                    startActivity(Intent(this, DriverArrivedActivity::class.java))

                }, 5000

        )

        initData()
        setAdapter()
    }

    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        storageAdapter = RideChatAdapter(this, dataList)
        var linearLayout = LinearLayoutManager(this)
        rl_chatList.layoutManager = linearLayout
        rl_chatList.adapter = storageAdapter

    }
}
