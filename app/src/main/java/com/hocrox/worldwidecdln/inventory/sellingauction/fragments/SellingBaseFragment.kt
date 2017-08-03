package com.hocrox.worldwidecdln.inventory.sellingauction.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.sellingauction.SellingAuctionHomeActivity

open class SellingBaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.activity_my_info_activtiy,container,false)

        return view
    }

    fun replaceFragment(fragment: Fragment){

        SellingAuctionHomeActivity.getInstances().inflateFragment(fragment)

    }

}
