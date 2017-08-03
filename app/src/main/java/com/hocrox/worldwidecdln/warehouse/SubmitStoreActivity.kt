package com.hocrox.worldwidecdln.warehouse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_submit_storage.*

class SubmitStoreActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.ivBackArrow -> {
                finish()
            }

            R.id.tvSubmit -> {

                Toast.makeText(this, "Submit Successfully", Toast.LENGTH_LONG).show()

            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_storage)

        //***********This is to instiate the view*******************

        ivBackArrow.setOnClickListener(this)
        tvSubmit.setOnClickListener(this)
        cb_forSale.isChecked = true
        cb_LEASE.isChecked = true
        cb_forSale.isEnabled = false
        cb_LEASE.isEnabled = false
        cb_security.isEnabled = false
        cb_underCover.isEnabled = false

    }
}

