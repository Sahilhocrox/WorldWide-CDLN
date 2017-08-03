package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.fragment_search_bidonitem.*

open class SearchAuctionDetailFragment : SearchBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {



            R.id.tvMapview -> {

                replaceFragment(SearchMapViewFragment(),resources.getString(R.string.inventorySearch))

            }

            R.id.ivWatchList->{

                replaceFragment(SearchWatchListFragment(),resources.getString(R.string.inventorySearch))

            }


        }


    }

    override fun onResume() {
        super.onResume()

        setToolbarText(resources.getString(R.string.inventorySearch))

    }


    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_search_bidonitem, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       tvMapview.setOnClickListener(this)
        ivWatchList.setOnClickListener(this)
    }


}
