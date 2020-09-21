package com.example.shoppinglist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Navigate button to ThirdActivity
        my_list2.setOnClickListener {
            startActivity(Intent(this, com.example.shoppinglist.ThirdActivity::class.java))

        }
    }
}