package com.example.justplaying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AboutActivity : AppCompatActivity() {

    lateinit var nicknameText: EditText
    lateinit var finalNickname: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        nicknameText = findViewById(R.id.nickname_edit)
        finalNickname = findViewById(R.id.final_nickname)

        val doneButton: Button = findViewById(R.id.done_button)
        doneButton.setOnClickListener{ onDoneButtonClicked() }
    }

    private fun onDoneButtonClicked(){
        finalNickname.text = nicknameText.text
        Toast.makeText(this, "hello " + nicknameText.text, Toast.LENGTH_SHORT).show()
    }
}
