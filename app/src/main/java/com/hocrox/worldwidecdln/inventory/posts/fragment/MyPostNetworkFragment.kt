package com.hocrox.worldwidecdln.inventory.posts.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.ConditionSpinnerAdapter
import com.hocrox.worldwidecdln.adapters.ReturnSpinnerAdapter
import com.hocrox.worldwidecdln.adapters.ShareItemSpinnerAdapter
import com.hocrox.worldwidecdln.adapters.ShippingSpinnerAdapter
import com.hocrox.worldwidecdln.inventory.myInventory.fragments.PostBaseFragment
import kotlinx.android.synthetic.main.fragment_post_networkpost.*

open class MyPostNetworkFragment : PostBaseFragment(), View.OnClickListener{
    override fun onClick(v: View?) {

        when(v!!.id){


            R.id.tvReplyToPost->{

                replaceFragment(ReplyToPostFramgent(),"Network Post")
            }
            R.id.tvBuyNow->{

            }

        }


    }
    override fun onResume() {
        super.onResume()

setToolbarText("Network Post")
    }


    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_post_networkpost, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvBuyNow.setOnClickListener(this)
        tvReplyToPost.setOnClickListener(this)
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