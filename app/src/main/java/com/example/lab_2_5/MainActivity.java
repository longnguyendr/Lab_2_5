package com.example.lab_2_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user_input;
    private Button btnEnglish, btnSverige, btnSuomeksi, btnSuprise;
    private TextView result_text;
    public String user_name;
    private int a = 1,b = 2,c = 3,d = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_text = findViewById(R.id.result_text);
        user_input = findViewById(R.id.username_input);
        btnEnglish = findViewById(R.id.english_button);
        btnSverige = findViewById(R.id.sverige_button);
        btnSuomeksi = findViewById(R.id.suomeksi_button);
        btnSuprise = findViewById(R.id.suprise_button);

            btnEnglish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    user_name = String.valueOf(user_input.getText());
                    checkInput(user_name , a);
                }
            });
            btnSverige.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    user_name = String.valueOf(user_input.getText());
                    checkInput(user_name , b);
                }
            });
            btnSuomeksi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    user_name = String.valueOf(user_input.getText());
                    checkInput(user_name , c);
                }
            });
            btnSuprise.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    user_name = String.valueOf(user_input.getText());
//                    result_text.setText("Hola " + user_name);
//                    user_input.setText("");
                    checkInput(user_name , d);
                }
            });

    }

    public void checkInput(String user_name, int a) {
        result_text = findViewById(R.id.result_text);
        user_input = findViewById(R.id.username_input);

        if (TextUtils.isEmpty(user_name)){
            result_text.setText("Hello Stranger");
        }
        else {
            switch (a) {
                case 1:
                    result_text.setText("Hi " + user_name);
                    user_input.setText("");
                    break;
                case 2:
                    result_text.setText("Hejjsan " + user_name);
                    user_input.setText("");
                    break;
                case 3:
                    result_text.setText("Terve " + user_name);
                    user_input.setText("");
                    break;
                case 4:
                    result_text.setText("Hola " + user_name);
                    user_input.setText("");
                    break;

            }

        }
    }
}
