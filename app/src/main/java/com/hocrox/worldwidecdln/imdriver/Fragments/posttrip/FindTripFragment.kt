package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.fragment_imdriver_findtrip.*

class FindTripFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvOk->{

                 replaceFragment(ClientPostsFragment())
            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_imdriver_findtrip, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvOk.setOnClickListener(this)

    }



}
