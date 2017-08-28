package com.example.user.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class horizontal extends AppCompatActivity {
    public Button but1;
    public Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);
        but1=(Button)findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(horizontal.this,MainActivity.class);
                startActivity(toy);
            }
        });
        but2=(Button)findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(horizontal.this,weights.class);
                startActivity(toy);
            }
        });
    }
}
