package com.hocrox.worldwidecdln.ridealong.roundtrip

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.RidePostListAdapter
import kotlinx.android.synthetic.main.activity_post_list.*

class RidePostListActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tvPost -> {

               // startActivity(Intent(this, CarrierInterestedActivity::class.java))

            }
            R.id.ivBackArrow->{

                finish()
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)

        //*****************This is to instiate all the View **********************

        tv_toolbar.setText(R.string.rideAlong)
        tvPost.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        setAdapter()

    }


    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        var dataList = ArrayList<Any>()

        for (i in 1..5) {

            dataList.add("Rahul Dravid")

        }


        var storageAdapter: RidePostListAdapter = RidePostListAdapter(this, dataList)
        var linearLayout = LinearLayoutManager(this)
        rl_posts.layoutManager = linearLayout
        rl_posts.adapter = storageAdapter

    }

}
