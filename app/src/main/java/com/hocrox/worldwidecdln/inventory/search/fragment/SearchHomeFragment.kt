package com.hocrox.worldwidecdln.inventory.search.fragment

import android.app.Dialog
import android.os.Bundle
import android.support.v7.widget.AppCompatCheckBox
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hocrox.worldwidecdln.Interfaces.NetworkConnection
import com.hocrox.worldwidecdln.R
import com.hocrox.worldwidecdln.adapters.CategoryAdapter
import com.hocrox.worldwidecdln.adapters.SearchListAdapter
import kotlinx.android.synthetic.main.fragment_search_home.*

open class SearchHomeFragment : SearchBaseFragment(), NetworkConnection, View.OnClickListener {
    var datalist = ArrayList<Any>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater?.inflate(R.layout.fragment_search_home, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        tvContinent.setOnClickListener(this)
        tvNation.setOnClickListener(this)
        tvNetworks.setOnClickListener(this)

        tvCategory.setOnClickListener(this)
        tvCategoryTopics.setOnClickListener(this)

        tvItemLocation.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        setToolbarText(resources.getString(R.string.inventorySearch))

    }


    fun setData() {

        ///*******************This is used to create Data*********************

        datalist.add("My Inventory")

        datalist.add("Search")

        datalist.add("Add Item")

        datalist.add("Setting/Auction")

        datalist.add("Watch List")

        datalist.add("Bought")


        datalist.add("Post")

        datalist.add("Sold")


        ////************Calling the adapter*********************

        setAdapter()
    }


    fun setAdapter() {

        ///********************This is to set adapter on Recycler view ********************

        var serachListAdapter: SearchListAdapter = SearchListAdapter(activity, datalist, this)

        rl_Searchlist.layoutManager = LinearLayoutManager(activity)

        rl_Searchlist.adapter = serachListAdapter

    }

    override fun connection() {

        replaceFragment(SearchItemFragment(), resources.getString(R.string.inventorySearch))


    }

    fun showContinentDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_warehouse, null, false)

        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Continent"
        textview.setOnClickListener {

            dialopg.dismiss()

        }
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "WORLDWIDE"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "NORTH AMERICA"
        checkbox1.setPadding(3, 3, 3, 3)

        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "SOUTH AMERICA"
        checkbox2.setPadding(3, 3, 3, 3)

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "CONTINENT NAME"
        checkbox3.setPadding(3, 3, 3, 3)

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }

    fun showNationDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_warehouse, null, false)
        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView

        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Nation"
        textview.setOnClickListener {

            dialopg.dismiss()

        }


        var checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "WORLDWIDE"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "NORTH AMERICA"
        checkbox1.setPadding(3, 3, 3, 3)

        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "SOUTH AMERICA"
        checkbox2.setPadding(3, 3, 3, 3)
        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "CONTINENT NAME"
        checkbox3.setPadding(3, 3, 3, 3)
        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }

    fun showNetworksDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)

        var view: View = LayoutInflater.from(activity).inflate(R.layout.dialog_warehouse, null, false)
        var ivClose: ImageView = view.findViewById(R.id.ivClose) as ImageView
        ivClose.setOnClickListener {

            dialopg.dismiss()

        }

        var linearLayout: LinearLayout = view.findViewById(R.id.ll_root) as LinearLayout

        var textview: TextView = view.findViewById(R.id.tvName) as TextView
        textview.text = "Add-on Network"
        textview.setOnClickListener {
            tvNetworks.isSelected = false

            dialopg.dismiss()

        }

        var checkbox: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox.text = "ALL NETWORKS"
        checkbox.setPadding(3, 3, 3, 3)

        var checkbox1: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox1.text = "NATION NETWORKS"
        checkbox1.setPadding(3, 3, 3, 3)


        var checkbox2: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox2.text = "NETWORK NAME"
        checkbox2.setPadding(3, 3, 3, 3)

        var checkbox3: AppCompatCheckBox = AppCompatCheckBox(activity)
        checkbox3.text = "NETWORK NAME"
        checkbox3.setPadding(3, 3, 3, 3)

        linearLayout.addView(checkbox)
        linearLayout.addView(checkbox1)
        linearLayout.addView(checkbox2)
        linearLayout.addView(checkbox3)

        dialopg.setContentView(view)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp


    }

    override fun onClick(v: View?) {


        when (v!!.id) {

            R.id.tvContinent -> {

                tvContinent.isSelected = true
                showContinentDialog()
            }

            R.id.tvNation -> {
                tvNation.isSelected = true
                showNationDialog()
            }

            R.id.tvNetworks -> {
                tvNetworks.isSelected = true

                showNetworksDialog()
            }

            R.id.tvCategory -> {

                tvCategory.isSelected=true
                showCategoryDialog()

            }

            R.id.tvCategoryTopics -> {
                tvCategoryTopics.isSelected=true
                showSubTopicsDialog()

            }

            R.id.tvItemLocation -> {
                tvItemLocation.isSelected=true

                showItemLocationDialog()
            }


        }

    }

    fun showCategoryDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var views: View = LayoutInflater.from(activity).inflate(R.layout.dialog_categorytopics, null)

        var recyclerView: RecyclerView = views.findViewById(R.id.rl_category) as RecyclerView


        var categoryList = ArrayList<Any>()

        categoryList.add("Collectibles")
        categoryList.add("Fashion")
        categoryList.add("Sporting Goods")
        categoryList.add("Electronics")
        categoryList.add("Home and Outdoors")
        categoryList.add("Business and Industrial")
        categoryList.add("Toys")
        categoryList.add("Software and Media")
        categoryList.add("Cars and Trucks")
        categoryList.add("Commerical Trucks")


        var categoryAdapter: CategoryAdapter = CategoryAdapter(activity, this, categoryList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = categoryAdapter


        dialopg.setContentView(views)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }


    fun showSubTopicsDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var views: View = LayoutInflater.from(activity).inflate(R.layout.dialog_categorytopics, null)

        var textView: TextView = views.findViewById(R.id.tvName) as TextView

        textView.text = "Select SubTopic"


        var recyclerView: RecyclerView = views.findViewById(R.id.rl_category) as RecyclerView


        var categoryList = ArrayList<Any>()

        categoryList.add("Collectibles")
        categoryList.add("Coins")
        categoryList.add("Memorabilla")
        categoryList.add("Antques")
        categoryList.add("Photos")


        var categoryAdapter: CategoryAdapter = CategoryAdapter(activity, this, categoryList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = categoryAdapter


        dialopg.setContentView(views)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }


    fun showItemLocationDialog() {


        var dialopg: Dialog = Dialog(activity)
        dialopg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        var views: View = LayoutInflater.from(activity).inflate(R.layout.dialog_categorytopics, null)

        var textView: TextView = views.findViewById(R.id.tvName) as TextView

        textView.text = "Select Item Location"


        var recyclerView: RecyclerView = views.findViewById(R.id.rl_category) as RecyclerView


        var categoryList = ArrayList<Any>()

        categoryList.add("Warehouse")
        categoryList.add("Storage Unit")
        categoryList.add("Business")
        categoryList.add("Home")

        var categoryAdapter: CategoryAdapter = CategoryAdapter(activity, this, categoryList)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = categoryAdapter


        dialopg.setContentView(views)
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialopg.window.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT


        dialopg.show()

        dialopg.window.attributes = lp
    }


}
