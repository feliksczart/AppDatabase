package com.example.demodatabase;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText e_name, e_password, e_contact, e_country;
    String name, password, contact, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e_name = (EditText) findViewById(R.id.nameText);
        e_password = (EditText) findViewById(R.id.passwordText);
        e_contact = (EditText) findViewById(R.id.contactText);
        e_country = (EditText) findViewById(R.id.countryText);
    }

    public void reguser(View view){
        name = e_name.getText().toString();
        password = e_password.getText().toString();
        contact = e_contact.getText().toString();
        country = e_country.getText().toString();

        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,password,contact,country);

        finish();
    }
}