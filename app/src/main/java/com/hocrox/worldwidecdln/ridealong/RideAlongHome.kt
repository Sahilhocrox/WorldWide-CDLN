package com.hocrox.worldwidecdln.ridealong

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.lifts.roundtrip.RoundTripPostListActivity
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import kotlinx.android.synthetic.main.activity_ride_along_home.*
import kotlinx.android.synthetic.main.view_onestop_depature.*
import kotlinx.android.synthetic.main.view_roundtrip_depature.*
import java.util.*

class RideAlongHome : AppCompatActivity(), View.OnClickListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener, View.OnFocusChangeListener {
    var flag: Int = 0
    override fun onFocusChange(v: View?, hasFocus: Boolean) {

        when (v!!.id) {

            R.id.etdepTime -> {


                flag = 1
                if (hasFocus) {


                    tpMoveinTime.show(fragmentManager, "Timepickerdialog")
                }

            }
            R.id.etdepDate -> {

                flag = 2
                if (hasFocus) {
                    dpdMoveinDate.show(fragmentManager, "Datepickerdialog")

                }

            }

            R.id.etaarTime -> {

                flag = 5
                if (hasFocus) {
                    tpMoveinTime.show(fragmentManager, "Timepickerdialog")

                }

            }
            R.id.etaarDate -> {

                flag = 6
                if (hasFocus) {
                    dpdMoveinDate.show(fragmentManager, "Datepickerdialog")

                }

            }
            R.id.etdesTime -> {

                flag = 3
                if (hasFocus) {
                    tpMoveinTime.show(fragmentManager, "Timepickerdialog")

                }

            }
            R.id.etdesDate -> {

                flag = 4
                if (hasFocus) {
                    dpdMoveinDate.show(fragmentManager, "Datepickerdialog")

                }

            }

        }
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.btnSearch -> {

                startActivity(Intent(this, RideDriverListActivity::class.java))

            }

            R.id.tvRoundTrip -> {

                ll_oneStop.visibility = View.GONE
                ll_roundstop.visibility = View.VISIBLE
                tvOneStop.isSelected = false
                tvRoundTrip.isSelected = true
                etdepTime.setText("")
                etdepDate.setText("")
                etdesTime.setText("")
                etdesDate.setText("")
            }
            R.id.tvOneStop -> {

                ll_oneStop.visibility = View.VISIBLE
                ll_roundstop.visibility = View.GONE

                tvOneStop.isSelected = true
                tvRoundTrip.isSelected = false
                etdepTime.setText("")
                etdepDate.setText("")
                etdesTime.setText("")
                etdesDate.setText("")
            }

            R.id.btnPost -> {

                startActivity(Intent(this, RoundTripPostListActivity::class.java))
            }

            R.id.tvVehicles -> {

                showVehicleTypeDialog()
            }
            R.id.tvAddItems -> {

                showAddItemsDialog()

            }
            R.id.ivClose->{
                finish()
            }


        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ride_along_home)

        //************This is to instiate all the views***************************

        tvMultiStops.visibility = View.GONE
        btnSearch.setOnClickListener(this)
        tvRoundTrip.setOnClickListener(this)
        tvOneStop.setOnClickListener(this)

        btnPost.setOnClickListener(this)
        tvVehicles.setOnClickListener(this)
        tvAddItems.setOnClickListener(this)
        etdepTime.onFocusChangeListener = this
        etdepDate.onFocusChangeListener = this
        etdesTime.onFocusChangeListener = this
        etdesDate.onFocusChangeListener = this

        etdepTime.setOnClickListener(this)
        etdepDate.setOnClickListener(this)
        etdesTime.setOnClickListener(this)
        etdesDate.setOnClickListener(this)
        tvVehicles.setOnClickListener(this)
        tvAddItems.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

