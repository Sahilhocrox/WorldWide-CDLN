package com.hocrox.worldwidecdln.inventory.myInventory.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.posts.PostHomeActivity

open class PostBaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.activity_my_info_activtiy,container,false)

        return view
    }

    fun replaceFragment(fragment: Fragment,name:String){

        PostHomeActivity.getInstances().inflateFragment(fragment,name)

    }
    fun setToolbarText(name:String){

        PostHomeActivity.getInstances().setTitle(name)

    }

}
