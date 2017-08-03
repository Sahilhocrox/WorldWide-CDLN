package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.SearchRatingListAdapter
import kotlinx.android.synthetic.main.fragment_search_rating.*

open class SearchRatingFragment : SearchBaseFragment(),NetworkConnection {
    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.fragment_search_rating,container,false)

        return view
    }
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()

    }
    override fun onResume() {
        super.onResume()
        setToolbarText(resources.getString(R.string.itemRating))

    }

    fun setData() {

        ///*******************This is used to create Data*********************

        datalist.add("My Inventory")

        datalist.add("Search")

        datalist.add("Add Item")

        datalist.add("Setting/Auction")

        datalist.add("Watch List")

        datalist.add("Bought")


        datalist.add("Post")

        datalist.add("Sold")


        ////************Calling the adapter*********************

        setAdapter()
    }


    fun setAdapter() {

        ///********************This is to set adapter on Recycler view ********************

        var serachListAdapter: SearchRatingListAdapter = SearchRatingListAdapter(activity, datalist, this)

        rl_ratingList.layoutManager = LinearLayoutManager(activity)

        rl_ratingList.adapter = serachListAdapter

    }

    override fun connection() {



    }



}
