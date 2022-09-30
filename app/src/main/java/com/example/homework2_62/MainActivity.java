package com.example.homework2_62;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Boolean check;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editText1);


        findViewById(R.id.Voity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateEmailAddress(editText);
            }
        });
    }

    private boolean validateEmailAddress(EditText editText) {
        EditText parol = findViewById(R.id.parol);
        if (editText.getText().toString().equals("admin") && parol.getText().toString().equals("admin")) {
            Toast.makeText(this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
            LinearLayout layout = findViewById(R.id.linear2);
            layout.setVisibility(View.GONE);
            TextView vhod = findViewById(R.id.vhod);
            vhod.setVisibility(View.GONE);
            LinearLayout layout1 = findViewById(R.id.Linear1);
            layout1.setVisibility(View.GONE);
            return true;
        } else {
            Toast.makeText(this, "Не правильный пароль и логин", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    /*public Boolean onClickVoity(View view) {
        EditText editText = findViewById(R.id.editText1);
        if(editText.getText().toString().length()>0){
            return true;
        }else{
            return false;
        }
    }*/
}