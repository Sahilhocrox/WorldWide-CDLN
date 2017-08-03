package com.hocrox.worldwidecdln.ridealong

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.RideDriverListAdapter
import kotlinx.android.synthetic.main.activity_driver_list.*

/**
 * Created by sahilgoyal on 11/7/17.
 */
class RideDriverListActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v!!.id){


            R.id.ivBackArrow->{

                finish()

            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_list)

        //**********This is to instate the views**************

          ivBackArrow.setOnClickListener(this)
         tv_toolbar.setText(R.string.rideAlong)
        setAdapter()

    }

    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        var dataList = ArrayList<Any>()

        for (i in 1..5) {

            dataList.add("Rahul Dravid")

        }


        var storageAdapter: RideDriverListAdapter = RideDriverListAdapter(this, dataList)
        var linearLayout = LinearLayoutManager(this)
        rl_driverlist.layoutManager = linearLayout
        rl_driverlist.adapter = storageAdapter

    }
}
