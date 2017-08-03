package com.hocrox.worldwidecdln.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.HomeActivity
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.HomeActivtiy
import com.hocrox.worldwidecdln.inventory.InventoryHomeActivity
import com.hocrox.worldwidecdln.lifts.NeedLiftHomeActivity
import com.hocrox.worldwidecdln.ridealong.RideAlongHome
import com.hocrox.worldwidecdln.trackdetail.TrackActivity
import com.hocrox.worldwidecdln.warehouse.WareAndStorageActivity

/**
 * Created by sahilgoyal on 4/7/17.
 */

class HomeActivtiyAdapter(homeActivity: HomeActivity, datalist: ArrayList<String>, imageList: ArrayList<Int>) : RecyclerView.Adapter<HomeActivtiyAdapter.MyViewHolder>() {


    val context: Context = homeActivity
    val layoutInflator: LayoutInflater = LayoutInflater.from(context)
    var dataList = datalist
    var timageLists = imageList

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {

        val view: View = layoutInflator.inflate(R.layout.custom_shipping, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {

        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder!!.tvName.text = dataList.get(position)
        holder.ivCategory.setImageResource(timageLists.get(position))
        holder.llRoot.setOnClickListener {

            when (position) {


                6 -> {

                    context.startActivity(Intent(context, WareAndStorageActivity::class.java))

                }
                4 -> {

                    context.startActivity(Intent(context, NeedLiftHomeActivity::class.java))

                }
                5 -> {

                    context.startActivity(Intent(context, RideAlongHome::class.java))

                }
                3 -> {

                    context.startActivity(Intent(context, HomeActivtiy::class.java))

                }
              2->{

                  context.startActivity(Intent(context,TrackActivity::class.java))

              }
                7->{

                    context.startActivity(Intent(context,InventoryHomeActivity::class.java))

                }


            }


        }

    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {


        var ivCategory: ImageView = itemView?.findViewById(R.id.ivShipping) as ImageView
        var tvName: TextView = itemView?.findViewById(R.id.tvCategoryName) as TextView
        var llRoot: LinearLayout = itemView?.findViewById(R.id.ll_root) as LinearLayout

    }

}
