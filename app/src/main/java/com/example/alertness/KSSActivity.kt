package com.example.alertness

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

var KSS: String = "0"

class KSSActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kss)
    }

    // Cria função que muda de tela
    fun MudarDeTelaIntroPVT1(view: View){
        KSS = "1"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT2(view: View){
        KSS = "2"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT3(view: View){
        KSS = "3"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT4(view: View){
        KSS = "4"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT5(view: View){
        KSS = "5"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT6(view: View){
        KSS = "6"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT7(view: View){
        KSS = "7"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT8(view: View){
        KSS = "8"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
    fun MudarDeTelaIntroPVT9(view: View){
        KSS = "9"
        val intent = Intent(this, IntroPVTActivity::class.java)
        startActivity(intent)
    }
}
