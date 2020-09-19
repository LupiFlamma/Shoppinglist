package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import com.example.shoppinglist.SecondActivity as SecondActivity1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Navigate button to SecondActivity
        next_button.setOnClickListener {
            startActivity(Intent(this, com.example.shoppinglist.SecondActivity:: class.java))
        }

    }
}