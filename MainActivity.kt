package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber:EditText = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate:Button= findViewById<Button>(R.id.btnGenerate)
        val btnCancel :Button= findViewById<Button>(R.id.btnClear)
        val txtResult: TextView = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..28 -> "Mac Miller"
                    in 30..39 -> "AKA Forbes"
                    in 40..49 -> "Freddie Mercury"
                    in 50..59 -> "Chris Hani"
                    in 60..69 -> "Joe Slovo"
                    in 70..79 -> "Oliver Tambo"
                    in 80..89 -> "Winnie Mandela"
                    in 90..94 -> "Clint Eastwood"
                    in 95..100 -> "Barbara Rush"
                    else -> "The age does not match the description"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Mac Miller" -> "20s,you are within the same age bracket as Mac Miller,He was a famous Hiphop artist."
                        "AKA Forbes" -> "30s,you are within the same age bracket as AKA Forbes, He was a famous african rapper."
                        "Freddie Mercury" -> "40s,you are within the same age bracket as Freddie Mercury, He was famous artist."
                        "Chris Hani" -> "50s,you are within the same age bracket as Chris Hani, He was a leader of the south african communist party."
                        "Joe Slovo" -> "60s,you are within the same age bracket as Joe Slovo,He was a South African politician, and an opponent of the apartheid system ."
                        "Oliver Tambo" -> "70s,you are within the same age bracket as Oliver Tambo,was a South African anti-apartheid politician and activist who served as President of the African National Congress from 1967 to 1991."
                        "Winnie Mandela" -> "80s,you are within the same age bracket as Winnie Mandela,was a South African anti-apartheid activist and politician, and the second wife of Nelson."
                        "Clint Eastwood" -> "90s,you are within the same age bracket as Clint Eastwood,Clinton Eastwood was an American actor and film director."
                        "Barbara Rush" -> "90s,you are within the same age bracket as Barbara Rush,was an American actress. In 1954, Rush won the Golden Globe Award as most promising female newcomer for her."
                        else -> "The age does not match the description"
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }

    }