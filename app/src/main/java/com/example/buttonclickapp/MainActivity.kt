package com.example.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.ActionMode
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG = "MainActivtiy"

class MainActivity : AppCompatActivity() {


    private var textView: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userInput: EditText = findViewById<EditText>(R.id.editText)
        var button:Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("")

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG,"onClick: called")
                textView?.append(userInput.text )
                textView?.append("\n")
//                userInput.text.clear()
                userInput.setText("")

            }
        })
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
}
