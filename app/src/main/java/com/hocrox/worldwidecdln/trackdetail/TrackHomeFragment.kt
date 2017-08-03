package com.hocrox.worldwidecdln.imdriver.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.trackdetail.SearchTrackPackageFragment
import kotlinx.android.synthetic.main.fragment_track_home.*

class TrackHomeFragment : TrackBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvTrackPackage->{

                replaceFragment(SearchTrackPackageFragment())

            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_track_home, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        tvTrackPackage.setOnClickListener(this)


    }




}
