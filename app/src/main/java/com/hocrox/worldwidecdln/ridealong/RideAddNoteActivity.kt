package com.hocrox.worldwidecdln.ridealong

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_add_note.*

/**
 * Created by sahilgoyal on 11/7/17.
 */
class RideAddNoteActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {


            R.id.btnAttachNote -> {
                finish()
            }

            R.id.ivBackArrow -> {

                finish()
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        //*********This is to instiuate the view******************
        tv_toolbar.setText(R.string.rideAlong)
        btnAttachNote.setOnClickListener(this)
        ivBackArrow.setOnClickListener(this)

    }
}