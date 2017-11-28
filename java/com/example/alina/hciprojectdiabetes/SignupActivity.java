package com.example.alina.hciprojectdiabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    Button signupButton;
    EditText enterName, enterPassword, enterEmail;
    TextView loginLink;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupButton=(Button)findViewById(R.id.signup_Button);
        enterName=(EditText)findViewById(R.id.signup_name);
        enterEmail=(EditText)findViewById(R.id.signup_email);
        enterPassword=(EditText)findViewById(R.id.signup_password);
        loginLink=(TextView)findViewById(R.id.login_link);

        signupButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(!validate()){
                    Toast.makeText(getApplicationContext(),"SignUp Failed",Toast.LENGTH_SHORT).show();
                    signupButton.setEnabled(true);
                    return;
                }

                signupButton.setEnabled(false);
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });

        loginLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });
    }

    public boolean validate(){
        boolean valid=true;

        String name=enterName.getText().toString();
        String email=enterEmail.getText().toString();
        String password=enterPassword.getText().toString();

        if(name.isEmpty() || name.length()<3){
            enterName.setError("Name should be at least 3 character");
            valid=false;
        }
        else{
            enterName.setError(null);
        }

        if(email.isEmpty() ||!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            enterEmail.setError("Enter a valid Email Address");
            valid=false;
        }
        else{
            enterEmail.setError(null);
        }

        if(password.isEmpty() || password.length() < 3){
            enterPassword.setError("Password must be equal or greater than 3 characters");
            valid=false;
        }
        else{
            enterPassword.setError(null);
        }

        return valid;
    }
}
