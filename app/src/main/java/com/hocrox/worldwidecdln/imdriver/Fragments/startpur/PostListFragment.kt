package com.hocrox.worldwidecdln.imdriver.Fragments.startpur

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.FragmentPostListAdapter
import com.hocrox.worldwidecdln.imdriver.Fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_post_list.*

/**
 * Created by sahilgoyal on 17/7/17.
 */

class PostListFragment: BaseFragment(),NetworkConnection {

    override fun connection() {

        replaceFragment(TripRequestFragment())

    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

     var view:View= inflater!!.inflate(R.layout.fragment_post_list,container,false)


        return view

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        setAdapter()
    }


    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        var dataList = ArrayList<Any>()

        for (i in 1..5) {

            dataList.add("Rahul Dravid")

        }


        var storageAdapter: FragmentPostListAdapter = FragmentPostListAdapter(activity, dataList,this)
        var linearLayout = LinearLayoutManager(activity)
        rl_posts.layoutManager = linearLayout
        rl_posts.adapter = storageAdapter

    }



}
