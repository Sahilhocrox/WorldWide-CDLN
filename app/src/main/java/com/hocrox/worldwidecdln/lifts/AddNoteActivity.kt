package com.hocrox.worldwidecdln.lifts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.hocrox.worldwidecdln.R
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when(v!!.id){

            R.id.ivBackArrow->{

                finish()

            }
            R.id.btnAttachNote->{
                finish()
            }

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        ivBackArrow.setOnClickListener(this)
        btnAttachNote.setOnClickListener(this)
    }
}
