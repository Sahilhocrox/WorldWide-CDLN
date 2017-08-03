package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.FragmentPostListAdapter
import kotlinx.android.synthetic.main.fragment_idriver_clientsposts.*

class ClientPostsFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {



        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_idriver_clientsposts, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        setAdapter()
    }


    fun setAdapter() {

        var dataList = ArrayList<Any>()

        for (i in 1..5) {

            dataList.add("Rahul Dravid")

        }


        var storageAdapter: FragmentPostListAdapter = FragmentPostListAdapter(activity, dataList,this)
        var linearLayout = LinearLayoutManager(activity)
        rl_clientposts.layoutManager = linearLayout
        rl_clientposts.adapter = storageAdapter

    }
}
