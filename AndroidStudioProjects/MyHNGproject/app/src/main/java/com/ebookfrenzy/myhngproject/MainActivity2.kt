package com.ebookfrenzy.myhngproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    companion object {
        val NAME = "NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val receive_text = intent.getStringExtra(NAME)
        findViewById<TextView>(R.id.receive_text).text = "your name is $receive_text"
    }
}
