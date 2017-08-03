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

/**
 * Created by sahilgoyal on 6/7/17.
 */

class SoldListAdapter(context: Context, val dataList: ArrayList<Any>, val fragment: Fragment) : RecyclerView.Adapter<SoldListAdapter.MyViewHolder>() {


    val layoutInflator: LayoutInflater = LayoutInflater.from(context)


    override fun onBindViewHolder(holder: SoldListAdapter.MyViewHolder?, position: Int) {


        holder?.tvName!!.text = dataList.get(position).toString()
        holder.rootLayout.setOnClickListener {






        }

    }

    override fun getItemCount(): Int {

        return dataList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SoldListAdapter.MyViewHolder {
        var view: View = layoutInflator.inflate(R.layout.custom_ratinglist, parent, false)

        return SoldListAdapter.MyViewHolder(view)
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView?.findViewById(R.id.tv_name) as TextView
        var rootLayout = itemView?.findViewById(R.id.ll_root) as LinearLayout
    }
}