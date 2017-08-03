package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.hocrox.worldwidecdln.R

/**
 * Created by sahilgoyal on 14/7/17.
 */
class ConditionSpinnerAdapter(context: Context, val countries: Array<String>) : BaseAdapter() {


    var layout: LayoutInflater = LayoutInflater.from(context)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View = layout.inflate(R.layout.custom_country, parent, false)
        var country: TextView = view.findViewById(R.id.tvCountry) as TextView

        country.text = countries.get(position)
        return view
    }


    override fun getItem(position: Int): Any {

        return countries[position]

    }

    override fun getItemId(position: Int): Long {
        return 1.22.toLong()
    }

    override fun getCount(): Int {

        return countries.size
    }

}