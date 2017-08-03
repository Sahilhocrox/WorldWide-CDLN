package com.hocrox.worldwidecdln

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.hocrox.worldwidecdln.adapters.HomeActivtiyAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    var datalist = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        setData()


    }


    fun setData() {

        ///*******************This is used to create Data*********************

        datalist.add("Shipping an Item")
        imageList.add(R.drawable.shipping_an_item)

        datalist.add("Receving an Item")
        imageList.add(R.drawable.recieve_an_item)

        datalist.add("Tracking Item")
        imageList.add(R.drawable.track)

        datalist.add("I am a Driver")
        imageList.add(R.drawable.driver)

        datalist.add("I Need a lift")
        imageList.add(R.drawable.need_a_lift)

        datalist.add("Ride Along")
        imageList.add(R.drawable.ride_along)


        datalist.add("Warehouse")
        imageList.add(R.drawable.warehouse)

        datalist.add("Inventory")
        imageList.add(R.drawable.inventory)


        ////************Calling the adapter*********************

        setAdapter()
    }


    fun setAdapter() {

        ///********************This is to set adapter on Recycler view ********************

        var homeAdapter: HomeActivtiyAdapter = HomeActivtiyAdapter(this, datalist, imageList)

        rl_homeList.layoutManager = GridLayoutManager(this,2)

        rl_homeList.adapter = homeAdapter

    }

}
