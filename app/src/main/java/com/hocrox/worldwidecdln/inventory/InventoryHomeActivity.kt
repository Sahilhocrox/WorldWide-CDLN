package com.hocrox.worldwidecdln.inventory

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.InventoryHomeAdapter
import kotlinx.android.synthetic.main.activity_inventory_home.*

class InventoryHomeActivity : AppCompatActivity() {

    var datalist = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_home)

        setData()
    }

    fun setData() {

        ///*******************This is used to create Data*********************

        datalist.add("My Inventory")
        imageList.add(R.drawable.myinventory)

        datalist.add("Search")
        imageList.add(R.drawable.inventorysearch)

        datalist.add("Add Item")
        imageList.add(R.drawable.additem)

        datalist.add("Selling/Auction")
        imageList.add(R.drawable.selling)

        datalist.add("Watch List")
        imageList.add(R.drawable.watchlist)

        datalist.add("Bought")
        imageList.add(R.drawable.bought)


        datalist.add("Post")
        imageList.add(R.drawable.post)

        datalist.add("Sold")
        imageList.add(R.drawable.sold)


        ////************Calling the adapter*********************

        setAdapter()
    }


    fun setAdapter() {

        ///********************This is to set adapter on Recycler view ********************

        var inventoryAdapter: InventoryHomeAdapter = InventoryHomeAdapter(this, datalist, imageList)

        rl_inventroyList.layoutManager = GridLayoutManager(this, 2)

        rl_inventroyList.adapter = inventoryAdapter

    }


}
