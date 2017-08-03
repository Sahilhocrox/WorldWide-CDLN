package com.hocrox.worldwidecdln.trackdetail

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.TrackHomeFragment
import kotlinx.android.synthetic.main.activity_add_storage_unit.*

class TrackActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.ivBackArrow -> {

                onBackPressed()
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_track)
        ivBackArrow.setOnClickListener(this)
       inflateFragment(TrackHomeFragment())
    }



    fun inflateFragment(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        val name: String = fragment.javaClass.name
        transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)

        val value = supportFragmentManager.findFragmentByTag(name)

        if (value != null) {
            supportFragmentManager.popBackStack(name, 0)
        }

        transaction.replace(R.id.fl_container, fragment)
        transaction.addToBackStack(name)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

        transaction.commit()

    }

    companion object {

        //***********This is to create a public static method and variable*************

        lateinit var instance: TrackActivity

        fun getInstances(): TrackActivity {

            return instance
        }


    }
    init {
        instance = this
    }

    override fun onBackPressed() {

        if (fragmentManager.backStackEntryCount > 0) {
            fragmentManager.popBackStack()
        } else {
         //   finish()
           super.onBackPressed()
        }

    }
}
