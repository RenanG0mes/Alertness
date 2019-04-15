package com.example.alertness

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IntroPVTActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_pvt)
    }
    // Cria função que muda de tela
    fun MudarDeTelaPVT(view: View){
        val intent = Intent(this, PVTActivity::class.java)
        startActivity(intent)
    }
}
