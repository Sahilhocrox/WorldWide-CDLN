package com.hocrox.worldwidecdln.warehouse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_request_storage_unit.*


class RequestStoreUnitActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.ivBackArrow -> {
                finish()

            }
            R.id.tvRequest -> {

                Toast.makeText(this, "Requested Successfully", Toast.LENGTH_LONG).show()

            }

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_storage_unit)

        ivBackArrow.setOnClickListener(this)
        tvRequest.setOnClickListener(this)
        cb_forSale.isChecked = true
        cb_LEASE.isChecked = true

        cb_forSale.isEnabled = false
        cb_LEASE.isEnabled = false
        cb_underCover.isEnabled = false
        cb_security.isEnabled = false

    }
}
