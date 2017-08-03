package com.hocrox.worldwidecdln.warehouse

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_search_storage_unit.*

class SearchStorageUnitActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_storage_unit)
        tvMoreInformation.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        tvContinue.setOnClickListener(this)
        tvClose.setOnClickListener(this)
    }

    override fun onClick(v: View?) {


        when (v!!.id) {

            R.id.tvMoreInformation -> {

                if(ll_checkbox.visibility==View.VISIBLE){

                    ll_checkbox.visibility=View.GONE

                }
                else if(ll_checkbox.visibility==View.GONE){

                    ll_checkbox.visibility=View.VISIBLE


                }

            }
            R.id.ivBackArrow->{

                finish()

            }
            R.id.tvContinue->{

                startActivity(Intent(this, StorageUnitSearchResutActivity::class.java))


            }
            R.id.tvClose->{
                finish()

            }


        }

    }


}
