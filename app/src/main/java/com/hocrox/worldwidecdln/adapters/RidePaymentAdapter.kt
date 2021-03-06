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
import com.hocrox.worldwidecdln.ridealong.RideRequestingCarrierActivity

/**
 * Created by sahilgoyal on 6/7/17.
 */

class RidePaymentAdapter(paymentOptionActivity: Context, dataList: ArrayList<String>) : RecyclerView.Adapter<RidePaymentAdapter.MyViewHolder>() {

    var context: Context = paymentOptionActivity
    var dataList = dataList
    var layoutInflator = LayoutInflater.from(context)


    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder?.textView!!.text = dataList.get(position)
        holder.linearlayout.setOnClickListener {

           context.startActivity(Intent(context, RideRequestingCarrierActivity::class.java))
        }

    }

    override fun getItemCount(): Int {

        return dataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {

        var view: View = layoutInflator.inflate(R.layout.custom_payment_option, parent, false)

        return MyViewHolder(view)
    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var textView = itemView!!.findViewById(R.id.tvPaymentMethod) as TextView
        var linearlayout = itemView!!.findViewById(R.id.ll_root) as LinearLayout


    }


}