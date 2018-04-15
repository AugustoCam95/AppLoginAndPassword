package com.example.jose.apploginandpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    User user1;
    Button loginButton, SavePassButton;
    EditText loginText, passText, TittleText;
    TextView SavePasstextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user1 = new User("aaaa","1234");
        loginButton = (Button)findViewById(R.id.loginButton);
        SavePassButton = (Button)findViewById(R.id.SavePassButton);
        loginText = (EditText)findViewById(R.id.loginText);
        passText = (EditText)findViewById(R.id.passText);
        TittleText = (EditText)findViewById(R.id.TittleText);
        SavePasstextView = (TextView)findViewById(R.id.SavePassButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }



}
