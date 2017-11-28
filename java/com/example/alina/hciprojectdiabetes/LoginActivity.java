package com.example.alina.hciprojectdiabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    EditText enterName, enterPassword;
    TextView signupLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton=(Button)findViewById(R.id.loginButton);
        enterName=(EditText)findViewById(R.id.enterName);
        enterPassword=(EditText)findViewById(R.id.enterPassword);
        signupLink=(TextView)findViewById(R.id.link_signup);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(enterName.getText().toString().equals("abc")&&
                        enterPassword.getText().toString().equals("abc"))
                {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(), Diet.class);
                    startActivity(i);
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                }

            }
        });

        signupLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(i);
            }
        });
    }
}
