package com.hocrox.worldwidecdln.ridealong.clientinfo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_client_tracking.*

class RideClientTrackingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.btnSendMessage -> {

                startActivity(Intent(this, RideClientChatActivity::class.java))
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
