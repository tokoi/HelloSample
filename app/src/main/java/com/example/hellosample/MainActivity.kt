package com.example.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    private inner class HelloListner : View.OnClickListener{

        override fun onClick(view:View){

            val input = findViewById<EditText>(R.id.etName)

            val output = findViewById<TextView>(R.id.tvOutput)

            val inputStr = input.text.toString()

            output.text = inputStr + "さんこんにちは！"
        }
    }
}
