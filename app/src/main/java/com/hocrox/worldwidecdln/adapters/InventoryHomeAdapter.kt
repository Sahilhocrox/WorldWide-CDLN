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
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.InventoryHomeActivity
import com.hocrox.worldwidecdln.inventory.additem.additem.AddItemHomeActivity
import com.hocrox.worldwidecdln.inventory.bought.BoughtHomeActivity
import com.hocrox.worldwidecdln.inventory.myInventory.MyInventoryHomeActivity
import com.hocrox.worldwidecdln.inventory.posts.PostHomeActivity
import com.hocrox.worldwidecdln.inventory.search.SearchHomeActivity
import com.hocrox.worldwidecdln.inventory.sellingauction.SellingAuctionHomeActivity
import com.hocrox.worldwidecdln.inventory.sold.SoldHomeActivity
import com.hocrox.worldwidecdln.inventory.watchlist.WatchListHomeActivity

/**
 * Created by sahilgoyal on 4/7/17.
 */

class InventoryHomeAdapter(homeActivity: InventoryHomeActivity, datalist: ArrayList<String>, imageList: ArrayList<Int>) : RecyclerView.Adapter<InventoryHomeAdapter.MyViewHolder>() {


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

                0 -> {

                    context.startActivity(Intent(context, MyInventoryHomeActivity::class.java))

                }
                1->{

                    context.startActivity(Intent(context, SearchHomeActivity::class.java))

                }
                2->{

                    context.startActivity(Intent(context, AddItemHomeActivity::class.java))

                }

                3->{

                    context.startActivity(Intent(context, SellingAuctionHomeActivity::class.java))

                }
                4->{

                    context.startActivity(Intent(context, WatchListHomeActivity::class.java))

                }
                5->{

                    context.startActivity(Intent(context, BoughtHomeActivity::class.java))

                }

                6->{
                    context.startActivity(Intent(context, PostHomeActivity::class.java))


                }
                7->{

                    context.startActivity(Intent(context, SoldHomeActivity::class.java))

                }
                8->{


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
