package com.hocrox.worldwidecdln.trackdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.imdriver.Fragments.TrackBaseFragment
import kotlinx.android.synthetic.main.fragment_track_search.*

class SearchTrackPackageFragment : TrackBaseFragment(), View.OnClickListener {
    override fun onClick(v: View?) {

        when (v!!.id) {

            R.id.tvSearch -> {

               replaceFragment(TrackItemDetailFragment())

            }

        }

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_track_search, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        tvSearch.setOnClickListener(this)


    }




}
