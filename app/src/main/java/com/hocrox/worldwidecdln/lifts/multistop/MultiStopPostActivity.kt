package com.hocrox.worldwidecdln.lifts.multistop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.PostListAdapter
import kotlinx.android.synthetic.main.activity_post_list.*

class MultiStopPostActivity: AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)
         ivBackArrow.setOnClickListener(this)
        setAdapter()
    }
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.ivBackArrow -> {
                finish()
            }

        }
    }

    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        var dataList = ArrayList<Any>()

        for (i in 1..5) {

            dataList.add("Rahul Dravid")

        }


        var storageAdapter: PostListAdapter = PostListAdapter(this, dataList,"MultiStop")
        var linearLayout = LinearLayoutManager(this)
        rl_posts.layoutManager = linearLayout
        rl_posts.adapter = storageAdapter

    }
}
