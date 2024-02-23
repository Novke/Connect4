package com.novica.connect4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1igrac;
    Button btn2igrac;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();



    }

    private void initButtons() {
        btn1igrac = findViewById(R.id.btn1);
        btn2igrac = findViewById(R.id.btn2);
        btnExit = findViewById(R.id.btnExit);


        btnExit.setOnClickListener(view -> System.exit(1));
        btn1igrac.setOnClickListener(view -> startGame(1));
        btn2igrac.setOnClickListener(view -> startGame(2));
    }

    private void startGame(int numberOfPlayers){
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("players", numberOfPlayers);
        startActivity(intent);
    }
}