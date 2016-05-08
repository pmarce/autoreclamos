package com.marceloapp.autoreclamos.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.marceloapp.autoreclamos.R;

public class FormUserActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText nameUser;
    EditText ciUser;
    Button btnSaveUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_user);
        toolbar = (Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        nameUser = (EditText)findViewById(R.id.input_name_user);
        ciUser = (EditText)findViewById(R.id.input_ci_user);
        btnSaveUser = (Button)findViewById(R.id.btn_save_user);

        btnSaveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameUser.getText().toString();
                String ci = ciUser.getText().toString();
                SharedPreferences preferences = getSharedPreferences("user_date", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name_user",name);
                editor.putString("ci_user",ci);
                editor.commit();
                finish();
            }
        });


    }
}