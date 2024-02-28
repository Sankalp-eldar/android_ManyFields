package com.example.manyfield;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class GreetUser extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greet_activity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Name");
        TextView txt = (TextView) findViewById(R.id.personal);
        txt.setText("Hello, " + str);

        txt = findViewById(R.id.gender);
        txt.setText("Gender: "+intent.getStringExtra("Gender"));

        txt = findViewById(R.id.tandc);
        txt.setText("T&C selected: "+ intent.getBooleanExtra("T&C", false));

        txt = findViewById(R.id.mails);
        txt.setText("Promotions selected: "+intent.getBooleanExtra("Mails", true));
    }
}
