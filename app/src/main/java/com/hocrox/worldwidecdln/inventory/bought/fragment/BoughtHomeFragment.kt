

package com.hocrox.worldwidecdln.inventory.bought.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.RadioGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.BoughtListAdapter
import com.hocrox.worldwidecdln.inventory.search.fragment.SearchBaseFragment
import kotlinx.android.synthetic.main.fragment_bought_home.*

open class BoughtHomeFragment : SearchBaseFragment(),NetworkConnection, RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

      when(buttonView?.id){


          R.id.rb_Seller->{

              if(rb_Seller.isChecked){

                  if(rb_Accept.isChecked){

                      rb_Accept.isChecked=false
                      rb_Seller.isChecked=true
                  }
              }
          }

          R.id.rb_Accept->{

              if(rb_Accept.isChecked){

                  if(rb_Accept.isChecked){

                      rb_Seller.isChecked=false
                      rb_Accept.isChecked=true
                  }
              }

          }

      }


         }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

        when(group?.checkedRadioButtonId){




        }


    }

    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view=inflater?.inflate(R.layout.fragment_bought_home,container,false)


        return view
    }
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        rg_seller.setOnCheckedChangeListener (this)
        rb_Accept.setOnCheckedChangeListener(this)
    }


    fun setData() {

        ///*******************This is used to create Data*********************

        datalist.add("My Inventory")

        datalist.add("Search")

        datalist.add("Add Item")

        datalist.add("Setting/Auction")

        datalist.add("Watch List")

        datalist.add("Bought")


        datalist.add("Post")

        datalist.add("Sold")


        ////************Calling the adapter*********************

        setAdapter()
    }


    fun setAdapter() {

        ///********************This is to set adapter on Recycler view ********************

        var boughtListAdapter: BoughtListAdapter = BoughtListAdapter(activity, datalist, this)

        rl_boughtlist.layoutManager = LinearLayoutManager(activity)

        rl_boughtlist.adapter = boughtListAdapter

    }

    override fun connection() {

   //     replaceFragment(SearchItemFragment())


    }



}
