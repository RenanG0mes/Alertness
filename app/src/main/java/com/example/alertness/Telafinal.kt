package com.example.alertness

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.SystemClock
import android.provider.Settings
import android.view.View
import kotlinx.android.synthetic.main.activity_pvt.*
import kotlinx.android.synthetic.main.activity_telafinal.*
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.Writer
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage


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

        saveTXT("Identificação: "+id+"; Condição: "+condicao+"; KSS: "+KSS+"; t1: " + t1.toString() + "; t2: " + t2.toString() + "; t3: " + t3.toString() + "; t4: " + t4.toString() + "; t5: " + t5.toString() + "; t6: " + t6.toString() + "; t7: " + t7.toString() + "; t8: " + t8.toString() + "; t9: " + t9.toString() + "; t10: " + t10.toString()+"; Média = "+media.toString()+"; Timestamp: "+ timestamp.toString()+"\n\n")

        savetoDB()


    }

    private fun savetoDB(){

        val ref = FirebaseDatabase.getInstance().getReference("testes")

        val testeId2 = ref.push().key

        val teste = Teste(testeId2!!, id, condicao, KSS, t1.toString(),t2.toString(), t3.toString(), t4.toString(), t5.toString(), t6.toString(), t7.toString(), t8.toString(), t9.toString(), t10.toString(), media.toString(), timestamp.toString())

        ref.child(testeId2).setValue(teste)
    }

    private fun saveTXT(TXTString: String) {

        val output: Writer
        output = BufferedWriter(FileWriter(File(this.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "teste.txt"), true))
        output.write(TXTString)
        output.close()

    }

}
