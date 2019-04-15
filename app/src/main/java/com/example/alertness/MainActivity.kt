package com.example.alertness

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

var id: String = "0"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    //--------------------
    // Cria função que muda de tela
    fun MudarDeTelacondicao(view: View){

        id = identificacao.text.toString()

        val intent = Intent(this, CondicaoActivity::class.java)
        startActivity(intent)
    }

    //--------------------
}

