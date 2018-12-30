package com.sesang06.wa8upandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_filter.*

class FilterActivity : AppCompatActivity() {
    var filterModels = arrayListOf<FilterModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)
        setUpFilterModels()
        recyclerview_filter.layoutManager = GridLayoutManager(this,2)
        recyclerview_filter.adapter = FilterAdapter(this,filterModels)
    }
    fun setUpFilterModels(){
        filterModels.add(FilterModel("카푸치노"))
        filterModels.add(FilterModel("카페라떼"))
        filterModels.add(FilterModel("아메리카노"))
        filterModels.add(FilterModel("에스프레소"))
        filterModels.add(FilterModel("괴식"))

    }
}