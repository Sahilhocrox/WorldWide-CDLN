package com.hocrox.worldwidecdln.imdriver.Fragments.startpur

import android.app.Dialog
import android.os.Bundle
import android.support.v7.widget.AppCompatCheckBox
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.BaseFragment
import com.hocrox.worldwidecdln.imdriver.Fragments.MyNetworksLists
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import kotlinx.android.synthetic.main.fragment_startpur.*
import kotlinx.android.synthetic.main.view_multistop_depature.*
import kotlinx.android.synthetic.main.view_onestop_depature.*
import kotlinx.android.synthetic.main.view_roundtrip_depature.*

import java.util.*

class StartPurFragment : BaseFragment(), View.OnClickListener, TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener, View.OnFocusChangeListener {
    override fun onFocusChange(v: View?, hasFocus: Boolean) {

        when (v!!.id) {

            R.id.etdepTime -> {


                flag = 1
                if (hasFocus) {


                    tpMoveinTime.show(activity.fragmentManager, "Timepickerdialog")
                }

            }
            R.id.etdepDate -> {

                flag = 2
                if (hasFocus) {
                    dpdMoveinDate.show(activity.fragmentManager, "Datepickerdialog")

                }

            }

            R.id.etaarTime -> {

                flag = 5
                if (hasFocus) {
                    tpMoveinTime.show(activity.fragmentManager, "Timepickerdialog")

                }

            }
            R.id.etaarDate -> {

                flag = 6
                if (hasFocus) {
                    dpdMoveinDate.show(activity.fragmentManager, "Datepickerdialog")

                }

            }
            R.id.etdesTime -> {

                flag = 3
                if (hasFocus) {
                    tpMoveinTime.show(activity.fragmentManager, "Timepickerdialog")

                }

            }
            R.id.etdesDate -> {

                flag = 4
                if (hasFocus) {
                    dpdMoveinDate.show(activity.fragmentManager, "Datepickerdialog")

                }

            }

        }

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
            5 -> {
                etaarTime.setText(time)

            }


        }

    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        var value: String
        value = "" + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year


        when (flag) {

            2 -> {
                etdepDate.setText(value)

            }

            4 -> {
                etdesDate.setText(value)

            }
            6 -> {

                etaarDate.setText(value)


            }


        }

    }


    lateinit var dpdMoveinDate: DatePickerDialog
    lateinit var tpMoveinTime: TimePickerDialog

    var flag: Int = 0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_startpur, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvOneStop.setOnClickListener(this)
        tvRoundTrip.setOnClickListener(this)
        tvMultiStops.setOnClickListener(this)
        btnPost.setOnClickListener(this)
        btnPosts.setOnClickListener(this)
        btnSearch.setOnClickListener(this)

        etdesDate.setOnClickListener(this)
        etdesTime.setOnClickListener(this)
        etdepDate.setOnClickListener(this)
        etdepTime.setOnClickListener(this)
        etaarDate.setOnClickListener(this)
        etaarTime.setOnClickListener(this)
        etdesDate.onFocusChangeListener = this
        etdesTime.onFocusChangeListener = this
        etdepDate.onFocusChangeListener = this
        etdepTime.onFocusChangeListener = this
        etaarDate.onFocusChangeListener = this
        etaarTime.onFocusChangeListener = this


        initDate()
        initTime()
    }


    fun showContinentDialog() {

        val dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        val view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_myinfo, null, false)
        val ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        val tvSave: TextView = view.findViewById(R.id.tvSave) as TextView
        val tvContinent: TextView = view.findViewById(R.id.tvContinent) as TextView
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
            replaceFragment(MyNetworksLists())

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

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tvMultiStops -> {

                ll_oneStop.visibility = View.GONE
                ll_roundstop.visibility = View.GONE
                ll_multiStop.visibility = View.VISIBLE
                tvMultiStops.isSelected = true
                tvRoundTrip.isSelected = false
                tvOneStop.isSelected = false
                etdepTime.setText("")
                etdepDate.setText("")
                etaarTime.setText("")
                etaarDate.setText("")
                etdesTime.setText("")
                etdesDate.setText("")
            }

            R.id.tvRoundTrip -> {

                ll_oneStop.visibility = View.GONE
                ll_roundstop.visibility = View.VISIBLE
                ll_multiStop.visibility = View.GONE
                tvMultiStops.isSelected = false
                tvRoundTrip.isSelected = true
                tvOneStop.isSelected = false
                etdepTime.setText("")
                etdepDate.setText("")
                etaarTime.setText("")
                etaarDate.setText("")
                etdesTime.setText("")
                etdesDate.setText("")
            }


            R.id.tvOneStop -> {

                ll_oneStop.visibility = View.VISIBLE
                ll_roundstop.visibility = View.GONE
                ll_multiStop.visibility = View.GONE
                tvMultiStops.isSelected = false
                tvRoundTrip.isSelected = false
                tvOneStop.isSelected = true
                etdepTime.setText("")
                etdepDate.setText("")
                etaarTime.setText("")
                etaarDate.setText("")
                etdesTime.setText("")
                etdesDate.setText("")

            }


            R.id.etdepTime -> {


                flag = 1

                var datepicker:DatePickerDialog= DatePickerDialog()
                datepicker.show(activity.fragmentManager,"DatePickerDialog")

               // var fmanager: FragmentManager = activity.getSupportFragmentManager()


            }
            R.id.etdepDate -> {

                flag = 2

               // var fmanager: FragmentManager = activity.getSupportFragmentManager()

               // var datepicker:DatePickerDialog= DatePickerDialog()
                dpdMoveinDate.show(activity.fragmentManager,"DatePickerDialog")



                //  dpdMoveinDate.show(fragmentManager, "DatePickerDialog")

            }

            R.id.etaarTime -> {

                flag = 5
                // tpMoveinTime.show(getFragmentManager(), "Timepickerdialog");

            }
            R.id.etaarDate -> {


            }
            R.id.etdesTime -> {

                flag = 3
                //var datepicker:DatePickerDialog= DatePickerDialog()
                dpdMoveinDate.show(activity.fragmentManager,"DatePickerDialog")


            }
            R.id.etdesDate -> {

                flag = 4

                dpdMoveinDate.show(activity.fragmentManager,"DatePickerDialog")



            }
            R.id.btnPost -> {

                replaceFragment(PostListFragment())

            }

            R.id.btnPosts -> {


                replaceFragment(PostListFragment())


            }
            R.id.btnSearch -> {

                replaceFragment(PostListFragment())

            }


        }


    }

}

