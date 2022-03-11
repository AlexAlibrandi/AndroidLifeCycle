package com.android.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var button2: Button
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)

        button.setOnClickListener {

            counter += 1
            textView.text = "" + counter
        }

        button2.setOnClickListener {
            var intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }


        Log.d("Message", "First activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "First activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "First activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "First activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "First activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "First activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "First activity onRestart")
    }
}