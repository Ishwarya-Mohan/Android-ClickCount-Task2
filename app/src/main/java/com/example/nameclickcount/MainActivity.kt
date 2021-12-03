package com.example.nameclickcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var click = 0
    var clickCountMap = mutableMapOf<String, Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clkcount = findViewById<TextView>(R.id.textView2)
        val clkbutton = findViewById<Button>(R.id.button2)
        val usernameinput = findViewById<TextInputLayout>(R.id.nameclick)

            clkbutton.setOnClickListener {
                val username = usernameinput.editText?.text?.toString()
                val maskusername =
                    if (username.isNullOrEmpty()) "Somebody"
                    else username
                val oldclk = clickCountMap[maskusername] ?: 0
                val newclk = oldclk + 1
                clickCountMap[maskusername] = newclk

                clkcount.text = "$maskusername clicked $newclk times"


            }

        
    }
}




