package ipt.dam.aula1v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Outra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView: TextView = findViewById(R.id.txtMensagem);
        textView.text = message
    }
}