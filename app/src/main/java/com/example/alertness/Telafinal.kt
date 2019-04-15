package com.example.alertness

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_pvt.*
import kotlinx.android.synthetic.main.activity_telafinal.*

var media: Long = 0
var timestamp: Long = 0

class Telafinal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telafinal)

        textView9.text = "t1: " + t1.toString() + "\nt2: " + t2.toString() + "\nt3: " + t3.toString() + "\nt4: " + t4.toString() + "\nt5: " + t5.toString() + "\nt6: " + t6.toString() + "\nt7: " + t7.toString() + "\nt8: " + t8.toString() + "\nt9: " + t9.toString() + "\nt10: " + t10.toString()
        media = (t1+t2+t3+t4+t5+t6+t7+t8+t9+t10)/10
        timestamp = System.currentTimeMillis()/1000

        textView10.text = "Média = " + media.toString()
        textView11.text = "Identificação: "+id
        textView12.text = "Condição: "+condicao
        textView13.text = "KSS: "+KSS
        textView14.text = "Timestamp: "+ timestamp.toString()
    }
}
