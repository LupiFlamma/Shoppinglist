package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.new_list_button1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Navigate button to SecondActivity
        new_list_button1.setOnClickListener {
            startActivity(Intent(this, com.example.shoppinglist.SecondActivity::class.java))
        }

        //Navigate button to
        list_button1.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        //Navigate button to
        home_button1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
