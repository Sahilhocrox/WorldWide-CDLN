package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.RidePaymentAdapter
import kotlinx.android.synthetic.main.activity_payment_option.*


open class PaymentOptionFragment : BaseFragment(), View.OnClickListener, NetworkConnection {

    override fun connection() {

        replaceFragment(ReferCodeFragment())


    }

    override fun onClick(v: View?) {
        when (v!!.id) {


        }


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_payment, container, false)


        return view
    }

    private fun setData() {

        //***************This is to set the data in list********************

        var dataList = ArrayList<String>()

        dataList.add("Saved Payment Method")
        dataList.add("WCDLN Bank Account")
        dataList.add("Debit/ATM or Credit Card")
        dataList.add("Paypal Account")
        dataList.add("WCDLN Coin Transfer")

        setAdapter(dataList)
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        setData()

    }

    fun setAdapter(dataList: ArrayList<String>) {

        var liftAdapter: RidePaymentAdapter = RidePaymentAdapter(activity, dataList)
        rl_payment.layoutManager = LinearLayoutManager(activity)
        rl_payment.adapter = liftAdapter

    }

}
