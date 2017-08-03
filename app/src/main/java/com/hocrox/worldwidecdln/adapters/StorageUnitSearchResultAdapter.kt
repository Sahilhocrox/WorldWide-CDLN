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
import com.hocrox.worldwidecdln.warehouse.RequestStorageUnitActivity
import com.hocrox.worldwidecdln.warehouse.RequestStoreUnitActivity
import com.hocrox.worldwidecdln.warehouse.StorageUnitSearchResutActivity

/**
 * Created by sahilgoyal on 5/7/17.
 */

class StorageUnitSearchResultAdapter(storageUnitSearchResutActivity: StorageUnitSearchResutActivity, dataList: ArrayList<String>) : RecyclerView.Adapter<StorageUnitSearchResultAdapter.MyViewHolder>() {

    var context: Context = storageUnitSearchResutActivity
    var datalist = dataList
    var layoutInflator = LayoutInflater.from(context)


    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder?.tvCompanyName!!.text = datalist.get(position)
        holder.llRootLayout.setOnClickListener {

            context.startActivity(Intent(context, RequestStoreUnitActivity::class.java))

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var view: View = layoutInflator.inflate(R.layout.custom_storage_searchresult, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        return datalist.size
    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var tvCompanyName: TextView = itemView!!.findViewById(R.id.tvComapny) as TextView
        var llRootLayout: LinearLayout = itemView!!.findViewById(R.id.ll_root) as LinearLayout

    }

}