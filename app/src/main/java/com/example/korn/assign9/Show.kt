package com.example.korn.assign9

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class Show : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val rup = intent.extras.getParcelable(MainActivity.Key) as Student
        shusername.text = "${rup.Username}"
        shpassword.text = "${rup.Password}"
        shgender.text = "${rup.Gender}"
        shBirthday.text = "${rup.Birthday}"
        shEmail.text = "${rup.Email}"
        shPhone.text = "${rup.Phone}"

    }
}
