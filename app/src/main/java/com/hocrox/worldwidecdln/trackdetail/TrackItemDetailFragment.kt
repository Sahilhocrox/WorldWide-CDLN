package com.hocrox.worldwidecdln.trackdetail

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.ShippingAdapter
import com.hocrox.worldwidecdln.imdriver.Fragments.TrackBaseFragment
import com.hocrox.worldwidecdln.model.ShippingDetailModel
import kotlinx.android.synthetic.main.fragment_trackitem_detail.*

class TrackItemDetailFragment : TrackBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvTrackingMap -> {

                ll_map.visibility = View.VISIBLE
                ll_shippmentdetail.visibility = View.GONE
                rl_shiplist.visibility = View.GONE

            }
            R.id.tvShippmentActivity -> {

                ll_map.visibility = View.GONE
                ll_shippmentdetail.visibility = View.GONE
                rl_shiplist.visibility = View.VISIBLE


            }

            R.id.tvShippmentDetail -> {

                ll_map.visibility = View.GONE
                ll_shippmentdetail.visibility = View.VISIBLE
                rl_shiplist.visibility = View.GONE


            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_trackitem_detail, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvTrackingMap.setOnClickListener(this)
        tvShippmentActivity.setOnClickListener(this)
        tvShippmentDetail.setOnClickListener(this)
        setAdapter()
    }

    fun setAdapter() {

        val list = ArrayList<ShippingDetailModel>()
        val shiiping: ShippingDetailModel = ShippingDetailModel("1:22",true)
        val shiiping1: ShippingDetailModel = ShippingDetailModel("1:22",false)

        val shiiping2: ShippingDetailModel = ShippingDetailModel("1:22",true)

        val shiiping3: ShippingDetailModel = ShippingDetailModel("1:22",false)


        list.add(shiiping)
        list.add(shiiping1)
        list.add(shiiping1)
        list.add(shiiping2)
        list.add(shiiping3)
        list.add(shiiping3)

        val adapter: ShippingAdapter = ShippingAdapter(activity, list, this)
        rl_shiplist.layoutManager = LinearLayoutManager(activity)
        rl_shiplist.adapter = adapter


    }


}
