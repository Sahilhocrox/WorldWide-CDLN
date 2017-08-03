package com.hocrox.worldwidecdln.imdriver.History

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.IDriverHistoryAdapter
import com.hocrox.worldwidecdln.adapters.IDriverMonthAdapter
import com.hocrox.worldwidecdln.imdriver.Fragments.BaseFragment
import com.hocrox.worldwidecdln.imdriver.Fragments.FindTripFragment
import kotlinx.android.synthetic.main.fragment_imdriver_historylist.*

class HistoryListfragment : BaseFragment(), View.OnClickListener, NetworkConnection {
    lateinit var adapter: IDriverMonthAdapter

    override fun connection() {

        replaceFragment(HistoryDetailfragment())

    }

    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvNext -> {

                replaceFragment(FindTripFragment())
            }
            R.id.tvmonth -> {

                if(ll_child1.visibility==View.VISIBLE){

                    ll_child1.visibility=View.GONE
                    rl_monthlist.visibility=View.GONE

                }
                else{

                    ll_child1.visibility=View.VISIBLE
                    rl_monthlist.visibility=View.VISIBLE

                    setMonthAdapter()

                }



            }
            R.id.iv_left -> {

                tvYear.text = (Integer.parseInt(tvYear.text.toString()) - 1).toString()

                adapter.notifyDataSetChanged()

            }
            R.id.iv_right -> {

                tvYear.text = (Integer.parseInt(tvYear.text.toString()) + 1).toString()
                adapter.notifyDataSetChanged()

            }


        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_imdriver_historylist, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {


        tvmonth.setOnClickListener(this)
        iv_left.setOnClickListener(this)
        iv_right.setOnClickListener(this)

        setAdapter()

    }


    fun setAdapter() {

        val list = ArrayList<Any>()
        list.add("American")
        list.add("Chinese")
        list.add("Indian")
        list.add("Japnese")

        var adapter: IDriverHistoryAdapter = IDriverHistoryAdapter(activity, list, this)
        rl_history.layoutManager = LinearLayoutManager(activity)
        rl_history.adapter = adapter

    }

    fun setMonthAdapter() {

        val list = ArrayList<Any>()
        list.add("January")
        list.add("February")
        list.add("March")
        list.add("April")
        list.add("May")
        list.add("June")

        list.add("July")
        list.add("August")

        list.add("September")

        list.add("October")
        list.add("November")
        list.add("December")


        adapter = IDriverMonthAdapter(activity, list, this)
        rl_monthlist.layoutManager = LinearLayoutManager(activity)
        rl_monthlist.adapter = adapter

    }

}
