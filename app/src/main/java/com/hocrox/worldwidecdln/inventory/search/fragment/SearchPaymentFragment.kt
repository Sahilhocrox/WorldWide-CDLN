package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.ConditionSpinnerAdapter
import kotlinx.android.synthetic.main.view_gry_spinner.*

open class SearchPaymentFragment : SearchBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {



        }


    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_search_payment, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setConditonAdapter()
    }

    override fun onResume() {
        super.onResume()
        setToolbarText("Payment")

    }
    fun setConditonAdapter() {

        //************THis is to set the adapter************************8

        var adapter: ConditionSpinnerAdapter = ConditionSpinnerAdapter(activity, resources.getStringArray(R.array.paymentype))
        sp_country.adapter = adapter

    }
}
