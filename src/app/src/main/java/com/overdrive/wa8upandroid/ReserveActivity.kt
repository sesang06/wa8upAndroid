package com.overdrive.wa8upandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.overdrive.wa8upandroid.adapter.MenuAdapter
import com.overdrive.wa8upandroid.model.StoreModel
import kotlinx.android.synthetic.main.activity_store_info.*


class ReserveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve)
    }
    companion object {
        private val INTENT_USER_ID = "user_id"

        fun newIntent(context: Context, storeModel: StoreModel): Intent {
            val intent = Intent(context, ReserveActivity::class.java)
            return intent
        }
    }
}