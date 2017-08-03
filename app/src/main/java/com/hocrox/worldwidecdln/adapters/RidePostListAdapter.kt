package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.ridealong.roundtrip.RideCarrierInterestedActivity

/**
 * Created by sahilgoyal on 6/7/17.
 */

class RidePostListAdapter(context: Context, dataList: ArrayList<Any>) : RecyclerView.Adapter<RidePostListAdapter.MyViewHolder>() {


    val contexts: Context = context
    val layoutInflator: LayoutInflater = LayoutInflater.from(context)
    var dataList = dataList

    override fun onBindViewHolder(holder: RidePostListAdapter.MyViewHolder?, position: Int) {
        holder?.tvDriverName!!.text = dataList.get(position).toString()
        holder.llRootName.setOnClickListener {

            contexts.startActivity(Intent(contexts, RideCarrierInterestedActivity::class.java))

        }

    }

    override fun getItemCount(): Int {

        return dataList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RidePostListAdapter.MyViewHolder {
        var view: View = layoutInflator.inflate(R.layout.custom_postlist, parent, false)

        return RidePostListAdapter.MyViewHolder(view)
    }

     class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tvDriverName: TextView = itemView?.findViewById(R.id.tvDriverName) as TextView
        var llRootName: LinearLayout = itemView?.findViewById(R.id.ll_root) as LinearLayout

    }
}