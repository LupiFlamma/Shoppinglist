package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import com.example.shoppinglist.SecondActivity as SecondActivity1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Navigate button to SecondActivity
        new_lists1.setOnClickListener {
            startActivity(Intent(this, com.example.shoppinglist.SecondActivity::class.java))
        }

        //Navigate button to ThirdActivity
        my_list1.setOnClickListener {
            startActivity(Intent(this, com.example.shoppinglist.ThirdActivity::class.java))
        }

    }
}