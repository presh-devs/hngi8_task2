package com.oluwafemi.yourmind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mind = findViewById<TextView>(R.id.mind)
        val button = findViewById<ImageView>(R.id.write)
        val textBox = findViewById<TextInputLayout>(R.id.text_box)

        button.setOnClickListener {
            if (mind.text.toString().isEmpty() && textBox.editText?.text.toString().isNotEmpty()) {
                mind.visibility = View.VISIBLE
                mind.text = textBox.editText?.text
                textBox.editText?.setText("")
                textBox.visibility = View.GONE
            } else {
                mind.text = ""
                mind.visibility = View.GONE
                textBox.visibility = View.VISIBLE
            }
        }
    }
}