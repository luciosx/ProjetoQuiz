package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    public void btnJogarOnClick(View view) {
            Intent intent = new Intent(this, QuizActivity.class);
            startActivity(intent);
        }
    }
}
