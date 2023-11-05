package com.example.menushark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    val city = arrayOf("schaumburg" , "Hoffman" , "Estates")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this , android.R.layout.simple_spinner_dropdown_item , city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext , "Selected City "+city[p2] , Toast.LENGTH_SHORT ).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

    }
}