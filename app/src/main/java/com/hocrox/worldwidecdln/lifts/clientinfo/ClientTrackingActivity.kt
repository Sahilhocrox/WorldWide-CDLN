package com.hocrox.worldwidecdln.lifts.clientinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_client_tracking.*

class ClientTrackingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.btnSendMessage -> {

                startActivity(Intent(this, ClientChatActivity::class.java))
                finish()
            }

            R.id.ivBackArrow -> {
                finish()
            }



        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_tracking)

        btnSendMessage.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

    }
}
