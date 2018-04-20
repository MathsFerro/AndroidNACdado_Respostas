package fiap.matheus.com.nacdado_resp

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class GameActivity : AppCompatActivity() {

    var vitorias = 0
    var empates = 0
    var derrotas = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        btPlay.setOnClickListener {
            jogar()
        }
    }

        fun jogar(){
            val gerarNumeroRandom = Random()
            val numeroPlayer = gerarNumeroRandom.nextInt(6) + 1
            val numeroPC = gerarNumeroRandom.nextInt(6) + 1

            trocarIMG(numeroPlayer, ivPlayer)
            trocarIMG(numeroPC, ivPC)

            if(numeroPlayer > numeroPC){
                tvVitorias.text = vitorias.toString()
                vitorias++;
            }else if(numeroPlayer == numeroPC){
                tvEmpates.text = empates.toString()
                empates++;
            }else if(numeroPlayer < numeroPC){
                tvDerrota.text = derrotas.toString()
                derrotas++;
            }
        }

    fun trocarIMG(numero: Int, imagem: ImageView){

        when(numero){
            1-> imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice))
            2-> imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice2))
            3-> imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice3))
            4-> imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice4))
            5-> imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice5))
            6-> imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice6))
        }
    }
}
