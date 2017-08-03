package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.History.HistoryListfragment

/**
 * Created by sahilgoyal on 6/7/17.
 */

class IDriverHistoryAdapter(paymentOptionActivity: Context, dataList: ArrayList<Any>, val historyListfragment: HistoryListfragment) : RecyclerView.Adapter<IDriverHistoryAdapter.MyViewHolder>() {

    var context: Context = paymentOptionActivity
    var dataList = dataList
    var layoutInflator = LayoutInflater.from(context)
    var value: Boolean = false


    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder?.tvDriverName!!.text = dataList.get(position).toString()
        holder.llRootName.setOnClickListener {


            historyListfragment.connection()

        }


    }

    override fun getItemCount(): Int {

        return dataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {

        var view: View = layoutInflator.inflate(R.layout.custom_imdriver_history, parent, false)

        return MyViewHolder(view)

    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tvDriverName: TextView = itemView?.findViewById(R.id.tvClientName) as TextView
        var llRootName: LinearLayout = itemView?.findViewById(R.id.ll_root) as LinearLayout

    }


}