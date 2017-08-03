package com.hocrox.worldwidecdln.warehouse

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_storage_unit.*

class StorageUnitActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage_unit)
        tvSelect.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id) {


            R.id.tvSelect -> {

                startActivity(Intent(this, AddStorageUnitActivity::class.java))

            }
            R.id.ivBackArrow->{

            finish()
            }


        }


    }


}
