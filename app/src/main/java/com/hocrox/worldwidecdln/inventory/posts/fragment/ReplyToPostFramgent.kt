package com.hocrox.worldwidecdln.inventory.posts.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.myInventory.fragments.PostBaseFragment

open class ReplyToPostFramgent : PostBaseFragment(), View.OnClickListener{
    override fun onClick(v: View?) {


    }

    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_post_replypost, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onResume() {
        super.onResume()

        setToolbarText("Network Post")
    }

}