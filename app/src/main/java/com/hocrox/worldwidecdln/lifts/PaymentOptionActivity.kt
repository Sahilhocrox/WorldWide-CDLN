package com.hocrox.worldwidecdln.lifts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hocrox.worldwidecdln.adapters.LiftPaymentAdapter
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_payment_option.*

class PaymentOptionActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.ivBackArrow -> {

                finish()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_option)
        ivBackArrow.setOnClickListener(this)
        setData()

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


    private fun setAdapter(dataList: ArrayList<String>) {

        ///***************This is to set the adapter on list****************

        var liftAdapter: LiftPaymentAdapter = LiftPaymentAdapter(this, dataList)
        rl_payment.layoutManager = LinearLayoutManager(this)
        rl_payment.adapter = liftAdapter

    }

}
