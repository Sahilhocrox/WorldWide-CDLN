package com.hocrox.worldwidecdln.lifts.multistop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R

class MultiStopHomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id){

       /*     R.id.btnPost->{

                startActivity(Intent(this, MultiStopPostActivity::class.java))

            }*/

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_stop_home)
      //  btnPost.setOnClickListener(this)
    }
}
