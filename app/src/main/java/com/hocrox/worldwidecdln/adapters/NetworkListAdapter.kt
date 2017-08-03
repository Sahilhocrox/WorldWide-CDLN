package com.hocrox.worldwidecdln.adapters

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.MyNetworksLists

/**
 * Created by sahilgoyal on 4/7/17.
 */

class NetworkListAdapter(val context: FragmentActivity, var datalists: ArrayList<Any>, val myNetworksLists: MyNetworksLists) : RecyclerView.Adapter<NetworkListAdapter.MyViewHolder>() {


    val layoutInflator: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {

        val view: View = layoutInflator.inflate(R.layout.custom_networklist, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {

        return datalists.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder!!.tvName.text = datalists.get(position).toString()

        holder.relativeLayout.setOnClickListener {


            (myNetworksLists).connection()

        }

    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {


        var tvName: TextView = itemView?.findViewById(R.id.tvAirline) as TextView
        var relativeLayout: RelativeLayout = itemView?.findViewById(R.id.rl_rootLayout) as RelativeLayout

    }

}
