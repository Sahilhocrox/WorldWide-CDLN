package com.hocrox.worldwidecdln.imdriver.Fragments.startpur

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.BaseFragment
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog

class TripRequestFragment : BaseFragment() {




    lateinit var dpdMoveinDate: DatePickerDialog
    lateinit var tpMoveinTime: TimePickerDialog

    var flag: Int = 0

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_idriver_request, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {


    }

}

