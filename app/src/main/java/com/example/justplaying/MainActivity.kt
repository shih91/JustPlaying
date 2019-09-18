package com.example.justplaying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "badadada", Toast.LENGTH_LONG)
        myToast.show()
    }

    fun countMe(view: View){
        val numberShownString = findViewById<TextView>(R.id.textView)
        val numberShown = numberShownString.text.toString()
        var count: Int = Integer.parseInt(numberShown)
        count++
        numberShownString.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)

        val numberShownString = findViewById<TextView>(R.id.textView)
        val numberShown = numberShownString.text.toString()
        var count: Int = Integer.parseInt(numberShown)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}
