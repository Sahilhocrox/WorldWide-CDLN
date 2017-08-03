package com.hocrox.worldwidecdln.imdriver.Fragments

import android.app.Dialog
import android.os.Bundle
import android.support.v7.widget.AppCompatCheckBox
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.startpur.StartPurHomeFragment
import com.hocrox.worldwidecdln.model.AddItemModel
import kotlinx.android.synthetic.main.activity_ready_driver.*

class ReadyDriverFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvOnDuty -> {

                replaceFragment(OnDutyFragment())

            }

            R.id.tvInfo -> {

                replaceFragment(MyInfoFragment())

            }
            R.id.tvStartPur -> {

                replaceFragment(StartPurHomeFragment())


            }
            R.id.tvVehicles -> {


                showVehicleTypeDialog()

            }
            R.id.tvAddItems -> {

                showAddItemsDialog()

            }

            R.id.tvPostedTrips -> {

                replaceFragment(PostTripFragment())
            }

        }


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.activity_ready_driver, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        tvOnDuty.setOnClickListener(this)
        tvInfo.setOnClickListener(this)
        tvStartPur.setOnClickListener(this)
        tvVehicles.setOnClickListener(this)
        tvAddItems.setOnClickListener(this)
        tvPostedTrips.setOnClickListener(this)
    }


    fun showAddItemsDialog() {

        val dialog: Dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var totalValue: String = ""
        var totalValues: String = ""

        val view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_itemtype, null, false)

        val title: TextView = view.findViewById(R.id.tvTitle) as TextView
        title.text = "SELECT THE AMOUNT OF ITEMS"
        val tvAddItems: TextView = view.findViewById(R.id.tvAddItems) as TextView
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
        val tvName: TextView = view.findViewById(R.id.tvName) as TextView

        var hashmap = HashMap<String, AddItemModel?>()
        tvName.text = "ADD"

        tvName.setOnClickListener {

            dialog.dismiss()
            Log.e("Testing", "" + hashmap)
           // var items = hashmap.values


            val valuesList = hashmap.values


            for(items in valuesList){

                var value:AddItemModel=items as AddItemModel

                Log.e("Tesing",""+value.quantity)

                totalValues=totalValues+"  "+value.name+" : "+value.quantity


            }

            tvSelelctedItems.visibility = View.VISIBLE

            tvSelelctedItems.text = totalValues

        }

        tvAdultMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvAdultText.text.toString())

            if (value - 1 >= 0) {
                value = value - 1

                if (hashmap.containsKey("Adult 18+")) {

                    var addItem: AddItemModel? = hashmap.get("Adult 18+")

                    addItem?.quantity = value
                    if (value == 0) {

                        hashmap.remove("Adult 18+")
                    }

                } else {


                    var addItem: AddItemModel? = AddItemModel()
                    addItem?.quantity = value
                    addItem?.name = "Adult 18+"
                    hashmap.put("Adult 18+", addItem)
                    if (value == 0) {

                        hashmap.remove("Adult 18+")
                    }
                }

                tvAdultText.text = value.toString()

                if (totalValue.contains("Adult 18+")) {

                    if (value == 0) {


                        totalValue = totalValue.replace("Adult 18+", "")

                    }

                }

            }
            tvAddItems.text = totalValue

        }
        tvAdultAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvAdultText.text.toString())
            value = value + 1
            tvAdultText.text = value.toString()
            if (totalValue.contains("Adult 18+")) {

            } else {

                totalValue = totalValue + " " + "Adult 18+"
            }
            if (hashmap.containsKey("Adult 18+")) {

                var addItem: AddItemModel? = hashmap.get("Adult 18+")

                addItem?.quantity = value


            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Adult 18+"
                hashmap.put("Adult 18+", addItem)

            }


            tvAddItems.text = totalValue

        }
        tvYoutthAdd.setOnClickListener {


            var value: Int = Integer.parseInt(tvYoutthText.text.toString())
            value = value + 1
            tvYoutthText.text = value.toString()
            if (totalValue.contains("Youth 18+")) {

            } else {

                totalValue = totalValue + " " + "Youth 18+"
            }
            if (hashmap.containsKey("Youth 18+")) {

                var addItem: AddItemModel? = hashmap.get("Youth 18+")

                addItem?.quantity = value


            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Youth 18+"
                hashmap.put("Youth 18+", addItem)

            }
            tvAddItems.text = totalValue

        }
        tvYoutthMinus.setOnClickListener {


            var value: Int = Integer.parseInt(tvYoutthText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvYoutthText.text = value.toString()
                if (totalValue.contains("Youth 18+")) {

                    if (value == 0) {

                        totalValue = totalValue.replace("Youth 18+", "")

                    }

                }

                if (hashmap.containsKey("Youth 18+")) {

                    var addItem: AddItemModel? = hashmap.get("Youth 18+")

                    addItem?.quantity = value
                    if (value == 0) {

                        hashmap.remove("Youth 18+")
                    }


                } else {


                    var addItem: AddItemModel? = AddItemModel()
                    addItem?.quantity = value
                    addItem?.name = "Youth 18+"
                    hashmap.put("Youth 18+", addItem)

                    if (value == 0) {

                        hashmap.remove("Youth 18+")
                    }

                }

            }
            tvAddItems.text = totalValue


        }
        tvLuggareAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvLuggageText.text.toString())
            value = value + 1
            tvLuggageText.text = value.toString()
            if (totalValue.contains("Luggage")) {

            } else {

                totalValue = totalValue + " " + "Luggage"
            }
            if (hashmap.containsKey("Luggage")) {

                var addItem: AddItemModel? = hashmap.get("Luggage")

                addItem?.quantity = value


            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Luggage"
                hashmap.put("Luggage", addItem)

            }
            tvAddItems.text = totalValue

        }
        tvLuggaeMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvLuggageText.text.toString())


            if (value - 1 >= 0) {
                value = value - 1
                tvLuggageText.text = value.toString()
                if (totalValue.contains("Luggage")) {

                    if (value == 0) {

                        totalValue = totalValue.replace("Luggage", "")

                    }

                }
            }

            if (hashmap.containsKey("Luggage")) {

                var addItem: AddItemModel? = hashmap.get("Luggage")

                addItem?.quantity = value
                if (value == 0) {

                    hashmap.remove("Luggage")
                }

            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Luggage"
                hashmap.put("Luggage", addItem)
                if (value == 0) {

                    hashmap.remove("Luggage")
                }
            }
            tvAddItems.text = totalValue

        }

        tvBoxesAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvBoxesText.text.toString())

            value = value + 1


            tvBoxesText.text = value.toString()
            if (totalValue.contains("Boxes")) {

            } else {

                totalValue = totalValue + " " + "Boxes"

            }

            if (hashmap.containsKey("Boxes")) {

                var addItem: AddItemModel? = hashmap.get("Boxes")

                addItem?.quantity = value


            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Boxes"
                hashmap.put("Boxes", addItem)

            }

            tvAddItems.text = totalValue

        }
        tvBoxesMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvBoxesText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvBoxesText.text = value.toString()
                if (totalValue.contains("Boxes")) {

                    if (value == 0) {

                        totalValue = totalValue.replace("Boxes", "")

                    }

                }

            }
            if (hashmap.containsKey("Boxes")) {

                var addItem: AddItemModel? = hashmap.get("Boxes")

                addItem?.quantity = value

                if (value == 0) {

                    hashmap.remove("Boxes")
                }
            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Boxes"
                hashmap.put("Boxes", addItem)
                if (value == 0) {

                    hashmap.remove("Boxes")
                }
            }

            tvAddItems.text = totalValue

        }
        tvEnvelopesAdd.setOnClickListener {

            var value: Int = Integer.parseInt(tvEnevelopesText.text.toString())

            value = value + 1


            tvEnevelopesText.text = value.toString()
            if (totalValue.contains("Envelopes")) {

            } else {

                totalValue = totalValue + " " + "Envelopes"
            }
            if (hashmap.containsKey("Envelopes")) {

                var addItem: AddItemModel? = hashmap.get("Envelopes")

                addItem?.quantity = value


            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Envelopes"
                hashmap.put("Envelopes", addItem)

            }

            tvAddItems.text = totalValue

        }
        tvEnevelopesMinus.setOnClickListener {

            var value: Int = Integer.parseInt(tvEnevelopesText.text.toString())



            if (value - 1 >= 0) {
                value = value - 1
                tvEnevelopesText.text = value.toString()
                if (totalValue.contains("Envelopes")) {

                    if (value == 0) {

                        totalValue = totalValue.replace("Envelopes", "")

                    }

                }
            }
            if (hashmap.containsKey("Envelopes")) {

                var addItem: AddItemModel? = hashmap.get("Envelopes")

                addItem?.quantity = value
                if (value == 0) {

                    hashmap.remove("Envelopes")
                }

            } else {


                var addItem: AddItemModel? = AddItemModel()
                addItem?.quantity = value
                addItem?.name = "Envelopes"
                hashmap.put("Envelopes", addItem)
                if (value == 0) {

                    hashmap.remove("Envelopes")
                }
            }
            tvAddItems.text = totalValue

        }


        ivClose.setOnClickListener {

            dialog.dismiss()

        }
        Log.e("value", "" + totalValue)


        dialog.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialog.show()

        dialog.window.attributes = lp

    }

    fun showVehicleTypeDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_vehicletype, null, false)
        var rootLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout
        var submit: TextView = view.findViewById(R.id.tvName) as TextView
        submit.text = "Add-on Trailer"
        var checkbox1 = AppCompatCheckBox(activity)
        checkbox1.text = "BMW 413 XL 2013"
        var checkbox2 = AppCompatCheckBox(activity)
        checkbox2.text = "GMC 3500,2015"

        var checkbox3 = AppCompatCheckBox(activity)
        checkbox3.text = "CADILLAC SVT,2012"


        rootLayout.addView(checkbox1)
        rootLayout.addView(checkbox2)
        rootLayout.addView(checkbox3)


        dialopg.setContentView(view)

        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
        submit.setOnClickListener {
            dialopg.dismiss()
            showSubmitTrailorDialog()

        }
    }


    fun showSubmitTrailorDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_vehicletype, null, false)
        var rootLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout
        var submit: TextView = view.findViewById(R.id.tvName) as TextView
        submit.text = "Submit New Trailer"
        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "REEFER AIR CONDITION"
        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "TRAILER"

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "FREEZER"


        rootLayout.addView(checkbox1)
        rootLayout.addView(checkbox2)
        rootLayout.addView(checkbox3)


        dialopg.setContentView(view)

        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
        submit.setOnClickListener {
            dialopg.dismiss()
            replaceFragment(AddTrailerimageFragment())

        }
    }
}