        tvOneStop.isSelected = true
        initDate()
        initTime()


    }

    fun showAddItemsDialog() {

        val dialopg: Dialog = Dialog(this)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val view: View = LayoutInflater.from(this).inflate(R.layout.dialog_itemtype, null, false)
        val ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        val tvAdultAdd: TextView = view.findViewById(R.id.tvAdultAdd) as TextView

        val tvAdultMinus: TextView = view.findViewById(R.id.tvAdultMinus) as TextView
        val tvAdultText: TextView = view.findViewById(R.id.tvAdultTextAdd) as TextView
        val tvYoutthAdd: TextView = view.findViewById(R.id.tvYouthAdd) as TextView
        val tvYoutthMinus: TextView = view.findViewById(R.id.tvYouthMinus) as TextView
        val tvYoutthText: TextView = view.findViewById(R.id.tvYouthTextAdd) as TextView
        val tvLuggareAdd: TextView = view.findViewById(R.id.tvLuggageAdd) as TextView
        val tvLuggaeMinus: TextView = view.findViewById(R.id.tvLuggageMinus) as TextView
        val tvLuggageText: TextView = view.findViewById(R.id.tvLuggageTextAdd) as TextView
        val tvBoxesAdd: TextView = view.findViewById(R.id.tvBoxesAdd) as TextView
        val tvBoxesMinus: TextView = view.findViewById(R.id.tvBoxMinus) as TextView
        val tvBoxesText: TextView = view.findViewById(R.id.tvBoxTextAdd) as TextView
        val tvEnvelopesAdd: TextView = view.findViewById(R.id.tvEnvelopeAdd) as TextView
        val tvEnevelopesMinus: TextView = view.findViewById(R.id.tvEnevelopeMinus) as TextView
        val tvEnevelopesText: TextView = view.findViewById(R.id.tvenevelopeTextAdd) as TextView

        tvAdultMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvAdultText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvAdultText.text = value.toString()

            }

        }
        tvAdultAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvAdultText.text.toString())
            value = value + 1
            tvAdultText.text = value.toString()


        }
        tvYoutthAdd.setOnClickListener {


            var value: Int = Integer.parseInt(tvYoutthText.text.toString())
            value = value + 1
            tvYoutthText.text = value.toString()

        }
        tvYoutthMinus.setOnClickListener {


            var value: Int = Integer.parseInt(tvYoutthText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvYoutthText.text = value.toString()

            }

        }
        tvLuggareAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvLuggageText.text.toString())
            value = value + 1
            tvLuggageText.text = value.toString()


        }
        tvLuggaeMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvLuggageText.text.toString())


            if (value - 1 >= 0) {
                value = value - 1
                tvLuggageText.text = value.toString()

            }

        }
        tvBoxesAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvBoxesText.text.toString())

            value = value + 1


            tvBoxesText.text = value.toString()


        }
        tvBoxesMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvBoxesText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvBoxesText.text = value.toString()

            }


        }
        tvEnvelopesAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvEnevelopesText.text.toString())

            value = value + 1


            tvEnevelopesText.text = value.toString()


        }
        tvEnevelopesMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvEnevelopesText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvEnevelopesText.text = value.toString()

            }
        }



        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp

    }


    fun showVehicleTypeDialog() {


        val dialopg: Dialog = Dialog(this)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val view: View = LayoutInflater.from(this).inflate(R.layout.dilaog_vehicle, null, false)
        val ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        val tvAddOn:TextView=view.findViewById(R.id.tvAddOn) as TextView
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }
        tvAddOn.setOnClickListener {

            showTrailerTypeDialog()

        }

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp

    }

    override fun onTimeSet(view: TimePickerDialog?, hourOfDay: Int, minute: Int, second: Int) {


        val hourString = if (hourOfDay < 10) "0" + hourOfDay else "" + hourOfDay
        val minuteString = if (minute < 10) "0" + minute else "" + minute
        val secondString = if (second < 10) "0" + second else "" + second
        val time = "" + hourString + " : " + minuteString + " : " + secondString

        when (flag) {


            1 -> {

                etdepTime.setText(time)

            }
            3 -> {
                etdesTime.setText(time)

            }


        }

    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val value: String
        value = "" + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year


        when (flag) {

            2 -> {
                etdepDate.setText(value)

            }

            4 -> {
                etdesDate.setText(value)

            }


        }

    }
    fun showTrailerTypeDialog() {


        val dialopg: Dialog = Dialog(this)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val view: View = LayoutInflater.from(this).inflate(R.layout.dilaog_vehicledetials, null, false)
        val ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        val done:TextView=view.findViewById(R.id.tvDone) as TextView
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }
        done.setOnClickListener {
            finish()
        }

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp

    }
    fun initDate() {

        val now = Calendar.getInstance()
        dpdMoveinDate = DatePickerDialog.newInstance(this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        )

    }

    fun initTime() {
        val now = Calendar.getInstance()

        tpMoveinTime = TimePickerDialog.newInstance(
                this,
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE), true
        )

    }

    lateinit var dpdMoveinDate: DatePickerDialog
    lateinit var tpMoveinTime: TimePickerDialog

}
