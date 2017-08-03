package com.hocrox.worldwidecdln.inventory.additem.additem.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.CommonSpinnerAdapter
import com.hocrox.worldwidecdln.inventory.myInventory.fragments.AddItemBaseFragment
import kotlinx.android.synthetic.main.fragment_myinven_reviewitem.*

open class AddItemReviewFragment : AddItemBaseFragment(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvNext -> {


                replaceFragment(AddItemShippingFragment())

            }


        }

    }


    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_additem_reviewitem, container, false)
        return view


    }
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        when(buttonView?.id){

            R.id.cb_firm->{

                if(cb_firm.isChecked){

                    cb_offers.isChecked=false
                    cb_firm.isChecked=true

                }



            }

            R.id.cb_offers->{

                if(cb_offers.isChecked){

                    cb_offers.isChecked=true

                    cb_firm.isChecked=false

                }

            }


        }


    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvNext.setOnClickListener(this)
        cb_firm.setOnCheckedChangeListener (this)
        cb_offers.setOnCheckedChangeListener(this)
        setConditonAdapter()
        setShareItemAdapter()
        setReturnAdapter()
        setShippingAdapter()


    }

    fun setConditonAdapter() {

        //************THis is to set the adapter************************8

        var adapter: CommonSpinnerAdapter = CommonSpinnerAdapter(activity, resources.getStringArray(R.array.condition))
        sp_condition.adapter = adapter


    }

    fun setShareItemAdapter() {

        //************THis is to set the adapter************************8

        var adapter: CommonSpinnerAdapter = CommonSpinnerAdapter(activity, resources.getStringArray(R.array.shareItem))
        sp_share.adapter = adapter


    }

    fun setReturnAdapter() {

        //************THis is to set the adapter************************8

        var adapter: CommonSpinnerAdapter = CommonSpinnerAdapter(activity, resources.getStringArray(R.array.returnitem))
        sp_returns.adapter = adapter


    }

    fun setShippingAdapter() {

        //************THis is to set the adapter************************8

        var adapter: CommonSpinnerAdapter = CommonSpinnerAdapter(activity, resources.getStringArray(R.array.shippingItem))
        sp_shipping.adapter = adapter


    }


}
