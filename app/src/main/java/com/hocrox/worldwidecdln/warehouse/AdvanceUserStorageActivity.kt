package com.hocrox.worldwidecdln.warehouse

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.google.android.gms.common.GooglePlayServicesNotAvailableException
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_advanced_user.*

class AdvanceUserStorageActivity : AppCompatActivity(), View.OnClickListener {
    var checkValue: Boolean = false
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.ivClose -> {

                finish()
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_user)
        checkValue = intent.getBooleanExtra("checkedState", false)
        ivClose.setOnClickListener(this)
        initView()

    }

    fun initView() {

        if (checkValue) {

            view_storage.visibility = View.GONE
            view_warehouse.visibility = View.VISIBLE

        } else {

            view_storage.visibility = View.VISIBLE
            view_warehouse.visibility = View.GONE


        }


    }
}
