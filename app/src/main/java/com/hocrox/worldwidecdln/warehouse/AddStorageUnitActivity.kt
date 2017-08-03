package com.hocrox.worldwidecdln.warehouse

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CompoundButton
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_add_storage_unit.*

class AddStorageUnitActivity : AppCompatActivity(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        when (buttonView!!.id) {

            R.id.cb_Lease -> {


                if (isChecked) {

                    var value: Boolean = cb_forSale.isChecked

                    if (value) {

                        cb_forSale.isChecked = false


                    }

                }


            }
            R.id.cb_forSale -> {

                if (isChecked) {

                    var value: Boolean = cb_Lease.isChecked

                    if (value) {

                        cb_Lease.isChecked = false


                    }

                }

            }
            R.id.cb_public -> {
                if (isChecked) {

                    var value: Boolean = cb_private.isChecked

                    if (value) {

                        cb_private.isChecked = false


                    }

                }

            }
            R.id.cb_private -> {

                if (isChecked) {

                    var value: Boolean = cb_public.isChecked

                    if (value) {

                        cb_public.isChecked = false


                    }

                }


            }

            R.id.cb_underparking -> {
                if (isChecked) {

                    var value: Boolean = cb_coveredParking.isChecked

                    if (value) {

                        cb_coveredParking.isChecked = false


                    }

                }

            }

            R.id.cb_coveredParking -> {
                if (isChecked) {

                    var value: Boolean = cb_underparking.isChecked

                    if (value) {

                        cb_underparking.isChecked = false


                    }

                }
            }
            R.id.cb_driveStorage -> {
                if (isChecked) {

                    var value: Boolean = cb_climateControlled.isChecked

                    if (value) {

                        cb_climateControlled.isChecked = false


                    }

                }
            }
            R.id.cb_climateControlled -> {
                if (isChecked) {

                    var value: Boolean = cb_driveStorage.isChecked

                    if (value) {

                        cb_driveStorage.isChecked = false


                    }

                }
            }


        }


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_storage_unit)
        tvReview.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)
        cb_Lease.setOnCheckedChangeListener(this)
        cb_forSale.setOnCheckedChangeListener(this)
        cb_public.setOnCheckedChangeListener(this)
        cb_private.setOnCheckedChangeListener(this)
        cb_security.setOnCheckedChangeListener(this)
        cb_underparking.setOnCheckedChangeListener(this)
        cb_coveredParking.setOnCheckedChangeListener(this)
        cb_driveStorage.setOnCheckedChangeListener(this)
        cb_climateControlled.setOnCheckedChangeListener(this)


    }

    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvReview -> {

                startActivity(Intent(this, SubmitStoreActivity::class.java))

            }
            R.id.ivBackArrow -> {

                finish()
            }


        }


    }


}
