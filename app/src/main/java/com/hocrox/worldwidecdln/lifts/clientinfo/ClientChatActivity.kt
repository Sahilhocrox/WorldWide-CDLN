package com.hocrox.worldwidecdln.lifts.clientinfo

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

class ClientChatActivity : AppCompatActivity(), View.OnClickListener {
     var dataList: ArrayList<Any> = ArrayList<Any>()
    lateinit var storageAdapter: RideChatAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_chat)

        //***********This is to intialize the view******************
        btnTrack.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        ivSend.setOnClickListener(this)
        setAdapter()

    }

    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************





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

        storageAdapter = RideChatAdapter(this, dataList)
        var linearLayout = LinearLayoutManager(this)
        rl_chatList.layoutManager = linearLayout
        rl_chatList.adapter = storageAdapter

        Toast.makeText(this,"This Screen automatically moves to next screen after 5 sec.",Toast.LENGTH_LONG).show()

        var handler: Handler = Handler()

        handler.postDelayed(

                Runnable {

                    startActivity (Intent(this,DriverClientArrivalActivity::class.java))

                }, 5000

        )
    }

    override fun onClick(v: View?) {


        when (v?.id) {

            R.id.btnTrack -> {


                startActivity(Intent(this, ClientTrackingActivity::class.java))

            }
            R.id.ivBackArrow -> {
                finish()
            }


            R.id.ivSend -> {


                dataList.add(et_message.text.toString())

                dataList.add("sender")

                storageAdapter.notifyDataSetChanged()

            }



        }

    }




}
