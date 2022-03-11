package com.android.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button = findViewById(R.id.button3)

        button.setOnClickListener {
            var intent = Intent(this@SecondActivity,MainActivity::class.java)
            startActivity(intent)
        }

        Log.d("Message", "Second activity onCreate")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "Second activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "Second activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "Second activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "Second activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "Second activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "Second activity onRestart")
    }
}