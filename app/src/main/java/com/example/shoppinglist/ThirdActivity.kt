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
        new_list3.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))


        }
    }
}