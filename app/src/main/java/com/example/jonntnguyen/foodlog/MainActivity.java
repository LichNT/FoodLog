package com.example.jonntnguyen.foodlog;

import android.content.Context;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Login;
    EditText _name,_password;
    Button  log;
    TextView click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login =(Button) findViewById(R.id.btnLogin);
        _name= (EditText) findViewById(R.id._username);
        _password=(EditText) findViewById(R.id._password);
        Login.setOnClickListener(this);
    }
    public void onClick(View v){

            _name = (EditText) findViewById(R.id._username);
            _password = (EditText) findViewById(R.id._password);
        click = (TextView) findViewById(R.id.btnLogin);
            String n1="1234" ;


            if(n1.equalsIgnoreCase(_name.getText().toString()))
            {
                click.setText("LOGIN SUCCESS");
                Intent new_inten = new Intent(this,Content.class);
                startActivity(new_inten);

            }
            else{
                click.setText("LOGIN FAILED");         }
            }
    public  void RUN(){

    }
}
