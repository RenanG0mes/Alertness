package com.example.alertness

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_condicao.*

var condicao: String = "0"

class CondicaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condicao)


    }

    // Cria função que muda de tela
    fun MudarDeTelaKSS1(view: View){
        condicao = "Descanso"
        val intent = Intent(this, KSSActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaKSS2(view: View){
        condicao = "Alimentação"
        val intent = Intent(this, KSSActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaKSS3(view: View){
        condicao = "Trabalho"
        val intent = Intent(this, KSSActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaKSS4(view: View){
        condicao = "Lazer"
        val intent = Intent(this, KSSActivity::class.java)
        startActivity(intent)
    }
}
