package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.model.ShippingDetailModel
import com.hocrox.worldwidecdln.trackdetail.TrackItemDetailFragment

/**
 * Created by sahilgoyal on 4/7/17.
 */

class ShippingAdapter(homeActivity: FragmentActivity, datalist: ArrayList<ShippingDetailModel>, imageList: TrackItemDetailFragment) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    val context: Context = homeActivity
    val layoutInflator: LayoutInflater = LayoutInflater.from(context)
    var dataList = datalist
    var timageLists = imageList
    var value:Int=0

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {

        if(viewType==1){

            val view: View = layoutInflator.inflate(R.layout.custom_shippingheader, parent, false)

            return MyViewHeaderHolder(view)

        }
        else {
            val view: View = layoutInflator.inflate(R.layout.custom_shippingchild, parent, false)

            return MyViewHolder(view)
        }


    }

    override fun getItemCount(): Int {

        return dataList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {

        if(value==1)
        {
                val holders:MyViewHeaderHolder =  holder as MyViewHeaderHolder
                    holders.tvName.text="Saturday August 2017"

        }
        else{


            val holders:MyViewHolder =  holder as MyViewHolder
            holders.tv_detail_time.text="1:22 AM"

        }


    }

    override fun getItemViewType(position: Int): Int {
       var shipp:ShippingDetailModel=dataList.get(position)
        if(shipp._header){

          value=1
           return 1
        }
        else{

            value=2
            return 2
        }


    }




    class MyViewHeaderHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {


        var tvName: TextView = itemView?.findViewById(R.id.tv_date) as TextView

    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tv_detail_time: TextView = itemView?.findViewById(R.id.tv_detail_time) as TextView


    }

}
