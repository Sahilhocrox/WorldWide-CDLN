package com.hocrox.worldwidecdln.inventory.sellingauction.fragments

import android.app.Dialog
import android.os.Bundle
import android.support.v7.widget.AppCompatCheckBox
import android.support.v7.widget.LinearLayoutManager
import android.view.*
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.SellingListAdapter
import kotlinx.android.synthetic.main.fragment_sellingauction_home.*

open class SellingHomeFragment : SellingBaseFragment(), NetworkConnection, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {


        when(buttonView!!.id){


            R.id.rb_Accept->{

                if(rb_Accept.isChecked){

                    if(rb_Seller.isChecked){

                        rb_Seller.isChecked=false

                        rb_Accept.isChecked=true

                    }

                }
            }

            R.id.rb_Seller->{

                if(rb_Seller.isChecked){

                    if(rb_Accept.isChecked){

                        rb_Accept.isChecked=false

                        rb_Seller.isChecked=true

                    }

                }
            }



        }


    }


    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_sellingauction_home, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        rb_Seller.setOnCheckedChangeListener(this)
        rb_Accept.setOnCheckedChangeListener(this)
        tvContinent.setOnClickListener(this)
        tvNation.setOnClickListener(this)

        tvNetworks.setOnClickListener(this)

    }

    override fun onClick(v: View?) {


        when (v!!.id) {

            R.id.tvContinent -> {

                tvContinent.isSelected = true
                showContinentDialog()
            }

            R.id.tvNation -> {
                tvNation.isSelected = true
                showNationDialog()
            }

            R.id.tvNetworks -> {
                tvNetworks.isSelected = true

                showNetworksDialog()
            }

        }

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

        var inventoryAdapter: SellingListAdapter = SellingListAdapter(activity, datalist, this)

        rl_sellinglist.layoutManager = LinearLayoutManager(activity)

        rl_sellinglist.adapter = inventoryAdapter

    }

    override fun connection() {

        replaceFragment(SellingItemDetailFragment())

    }

    fun showContinentDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_warehouse, null, false)

        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Continent"
        textview.setOnClickListener {

            dialopg.dismiss()

        }
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "WORLDWIDE"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "NORTH AMERICA"
        checkbox1.setPadding(3, 3, 3, 3)

        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "SOUTH AMERICA"
        checkbox2.setPadding(3, 3, 3, 3)

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "CONTINENT NAME"
        checkbox3.setPadding(3, 3, 3, 3)

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }

    fun showNationDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_warehouse, null, false)
        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView

        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Nation"
        textview.setOnClickListener {

            dialopg.dismiss()

        }


        var checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "WORLDWIDE"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "NORTH AMERICA"
        checkbox1.setPadding(3, 3, 3, 3)

        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "SOUTH AMERICA"
        checkbox2.setPadding(3, 3, 3, 3)
        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "CONTINENT NAME"
        checkbox3.setPadding(3, 3, 3, 3)
        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }

    fun showNetworksDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_warehouse, null, false)
        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Network"
        textview.setOnClickListener {
            tvNetworks.isSelected = false

            dialopg.dismiss()

        }

        var checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "ALL NETWORKS"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "NATION NETWORKS"
        checkbox1.setPadding(3, 3, 3, 3)


        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "NETWORK NAME"
        checkbox2.setPadding(3, 3, 3, 3)

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "NETWORK NAME"
        checkbox3.setPadding(3, 3, 3, 3)

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp


    }


}
