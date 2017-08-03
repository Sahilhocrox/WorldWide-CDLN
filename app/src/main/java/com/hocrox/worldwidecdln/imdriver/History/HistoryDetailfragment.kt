package com.hocrox.worldwidecdln.imdriver.History

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.BaseFragment

class HistoryDetailfragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvNext -> {


            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_idriver_historydetail, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {



    }

}
