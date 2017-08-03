package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R

open class SearchWatchListFragment : SearchBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

     


    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_search_watchitem, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    override fun onResume() {
        super.onResume()
        setToolbarText(resources.getString(R.string.inventorySearch))

    }

}
