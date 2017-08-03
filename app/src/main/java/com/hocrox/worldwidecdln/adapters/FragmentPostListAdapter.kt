package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.startpur.PostListFragment

/**
 * Created by sahilgoyal on 6/7/17.
 */

class  FragmentPostListAdapter(context: Context,val dataList: ArrayList<Any>, val fragment:Fragment) : RecyclerView.Adapter<PostListAdapter.MyViewHolder>() {


    val layoutInflator: LayoutInflater = LayoutInflater.from(context)


    override fun onBindViewHolder(holder: PostListAdapter.MyViewHolder?, position: Int) {
        holder?.tvDriverName!!.text = dataList.get(position).toString()
        holder.llRootName.setOnClickListener {


         var data:String= this.fragment.javaClass.name

            if(data.contains("PostList")){

                (fragment as PostListFragment).connection()
            }
            else{

              //  (fragment as PostListFragment).connection()

            }


        }

    }

    override fun getItemCount(): Int {

        return dataList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PostListAdapter.MyViewHolder {
        var view: View = layoutInflator.inflate(R.layout.custom_postlist, parent, false)

        return PostListAdapter.MyViewHolder(view)
    }

     class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tvDriverName: TextView = itemView?.findViewById(R.id.tvDriverName) as TextView
        var llRootName: LinearLayout = itemView?.findViewById(R.id.ll_root) as LinearLayout

    }
}