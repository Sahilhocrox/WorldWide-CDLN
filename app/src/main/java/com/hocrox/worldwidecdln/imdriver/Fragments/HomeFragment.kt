package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_driver_home.*


open class HomeFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.tvReadyDrive -> {


                replaceFragment(ReadyDriverFragment())

            }

        }


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.activity_driver_home, container, false)


        return view
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvReadyDrive.setOnClickListener(this)


    }


}
