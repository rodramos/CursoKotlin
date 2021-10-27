package etec.com.br.rodrigo.appmediakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TelaCalcMedia : AppCompatActivity() {

    lateinit var txtN1: TextView
    lateinit var txtN2: TextView
    lateinit var txtN3: TextView
    lateinit var txtN4: TextView
    lateinit var txtCurso: TextView
    lateinit var txtMedia: TextView
    lateinit var btnVoltar: Button
    var media: Float = 0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_calc_media)

        txtCurso = findViewById(R.id.txtCurso)
        txtN1 = findViewById(R.id.txtN1)
        txtN2 = findViewById(R.id.txtN2)
        txtN3 = findViewById(R.id.txtN3)
        txtN4 = findViewById(R.id.txtN4)
        txtMedia = findViewById(R.id.txtMedia)
        btnVoltar = findViewById(R.id.btnVoltar)

        var valores = intent.extras

        var n1 = valores?.getString("n1")
        var n2 = valores?.getString("n2")
        var n3 = valores?.getString("n3")
        var n4 = valores?.getString("n4")
        var curso = valores?.getString("curso")

        media = (n1.toString().toFloat() + n2.toString().toFloat() +n3.toString().toFloat() +n4.toString().toFloat())/4

        txtN1.text = "Nota 1: " + n1.toString()
        txtN2.text = "Nota 1: " + n2.toString()
        txtN3.text = "Nota 1: " + n3.toString()
        txtN4.text = "Nota 1: " + n4.toString()
        txtCurso.text = "Curso: " + curso.toString()
        txtMedia.text = "Media: " + media + " Resultado Final: " + resultado()

    }

    fun resultado():String{
        if (media < 5)
            return "Reprovado"
        else if (media < 7)
            return "Recuperação"
        else
            return "Aprovado"
    }
}