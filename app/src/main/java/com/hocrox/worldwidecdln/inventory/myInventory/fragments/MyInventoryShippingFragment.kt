package com.hocrox.worldwidecdln.inventory.myInventory.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R

open class MyInventoryShippingFragment : MyInventoryBaseFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_myinven_shippingtem, container, false)
        return view


    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
    override fun onResume() {
        super.onResume()

        setToolbarText("My Inventory")

    }



}
