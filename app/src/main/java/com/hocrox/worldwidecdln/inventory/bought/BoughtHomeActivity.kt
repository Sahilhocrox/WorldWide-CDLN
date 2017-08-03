package com.hocrox.worldwidecdln.inventory.bought

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.inventory.bought.fragment.BoughtHomeFragment
import kotlinx.android.synthetic.main.activity_search_home.*

class BoughtHomeActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bought_home)
        ivBackArrow.setOnClickListener(this)
        var fragment: Fragment = BoughtHomeFragment()

        inflateFragment(fragment)
    }
    fun inflateFragment(fragment: Fragment) {


        val transaction = supportFragmentManager.beginTransaction()
        val name: String = fragment.javaClass.name
        Log.e("testing",""+name)
        transaction.setCustomAnimations( R.anim.enter_from_right, R.anim.exit_to_left,R.anim.enter_from_left, R.anim.exit_to_right)

        val value = supportFragmentManager.findFragmentByTag(name)

        if (value != null) {
            supportFragmentManager.popBackStack(name,0)
        }

        transaction.replace(R.id.fl_container, fragment)
        transaction.addToBackStack(name)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

        transaction.commit()

    }


    override fun onBackPressed() {

        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
               finish()
        }

    }
    override fun onClick(v: View?) {

        when(v!!.id){

            R.id.ivBackArrow->{

                finish()
            }
        }

    }


    companion object {

        //***********This is to create a public static method and variable*************

        lateinit var instance: BoughtHomeActivity

        fun getInstances(): BoughtHomeActivity {

            return instance
        }


    }

    init {
        instance = this
    }
}
