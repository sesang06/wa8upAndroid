package com.overdrive.wa8upandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.overdrive.wa8upandroid.adapter.MenuAdapter
import com.overdrive.wa8upandroid.adapter.StoreAdapter
import com.overdrive.wa8upandroid.model.FilterModel
import com.overdrive.wa8upandroid.model.MenuModel
import com.overdrive.wa8upandroid.model.StoreModel
import kotlinx.android.synthetic.main.activity_store_info.*

class StoreInfoActivity : AppCompatActivity(){
    var menuModels = arrayListOf<MenuModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_info)
        setUpMenus()
        recyclerview_storeinfo_menu.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerview_storeinfo_menu.adapter = MenuAdapter(this, menuModels)
    }
    private fun setUpMenus(){
        menuModels.add(MenuModel("아메리카노","아이스 아메리카노 한 잔", 4000))
        menuModels.add(MenuModel("카페라떼","따뜻하게 몸을 녹이는 카페라떼 한 잔", 4000))
        menuModels.add(MenuModel("쿨 라임 피지오","피지오와 한 해를 함께 한 잔", 5000))
        menuModels.add(MenuModel("아메리카노","아이스 아메리카노 한 잔", 4000))

    }
    companion object {
        private val INTENT_USER_ID = "user_id"

        fun newIntent(context: Context, storeModel: StoreModel): Intent {
            val intent = Intent(context, StoreInfoActivity::class.java)
            return intent
        }
    }
}