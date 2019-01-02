package com.overdrive.wa8upandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.overdrive.wa8upandroid.model.FilterModel
import com.overdrive.wa8upandroid.model.StoreModel
import android.support.v7.widget.LinearLayoutManager
import com.overdrive.wa8upandroid.adapter.StoreAdapter
import kotlinx.android.synthetic.main.activity_stores.*
import java.util.logging.Filter

class StoresActivity : AppCompatActivity() {
    var storeModels = arrayListOf<StoreModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stores)
        setUpStores()
        recyclerview_stores.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        recyclerview_stores.adapter = StoreAdapter(this, storeModels) { storeModel: StoreModel -> storeModelClicked(storeModel) }
//        val userId = intent.getStringExtra(INTENT_USER_ID)
//                ?: throw IllegalStateException("field $INTENT_USER_ID missing in Intent")
    }
    fun setUpStores(){
        storeModels.add(StoreModel("스타벅스"))
        storeModels.add(StoreModel("앤젤리너스"))
        storeModels.add(StoreModel("백다방"))
        storeModels.add(StoreModel("카페베네"))
    }
    private fun storeModelClicked(storeModel: StoreModel){
        startActivity(StoreInfoActivity.newIntent(this, storeModel))
    }
    companion object {
        private val INTENT_USER_ID = "user_id"

        fun newIntent(context: Context, filtermodels: ArrayList<FilterModel>): Intent {
            val intent = Intent(context, StoresActivity::class.java)
            intent.putExtra(INTENT_USER_ID, filtermodels.toString())
            return intent
        }
    }
}