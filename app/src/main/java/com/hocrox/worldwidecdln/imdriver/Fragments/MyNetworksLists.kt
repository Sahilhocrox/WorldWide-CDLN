package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.NetworkListAdapter
import kotlinx.android.synthetic.main.fragment_networklist.*


open class MyNetworksLists : BaseFragment(), View.OnClickListener,NetworkConnection {

    override fun connection() {

        replaceFragment(ReferCodeFragment())


    }

    override fun onClick(v: View?) {
        when (v!!.id) {



        }


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_networklist, container, false)

        return view
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        setAdapter()
    }

    fun setAdapter() {

        val list = ArrayList<Any>()
        list.add("American")
        list.add("Chinese")
        list.add("Indian")
        list.add("Japnese")

        var adapter: NetworkListAdapter = NetworkListAdapter(activity, list,this)
        rl_network.layoutManager = LinearLayoutManager(activity)
        rl_network.adapter = adapter

    }

}
