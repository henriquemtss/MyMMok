package br.com.etecia.mymmok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplahsActivity extends AppCompatActivity {

    ImageView btnsplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splahs_layout);
        btnsplash = findViewById(R.id.BtnSplashs);
        btnsplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplahsActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });
    }
}