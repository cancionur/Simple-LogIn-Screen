package com.example.simpleloginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewHelp;
    private EditText Username;
    private EditText Password;
    private Button buttonLogIn;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHelp = findViewById(R.id.textViewHelp);
        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);
        buttonLogIn = findViewById(R.id.buttonLogIn);
        imageView = findViewById(R.id.imageView);

        textViewHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(send);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Tıklanılcak bişi değil bu :)",Toast.LENGTH_SHORT).show();
            }
        });


        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UsernameString = Username.getText().toString();
                String PasswordString = Password.getText().toString();

                if (UsernameString.equalsIgnoreCase("admin") && PasswordString.equals("123")){
                    Intent send = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(send);
                }
                else if(UsernameString.equalsIgnoreCase("admin") && !PasswordString.equals("123")){
                    Toast.makeText(MainActivity.this,"Şifre Hatalı",Toast.LENGTH_SHORT).show();
                }
                else if(!UsernameString.equalsIgnoreCase("admin") && PasswordString.equals("123")){
                    Toast.makeText(MainActivity.this,"Kullanıcı Adı Hatalı",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Her İki Değer Hatalı",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}