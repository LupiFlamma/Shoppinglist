package com.example.shoppinglist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        //Navigate button to SecondActivity
        new_list_button3.setOnClickListener {
            startActivity(Intent(this, com.example.shoppinglist.SecondActivity::class.java))
        }

        //Navigate button to
        list_button3.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        //Navigate button to
        home_button3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}