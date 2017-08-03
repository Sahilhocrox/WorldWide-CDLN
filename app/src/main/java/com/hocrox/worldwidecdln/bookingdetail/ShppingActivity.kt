package com.hocrox.worldwidecdln.bookingdetail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hocrox.worldwidecdln.R

class ShppingActivity : AppCompatActivity() {

    var datalist = ArrayList<String>()
    var imageList = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shpping)


     ///*******************This is used to create Data*********************

            datalist.add("PUR Request")
            imageList.add(R.drawable.shipping_office)

            datalist.add("Logistic Board")
            imageList.add(R.drawable.logistic_board)

            datalist.add("My Personal")
            imageList.add(R.drawable.my_personal)

            datalist.add("Pick Up Radius")
            imageList.add(R.drawable.pickup_radius)

            datalist.add("Shipping Price Per Mile")
            imageList.add(R.drawable.money_bus)

            datalist.add("Driver Task")
            imageList.add(R.drawable.menpick)


            datalist.add("Drivers Avaliable")
            imageList.add(R.drawable.drive_avaiable)

            datalist.add("Track Item")
            imageList.add(R.drawable.item_bus)



     }
}
