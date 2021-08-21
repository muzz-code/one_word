package com.ebookfrenzy.myhngproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var textInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.submit_btn)
        textInput = findViewById(R.id.editText)

        btn.setOnClickListener {
            val text = textInput.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(MainActivity2.NAME, text)

            startActivity(intent)
        }
    }
}
