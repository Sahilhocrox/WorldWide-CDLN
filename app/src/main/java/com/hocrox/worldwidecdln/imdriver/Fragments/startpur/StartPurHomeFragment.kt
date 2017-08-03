package com.hocrox.worldwidecdln.imdriver.Fragments.startpur

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_startpur_home.*

/**
 * Created by sahilgoyal on 17/7/17.
 */

class StartPurHomeFragment : BaseFragment(), NetworkConnection, View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.tvStart -> {

                replaceFragment(StartPurFragment())

            }


        }


    }

    override fun connection() {

        replaceFragment(TripRequestFragment())

    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view: View = inflater!!.inflate(R.layout.fragment_startpur_home, container, false)


        return view

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        tvStart.setOnClickListener(this)
    }





}
