package com.hocrox.worldwidecdln.inventory.posts.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.myInventory.fragments.PostBaseFragment
import kotlinx.android.synthetic.main.fragment_post_home.*

open class PostHomeFragment : PostBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when(v!!.id){

            R.id.tvPosts->{

                replaceFragment(MyPostFragment(),"Posts")

            }

        }


    }

    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.fragment_post_home,container,false)

        return view
    }
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvPosts.setOnClickListener(this)

    }

}
