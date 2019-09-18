package com.example.justplaying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    private fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        findViewById<TextView>(R.id.textview_random).text = randomInt.toString()
        findViewById<TextView>(R.id.textview_label).text = getString(R.string.random_number, count)
    }
}
