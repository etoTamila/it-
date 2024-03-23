package com.example.chempionat

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.sign

class Holder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holder)

        val name : EditText = findViewById(R.id.editTextText)
        val phone : EditText = findViewById(R.id.editTextText2)
        val email : TextInputEditText = findViewById(R.id.email)
        val pass :TextInputEditText = findViewById(R.id.pass)
        val pass2 :TextInputEditText = findViewById(R.id.pass2)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val signUp : Button = findViewById(R.id.button3)

       pass2.addTextChangedListener(object : TextWatcher{
           override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
           override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
           override fun afterTextChanged(s: Editable?) {
               if((name.text.toString()!=""&&phone.text.toString()!=""&&email.text.toString()!=""&&pass.text.toString()!=""
                           &&pass2.text.toString()!="") && checkBox.isChecked){
                   signUp.setBackgroundResource(R.drawable.button)
               } else{
                   signUp.setBackgroundResource(R.drawable.button_gray)
               }
           }

       })
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if((name.text.toString()!=""&&phone.text.toString()!=""&&email.text.toString()!=""&&pass.text.toString()!=""
                        &&pass2.text.toString()!="") && checkBox.isChecked){
                signUp.setBackgroundResource(R.drawable.button)
            } else{
                signUp.setBackgroundResource(R.drawable.button_gray)
            }
        }

}


}
