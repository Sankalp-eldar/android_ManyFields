package com.example.manyfield;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ent_name;
    Button btn_next, btn_clear;
    CheckBox t_and_c, mails;
    RadioGroup rdo_group;
    String rdo_selection = "Nil";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ent_name = findViewById(R.id.editTextText);
        btn_next = findViewById(R.id.btn_next);
        btn_clear = findViewById(R.id.btn_clear);
        t_and_c = findViewById(R.id.checkBox);
        mails = findViewById(R.id.checkBox2);
        rdo_group = (RadioGroup) findViewById(R.id.rdo_gender);

        rdo_group.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == -1) {
                rdo_selection = "Nil";
                return;
            }
            RadioButton btn = (RadioButton) findViewById(checkedId);
            rdo_selection = btn.getText().toString();
        });
    }
    public void onClickNext(View view) {
        String str = ent_name.getText().toString() ;

        Intent intent = new Intent(this, GreetUser.class);
        intent.putExtra("Name", str);
        intent.putExtra("T&C", t_and_c.isChecked());
        intent.putExtra("Mails", mails.isChecked());
        intent.putExtra("Gender", rdo_selection);
        startActivity(intent);
    }
    public void onClickClear(View v){
        rdo_group.clearCheck();
        ent_name.setText("");
        t_and_c.setChecked(false);
        mails.setChecked(false);
    }
}