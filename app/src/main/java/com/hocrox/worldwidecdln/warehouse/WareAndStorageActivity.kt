package com.hocrox.worldwidecdln.warehouse

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatCheckBox
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import kotlinx.android.synthetic.main.activity_ware_and_storage.*
import java.util.*


class WareAndStorageActivity : AppCompatActivity(), View.OnClickListener, DatePickerDialog.OnDateSetListener, View.OnFocusChangeListener {


    override fun onFocusChange(v: View?, hasFocus: Boolean) {


        when (v!!.id) {


        /*  R.id.etMoveInDate -> {


              if (hasFocus) {

                  flag=1
                  dpdMoveinDate.show(getFragmentManager(), "Datepickerdialog");

              }

          }
*/
            R.id.etMoveOutDate -> {

                if (hasFocus) {
                    flag = 2
                    dpdMoveinDate.show(fragmentManager, "Datepickerdialog")
                }


            }

        }


    }


    lateinit var dpdMoveinDate: DatePickerDialog

    //************This  variable is due to identify which view open that view********


    var flag: Int = 0

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {

        when (flag) {
            1 -> {
                val date = "" + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year
                etMoveInDate.setText(date)

            }

            2 -> {

                val date = "" + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year
                etMoveOutDate.setText(date)


            }

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ware_and_storage)

        //*******************This is to intialize all the views**********************

        tvWareHouse.isSelected = true
        tvStorageUnit.setOnClickListener(this)
        tvAddPlace.setOnClickListener(this)
        tvSearch.setOnClickListener(this)
        tvAdvanceUser.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        tvWareHouse.setOnClickListener(this)
        etMoveInDate.onFocusChangeListener = this
        etMoveOutDate.onFocusChangeListener = this
        etMoveInDate.setOnClickListener(this)
        etMoveOutDate.setOnClickListener(this)
        tvMoveInDate.setOnClickListener(this)
        tvMoveOutDate.setOnClickListener(this)
        tvContinent.setOnClickListener(this)
        tvNetworks.setOnClickListener(this)
        tvNation.setOnClickListener(this)

        initDate()

    }

    fun initDate() {

        val now = Calendar.getInstance()
        dpdMoveinDate = DatePickerDialog.newInstance(
                this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        )


    }

    override fun onClick(v: View?) {


        when (v!!.id) {

            R.id.tvAddPlace -> {

                startActivity(Intent(this, StorageUnitActivity::class.java))

            }
            R.id.tvSearch -> {

                startActivity(Intent(this, SearchStorageUnitActivity::class.java))

            }

            R.id.tvAdvanceUser -> {


                startActivity(Intent(this, AdvanceUserStorageActivity::class.java).putExtra("checkedState", tvWareHouse.isSelected))


            }

            R.id.ivBackArrow -> {
                finish()
            }


            R.id.tvStorageUnit -> {

                tvWareHouse.isSelected = false
                tvStorageUnit.isSelected = true

            }
            R.id.tvWareHouse -> {

                tvWareHouse.isSelected = true
                tvStorageUnit.isSelected = false

            }

            R.id.tvMoveInDate -> {

                flag = 1
                dpdMoveinDate.show(fragmentManager, "Datepickerdialog")

            }
            R.id.tvMoveOutDate -> {

                flag = 2
                dpdMoveinDate.show(fragmentManager, "Datepickerdialog")
            }

            R.id.etMoveInDate -> {

                flag = 1
                dpdMoveinDate.show(fragmentManager, "Datepickerdialog")

            }
            R.id.etMoveOutDate -> {

                flag = 2
                dpdMoveinDate.show(fragmentManager, "Datepickerdialog")
            }

            R.id.tvContinent -> {

                tvContinent.isSelected = true
                showContinentDialog()

            }

            R.id.tvNation -> {

                tvNation.isSelected = true
                showNationDialog()

            }
            R.id.tvNetworks -> {

                tvNetworks.isSelected = true
                showNetworksDialog()

            }
        }

    }


    fun showContinentDialog() {


        var dialopg: Dialog = Dialog(this)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var view: View = LayoutInflater.from(this).inflate(R.layout.dialog_warehouse, null, false)

        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Continent"
        textview.setOnClickListener {

            tvContinent.isSelected = false
            dialopg.dismiss()

        }
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var checkbox: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox.text = "WORLDWIDE"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox1.text = "NORTH AMERICA"
        checkbox1.setPadding(3, 3, 3, 3)

        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox2.text = "SOUTH AMERICA"
        checkbox2.setPadding(3, 3, 3, 3)

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox3.text = "CONTINENT NAME"
        checkbox3.setPadding(3, 3, 3, 3)

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }

    fun showNationDialog() {


        var dialopg: Dialog = Dialog(this)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(this).inflate(R.layout.dialog_warehouse, null, false)
        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView

        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Nation"
        textview.setOnClickListener {
            tvNation.isSelected = false

            dialopg.dismiss()

        }


        var checkbox: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox.text = "WORLDWIDE"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox1.text = "NORTH AMERICA"
        checkbox1.setPadding(3, 3, 3, 3)

        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox2.text = "SOUTH AMERICA"
        checkbox2.setPadding(3, 3, 3, 3)
        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox3.text = "CONTINENT NAME"
        checkbox3.setPadding(3, 3, 3, 3)
        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }

    fun showNetworksDialog() {


        var dialopg: Dialog = Dialog(this)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(this).inflate(R.layout.dialog_warehouse, null, false)
        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Network"
        textview.setOnClickListener {
            tvNetworks.isSelected = false

            dialopg.dismiss()

        }

        var checkbox: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox.text = "ALL NETWORKS"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox1.text = "NATION NETWORKS"
        checkbox1.setPadding(3, 3, 3, 3)


        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox2.text = "NETWORK NAME"
        checkbox2.setPadding(3, 3, 3, 3)

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(this)
        checkbox3.text = "NETWORK NAME"
        checkbox3.setPadding(3, 3, 3, 3)

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp


    }


}
