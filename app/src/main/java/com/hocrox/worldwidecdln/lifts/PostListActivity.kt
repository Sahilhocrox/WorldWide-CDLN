package com.hocrox.worldwidecdln.lifts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_post_list.*

class PostListActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tvPost -> {

                startActivity(Intent(this, CarrierInterestedActivity::class.java))

            }

            R.id.ivBackArrow -> {

                finish()

            }
        /* R.id.tvAAccept->{


             startActivity(Intent(this, PaymentOptionActivity::class.java))

         }*/


        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)
        tvPost.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        //tvAAccept.setOnClickListener(this)

    }
}
