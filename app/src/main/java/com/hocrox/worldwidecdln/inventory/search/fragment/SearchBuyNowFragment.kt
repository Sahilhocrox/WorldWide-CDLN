package com.hocrox.worldwidecdln.inventory.search.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.ConditionSpinnerAdapter
import kotlinx.android.synthetic.main.fragment_search_buynow.*
import kotlinx.android.synthetic.main.view_gry_spinner.*

open class SearchBuyNowFragment : SearchBaseFragment(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        when (buttonView!!.id) {


            R.id.cb_us -> {

                if (cb_us.isChecked) {

                    cb_us.isChecked = true
                    cb_fed.isChecked=false
                    cb_wcdls.isChecked=false


                }


            }

            R.id.cb_fed -> {

                if (cb_fed.isChecked) {

                    cb_us.isChecked = false
                    cb_fed.isChecked=true
                    cb_wcdls.isChecked=false


                }

            }
            R.id.cb_wcdls -> {

                if (cb_wcdls.isChecked) {

                    cb_wcdls.isChecked = true
                    cb_fed.isChecked=false
                    cb_us.isChecked=false

                }


            }

        }


    }

    override fun onResume() {
        super.onResume()
        setToolbarText(resources.getString(R.string.inventoryBuyNow))

    }


    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.tvConfirmPayment -> {

                replaceFragment(SearchPaymentFragment(), "Payment")

            }

        }


    }
    fun setConditonAdapter() {

        //************THis is to set the adapter************************8

        var adapter: ConditionSpinnerAdapter = ConditionSpinnerAdapter(activity, resources.getStringArray(R.array.paymentype))
        sp_country.adapter = adapter

         }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_search_buynow, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvConfirmPayment.setOnClickListener(this)
        cb_us.setOnCheckedChangeListener(this)
        cb_fed.setOnCheckedChangeListener(this)
        cb_wcdls.setOnCheckedChangeListener(this)
        setConditonAdapter()
    }


}
