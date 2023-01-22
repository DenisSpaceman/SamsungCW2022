package com.example.angryslonik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.angryslonik.gameview.GameView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }
}