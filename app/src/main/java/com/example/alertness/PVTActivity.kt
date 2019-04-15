package com.example.alertness

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.support.v4.view.MotionEventCompat.getActionMasked
import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pvt.*
import kotlinx.android.synthetic.main.activity_telafinal.*
import kotlin.random.Random

var t1: Long = 0; var t2: Long = 0; var t3: Long = 0; var t4: Long = 0; var t5: Long = 0
var t6: Long = 0; var t7: Long = 0; var t8: Long = 0; var t9: Long = 0; var t10: Long = 0
var temp: Long = 0

class PVTActivity : AppCompatActivity() {

    var tempo: Long = SystemClock.elapsedRealtime()
    var i: Int = 0

    private val DEBUG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pvt)

        object : CountDownTimer(3000, 1) {

            override fun onTick(millisUntilFinished: Long) {
             //   textView.setText("seconds remaining: " + millisUntilFinished / 1)
            }

            override fun onFinish() {
                imageView3.visibility = View.VISIBLE
                tempo = SystemClock.elapsedRealtime()
            }
        }.start()

    }


    override fun onTouchEvent(event: MotionEvent): Boolean {

        val action: Int = getActionMasked(event)



        return when (action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(DEBUG, "Action was DOWN")
                imageView3.visibility = View.INVISIBLE
                textView7.text = (SystemClock.elapsedRealtime()-tempo).toString()
                temp = (SystemClock.elapsedRealtime()-tempo)
                tempo = SystemClock.elapsedRealtime()
                i++

                when(i){
                    1 -> t1 = temp
                    2 -> t2 = temp
                    3 -> t3 = temp
                    4 -> t4 = temp
                    5 -> t5 = temp
                    6 -> t6 = temp
                    7 -> t7 = temp
                    8 -> t8 = temp
                    9 -> t9 = temp
                    10 -> t10 = temp
                }


                if(i>9){
                    startActivity(Intent(this, Telafinal::class.java))
                }

                object : CountDownTimer(Random.nextLong(100, 3000), 1) {

                    override fun onTick(millisUntilFinished: Long) {
                    }
                    override fun onFinish() {
                        imageView3.visibility = View.VISIBLE
                        tempo = SystemClock.elapsedRealtime()
                    }
                }.start()

                true


            }

            else -> super.onTouchEvent(event)

        }

    }

}
