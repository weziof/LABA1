package com.example.example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.example.animal.Lion
import com.example.example.animal.Whale
import com.example.example.animal.Eagle

class MainActivity : AppCompatActivity() {


    private lateinit var LionArray: Array<Button>
    private lateinit var WhaleArray: Array<Button>
    private lateinit var EagleArray: Array<Button>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WhaleArray = arrayOf(findViewById<Button>(R.id.btn_0), findViewById<Button>(R.id.btn_1))
        EagleArray = arrayOf(findViewById(R.id.btn_2), findViewById(R.id.btn_3))
        LionArray = arrayOf(findViewById<Button>(R.id.btn_4), findViewById<Button>(R.id.btn_5))

        click()
    }


    private fun click() {
        WhaleArray.first().setOnClickListener {
            val lion = Lion()
            lion.voice("Lion")
        }
        WhaleArray.last().setOnClickListener {
            val lion = Lion()
            lion.run("Lion")
        }
        LionArray.first().setOnClickListener {
            val whale = Whale()
            whale.fountain("Whale")
        }
        LionArray.last().setOnClickListener {
            val whale = Whale()
            whale.swim("Whale")
        }
        EagleArray.first().setOnClickListener {
            val eagle = Eagle()
            eagle.voice("Eagle")
        }
        EagleArray.last().setOnClickListener {
            val eagle = Eagle()
            eagle.fly("Eagle")
        }
    }
}