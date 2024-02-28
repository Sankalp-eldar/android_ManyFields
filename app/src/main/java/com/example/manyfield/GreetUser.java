package com.example.manyfield;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class GreetUser extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greet_activity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Name");
//        TextView txt = (TextView) findViewById(R.id.textView2);
//        txt.setText("Hello, " + str);
    }
}
