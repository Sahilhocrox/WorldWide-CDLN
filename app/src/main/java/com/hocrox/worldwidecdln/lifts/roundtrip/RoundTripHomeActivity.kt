package com.hocrox.worldwidecdln.lifts.roundtrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_post_list.*

class RoundTripHomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when(v?.id){

         /*   R.id.btnPost->{

                startActivity(Intent(this, RoundTripPostListActivity::class.java))
            }*/

            R.id.ivBackArrow->{
                finish()
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_round_trip_home)
       // btnPost.setOnClickListener(this)

        ivBackArrow.setOnClickListener(this)
    }
}
