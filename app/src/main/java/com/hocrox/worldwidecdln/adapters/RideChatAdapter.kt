package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hocrox.worldwidecdln.R

/**
 * Created by sahilgoyal on 6/7/17.
 */

class RideChatAdapter(context: Context, dataList: ArrayList<Any>) : RecyclerView.Adapter<RideChatAdapter.MyViewHolder>() {


    val contexts: Context = context
    val layoutInflator: LayoutInflater = LayoutInflater.from(context)
    var dataList = dataList
    lateinit var view: View
    override fun onBindViewHolder(holder: RideChatAdapter.MyViewHolder?, position: Int) {

        holder?.msg!!.text = "Hello How Are"

    }

    override fun getItemCount(): Int {

        return dataList.size

    }

    override fun getItemViewType(position: Int): Int {

        if (dataList.get(position) == "sender") {

            return 1

        } else {

            return 2
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RideChatAdapter.MyViewHolder {


        if (viewType == 1) {

            view = layoutInflator.inflate(R.layout.custom_chat_right, parent, false)

        } else {

            view = layoutInflator.inflate(R.layout.custom_chat_left, parent, false)

        }

        return RideChatAdapter.MyViewHolder(view)
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var msg: TextView = itemView?.findViewById(R.id.tv_msg) as TextView

    }
}