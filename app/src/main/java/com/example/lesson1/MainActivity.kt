package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var helloText : TextView
    private lateinit var buttonGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText = findViewById(R.id.hello_text)
        buttonGo = findViewById(R.id.button_go)

        buttonGo.setOnClickListener {
            showUsersList()
        }

    }

    private fun showUsersList() {
        val usersList : List<User> = Repository.getUsersList()
        var tempString : StringBuilder = StringBuilder()

        usersList.forEach {
            tempString.append(it.name)
            tempString.append(" ")
            tempString.append(it.lastName)
            tempString.append("\n")
        }

        helloText.text = tempString.toString()

        var testUser = User("Test", "testov")
        var testUser2 : Any
        testUser2 = testUser.copy()

        Log.d("happy", "${testUser2}")

        var i : Int = 0
        while (i < 10) {
            i++
            Log.d("happy", "i = $i")
        }

        for (i in 1..5)
            Log.d("happy", "Hello world!")

        for (i in 5 downTo 1 step 2)
            Log.d("happy", "Bye bye")

        for (user in usersList) {
            Log.d("happy","Name - ${user.name}")
        }

    }
}