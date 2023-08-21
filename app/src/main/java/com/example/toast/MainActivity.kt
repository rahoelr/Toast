package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edt_angka);
        val button_toast = findViewById<Button>(R.id.btn_toast);
        button_toast.setOnClickListener{
            val text = editText.text.toString();
            val toastMsg = "Angka : $text"
            Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show();
        }
    }
}