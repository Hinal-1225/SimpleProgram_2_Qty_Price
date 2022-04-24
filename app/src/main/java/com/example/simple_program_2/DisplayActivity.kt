package com.example.simple_program_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var txtview: TextView =findViewById(R.id.edtTotalPrice)
        var prefer=getSharedPreferences("MyPref", MODE_PRIVATE)
        var str=prefer.getString("Total","wrong")
        txtview.append(str)
    }
}