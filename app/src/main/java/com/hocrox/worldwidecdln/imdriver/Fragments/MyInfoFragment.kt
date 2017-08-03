package com.hocrox.worldwidecdln.imdriver.Fragments

import android.app.Dialog
import android.os.Bundle
import android.support.v7.widget.AppCompatCheckBox
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_my_info_activtiy.*

class MyInfoFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvContinent -> {

                showContinentDialog("Add-on Continent")
            }

            R.id.tvCountry -> {

                showContinentDialog("Add-on Nation")
            }
            R.id.tvAllNetwoks -> {

                showContinentDialog("ADD-ON SUBNETWORKS")
            }
        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.activity_my_info_activtiy, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvContinent.setOnClickListener(this)
        tvCountry.setOnClickListener(this)
        tvAllNetwoks.setOnClickListener(this)

    }


    fun showContinentDialog(s: String) {

        val dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_myinfo, null, false)
        val ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        val tvSave: TextView = view.findViewById(R.id.tvSave) as TextView
        val tvContinent: TextView = view.findViewById(R.id.tvContinent) as TextView
        tvContinent.text = s
        if (s == "ADD-ON SUBNETWORKS") {

          tvContinent.textSize=12f

        }
        val linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        val checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "NORTH AMERICA"

        val checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "SPAIN"

        val checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "INDIA"

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)


        ivClose.setOnClickListener {

            dialopg.dismiss()

        }
        tvSave.setOnClickListener {

            dialopg.dismiss()

        }
        tvContinent.setOnClickListener {
            dialopg.dismiss()
            if (s == "ADD-ON SUBNETWORKS") {


                replaceFragment(MyNetworksLists())


            }

        }

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp

    }


}
