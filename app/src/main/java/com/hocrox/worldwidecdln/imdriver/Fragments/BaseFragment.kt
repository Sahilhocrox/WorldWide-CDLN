package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R

open class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.activity_my_info_activtiy,container,false)

        return view
    }

    fun replaceFragment(fragment:Fragment){

        HomeActivtiy.getInstances().inflateFragment(fragment)

    }

}
