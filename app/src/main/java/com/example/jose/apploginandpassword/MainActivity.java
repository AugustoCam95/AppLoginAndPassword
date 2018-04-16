package com.example.jose.apploginandpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        loginButton.setOnClickListener(this);
        SavePassButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        boolean SameLogin, SamePass;

        switch (view.getId()) {
            case R.id.loginButton:
                SameLogin = Boolean.parseBoolean(String.valueOf(loginText.getText().equals(user1.login)));
                Log.v("LOG", String.valueOf(SameLogin));
                SamePass = Boolean.parseBoolean(String.valueOf(passText.getText().equals(user1.password)));
                Log.v("LOG", String.valueOf(SamePass));

                if (SameLogin && !SamePass) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Insira o login correspodente", Toast.LENGTH_LONG);
                    toast.show();
                    Log.v("LOG", "Errou a senha");
                }

                if (!SameLogin && SamePass) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Insira o login correspodente", Toast.LENGTH_LONG);
                    toast.show();
                    Log.v("LOG", "Errou o login");
                }

                if (!SameLogin && !SamePass) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Insira o login correspodente", Toast.LENGTH_LONG);
                    toast.show();
                    Log.v("LOG", "Errou login e senha");
                }
                break;

            case R.id.SavePassButton:
                break;


        }
    }
}
