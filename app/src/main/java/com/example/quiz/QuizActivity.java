package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        public void btnResponderOnClick(View v){
            RadioGroup rgRespostas = (RadioGroup)findViewById(R.id.rgRespostas);
            Intent intent = new Intent(this, RespostaActivity.class);
            intent.putExtra("acertou", rgRespostas.getCheckedRadioButtonId() == R.id.rbResposta1);
            startActivity(intent);
        }
    }
}
