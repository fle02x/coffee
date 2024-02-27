package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Preview extends AppCompatActivity {
    private Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        go = (Button) findViewById(R.id.button);
    }
    public void go(View view){
        Intent intent = new Intent(Preview.this,MainActivity.class);
        startActivity(intent);
    }
}