package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.fragment_search_auction.*

open class SearchAuctionFragment : SearchBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvBid -> {


                replaceFragment(SearchAuctionDetailFragment(),resources.getString(R.string.inventorySearch))

            }


            R.id.tvBuyNow -> {


                replaceFragment(SearchBuyNowFragment(),resources.getString(R.string.inventoryBuyNow))


            }

        }


    }

    override fun onResume() {
        super.onResume()

        setToolbarText(resources.getString(R.string.inventoryAuction))

    }

    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_search_auction, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvBid.setOnClickListener(this)
        tvBuyNow.setOnClickListener(this)
    }


}
