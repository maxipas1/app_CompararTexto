package com.curso.android.app.practica.comparartexto


import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonCompare = findViewById<Button>(R.id.buttonCompare)

        val text1 = findViewById<EditText>(R.id.text1)
        val text2 = findViewById<EditText>(R.id.text2)
        val textRes = findViewById<TextView>(R.id.textRes)

        buttonCompare.setOnClickListener {


            val palabra1: String = text1.getText().toString().trim()
            val palabra2: String = text2.getText().toString().trim()


            //hide teclado

            val imm =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken,0)

            if (palabra1.equals(palabra2)) {
                textRes.setText("Los textos son Iguales!")
            } else {
                textRes.setText("Los textos  son distintos!")
            }
        }
    }

}
