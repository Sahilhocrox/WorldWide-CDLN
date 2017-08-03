package com.hocrox.worldwidecdln.inventory.myInventory.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.ConditionSpinnerAdapter
import com.hocrox.worldwidecdln.adapters.ReturnSpinnerAdapter
import com.hocrox.worldwidecdln.adapters.ShareItemSpinnerAdapter
import com.hocrox.worldwidecdln.adapters.ShippingSpinnerAdapter
import kotlinx.android.synthetic.main.fragment_myinven_itemdetail.*

open class MyInventoryItemDetailFragment : MyInventoryBaseFragment(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        when (buttonView?.id) {

            R.id.cb_firm -> {

                if (cb_firm.isChecked) {

                    cb_firm.isChecked = true
                    if (cb_offers.isChecked) {

                        cb_offers.isChecked = false

                    }
                } else {

                    cb_firm.isChecked = false

                }


            }

            R.id.cb_offers -> {

                if (cb_offers.isChecked) {

                    cb_offers.isChecked = true
                    if (cb_firm.isChecked) {

                        cb_firm.isChecked = false

                    }
                } else {

                    cb_offers.isChecked = false

                }

            }


        }


    }
    override fun onResume() {
        super.onResume()

        setToolbarText("My Inventory")

    }

    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvSaves -> {

                replaceFragment(MyInventoryReviewFragment(), "My Inventory")

            }


        }

    }


    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_myinven_itemdetail, container, false)
        return view


    }



    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvSaves.setOnClickListener(this)
        cb_offers.setOnCheckedChangeListener(this)
        cb_firm.setOnCheckedChangeListener(this)
        setConditonAdapter()


    }

    fun setConditonAdapter() {

        //************THis is to set the adapter************************8

        var adapter: ConditionSpinnerAdapter = ConditionSpinnerAdapter(activity, resources.getStringArray(R.array.condition))
        sp_condition.adapter = adapter
        setShareItemAdapter()
    }

    fun setShareItemAdapter() {

        //************THis is to set the adapter************************8

        var adapter: ShareItemSpinnerAdapter = ShareItemSpinnerAdapter(activity, resources.getStringArray(R.array.shareItem))
        sp_share.adapter = adapter
        setReturnAdapter()

    }

    fun setReturnAdapter() {

        //************THis is to set the adapter************************8

        var adapter: ReturnSpinnerAdapter = ReturnSpinnerAdapter(activity, resources.getStringArray(R.array.returnitem))
        sp_returns.adapter = adapter
        setShippingAdapter()


    }

    fun setShippingAdapter() {

        //************THis is to set the adapter************************8

        var adapter: ShippingSpinnerAdapter = ShippingSpinnerAdapter(activity, resources.getStringArray(R.array.shippingItem))
        sp_shipping.adapter = adapter


    }


}
