package com.hocrox.worldwidecdln.warehouse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hocrox.worldwidecdln.adapters.StorageUnitSearchResultAdapter
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_storage_unit_resut.*

class StorageUnitSearchResutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.ivBackArrow -> {

                finish()
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage_unit_resut)
        ivBackArrow.setOnClickListener(this)
        setAdapter()


    }

    fun setAdapter() {

        ///******************THis is to set the adapter on the recycler view ************


        var dataList = ArrayList<String>()

        for (i in 1..5) {

            dataList.add("JVT PVT. LTD")

        }


        var storageAdapter: StorageUnitSearchResultAdapter = StorageUnitSearchResultAdapter(this, dataList)
        var linearLayout = LinearLayoutManager(this)
        rl_searchList.layoutManager = linearLayout
        rl_searchList.adapter = storageAdapter


    }

}
