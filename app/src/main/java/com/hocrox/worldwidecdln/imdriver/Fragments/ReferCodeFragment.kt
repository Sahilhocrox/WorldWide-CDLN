package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.fragment_refercode.*


open class ReferCodeFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.tvBuy -> {

                replaceFragment(PaymentOptionFragment())

            }


        }


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_refercode, container, false)

        return view
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvBuy.setOnClickListener(this)
    }


}
