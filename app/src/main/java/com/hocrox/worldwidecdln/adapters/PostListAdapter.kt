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
import com.hocrox.worldwidecdln.lifts.CarrierInterestedActivity
import com.hocrox.worldwidecdln.lifts.PaymentOptionActivity

/**
 * Created by sahilgoyal on 6/7/17.
 */

class  PostListAdapter(context: Context,var dataList: ArrayList<Any>,var value: String) : RecyclerView.Adapter<PostListAdapter.MyViewHolder>() {


    val contexts: Context = context
    val layoutInflator: LayoutInflater = LayoutInflater.from(context)

    override fun onBindViewHolder(holder: PostListAdapter.MyViewHolder?, position: Int) {
        holder?.tvDriverName!!.text = dataList.get(position).toString()
        holder.llRootName.setOnClickListener {

            if(value.equals("RoundTrip"))
            {
                contexts.startActivity(Intent(contexts, CarrierInterestedActivity::class.java))

            }

           else{
                contexts.startActivity(Intent(contexts, PaymentOptionActivity::class.java))


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