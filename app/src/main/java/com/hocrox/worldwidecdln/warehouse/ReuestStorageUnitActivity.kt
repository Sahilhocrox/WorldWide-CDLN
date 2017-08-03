package com.hocrox.worldwidecdln.warehouse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_request_storage_unit.*

class ReuestStorageUnitActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_storage_unit)

        tvRequest.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvRequest -> {



            }

            R.id.ivBackArrow->{

                finish()
            }


        }


    }


}
