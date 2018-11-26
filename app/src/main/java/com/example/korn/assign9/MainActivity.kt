package com.example.korn.assign9

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
       val Key = "letgo";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnsend.setOnClickListener{
            var radio:Int = group.checkedRadioButtonId
            val radiona:RadioButton = findViewById(radio)
            val i = Intent(this,Show::class.java)

           val data = Student(etUsername.text.toString(),
            etPassword.text.toString(),
            radiona.text.toString(),
            etBirthday.text.toString(),
            etEmail.text.toString(),
            etPhone.text.toString()
           )
            i.putExtra(Key,data)
            startActivity(i)


        }
    }
}
