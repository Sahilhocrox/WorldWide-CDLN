package com.hocrox.worldwidecdln.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hocrox.worldwidecdln.R

/**
 * Created by sahilgoyal on 27/7/17.
 */
public class CategoryAdapter(val activity: FragmentActivity, val myInventoryHomeFragment: Fragment, val datalist: ArrayList<Any>) : RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(activity).inflate(R.layout.custom_country, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder?.textview!!.text = datalist.get(position).toString()


    }

    override fun getItemCount(): Int {


        return datalist.size
    }

    open class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textview: TextView = view.findViewById(R.id.tvCountry) as TextView

    }


}