package com.example.justplaying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aboutButton: Button = findViewById(R.id.about_button)
        aboutButton.setOnClickListener { aboutMe() }
        val colorButton: Button = findViewById(R.id.color_button)
        colorButton.setOnClickListener { colorMe() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countMe() }
        val randomButton: Button = findViewById(R.id.random_button)
        randomButton.setOnClickListener { randomMe() }
    }

    private fun aboutMe(){
        val aboutIntent = Intent(this, AboutActivity::class.java)
        startActivity(aboutIntent)
    }

    private fun colorMe(){
        val colorIntent = Intent(this, ColorActivity::class.java)
        startActivity(colorIntent)
    }

    private fun countMe(){
        val numberShownString = findViewById<TextView>(R.id.textView)
        val numberShown = numberShownString.text.toString()
        var count: Int = Integer.parseInt(numberShown)
        count++
        numberShownString.text = count.toString()
    }

    private fun randomMe(){
        val randomIntent = Intent(this, SecondActivity::class.java)

        val numberShownString = findViewById<TextView>(R.id.textView)
        val numberShown = numberShownString.text.toString()
        var count: Int = Integer.parseInt(numberShown)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}
