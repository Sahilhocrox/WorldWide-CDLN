package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.search.SearchHomeActivity

open class SearchBaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.activity_my_info_activtiy,container,false)

        return view
    }

    fun replaceFragment(fragment: Fragment, tilte:String){

        SearchHomeActivity.getInstances().inflateFragment(fragment,tilte)

    }
    fun setToolbarText(name:String){

        SearchHomeActivity.getInstances().setTitle(name)

    }



}
