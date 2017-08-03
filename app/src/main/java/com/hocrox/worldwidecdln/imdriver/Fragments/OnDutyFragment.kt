package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.History.HistoryListfragment
import kotlinx.android.synthetic.main.activity_on_duty.*

class OnDutyFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id){

            R.id.btnHistory->{

                replaceFragment(HistoryListfragment())

            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.activity_on_duty, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        btnHistory.setOnClickListener(this)

    }
}
