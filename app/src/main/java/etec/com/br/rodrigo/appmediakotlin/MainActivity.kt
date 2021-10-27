package etec.com.br.rodrigo.appmediakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var ediN1:EditText
    lateinit var ediN2:EditText
    lateinit var ediN3:EditText
    lateinit var ediN4:EditText
    lateinit var btnSair: Button
    lateinit var btnCal: Button
    lateinit var btnLimpar: Button
    lateinit var rdbMtec:RadioButton
    lateinit var rdbMedio:RadioButton
    lateinit var rdbEtim:RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ediN1 = findViewById(R.id.edtNota1)
        ediN2 = findViewById(R.id.edtNota2)
        ediN3 = findViewById(R.id.edtNota3)
        ediN4 = findViewById(R.id.edtNota4)

        btnCal = findViewById(R.id.btnCalcular)
        btnSair = findViewById(R.id.btnSair)
        btnLimpar = findViewById(R.id.btnLimpar)

        rdbEtim = findViewById(R.id.rdbEtim)
        rdbMedio = findViewById(R.id.rdbMedio)
        rdbMtec = findViewById(R.id.rdbMtec)


        btnLimpar.setOnClickListener(){
            ediN1.text.clear()
            ediN2.text.clear()
            ediN3.text.clear()
            ediN4.text.clear()
            rdbMtec.isChecked = false
            rdbMedio.isChecked = false
            rdbEtim.isChecked = false

        }

        btnSair.setOnClickListener(){
            this.finishAffinity()
        }

        btnCal.setOnClickListener(){
            val telaMedia = Intent(this,TelaCalcMedia::class.java)
            telaMedia.putExtra("n1",ediN1.text.toString())
            telaMedia.putExtra("n2",ediN2.text.toString())
            telaMedia.putExtra("n3",ediN3.text.toString())
            telaMedia.putExtra("n4",ediN4.text.toString())
            telaMedia.putExtra("curso",curso())
            startActivity(telaMedia)
        }

    }
    fun curso():String{
        if (rdbMtec.isChecked)
            return "M-Tec"
        else if (rdbEtim.isChecked)
            return "ETIM"
        else
            return "Médio"

    }
}