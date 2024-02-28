package com.example.manyfield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ent_name;
    Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ent_name = findViewById(R.id.editTextText);
        Button btn = findViewById(R.id.button);
    }
    public void onClickNext(View view) {
        Button btn = findViewById(R.id.button);
        EditText text = findViewById(R.id.editTextText);
        String str = text.getText().toString() ;

        Intent intent = new Intent(this, GreetUser.class);
        intent.putExtra("Name", str);
        startActivity(intent);
    }
    public void onClickClear(View v){

    }
}