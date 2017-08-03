package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.fragment_imdriver_posttrip.*

class PostTripFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvNext->{

              replaceFragment(FindTripFragment())
            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_imdriver_posttrip, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvNext.setOnClickListener(this)

    }



}
