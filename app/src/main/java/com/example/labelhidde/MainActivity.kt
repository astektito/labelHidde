package com.example.labelhidde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btnHidde: Button
    private lateinit var textHidde: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHidde = findViewById(R.id.btnHidde)
        textHidde = findViewById(R.id.textHidde)

        btnHidde.setOnClickListener {
            if (textHidde.visibility == View.GONE) {
                textHidde.visibility = View.VISIBLE
                btnHidde.text = "Ocultar"
            } else {
                textHidde.visibility = View.GONE
                btnHidde.text = "Mostrar"
            }
        }
    }
}