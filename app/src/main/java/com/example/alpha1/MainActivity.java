package com.example.alpha1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void auth(View view) {

        Intent Si = new Intent(this,Authentication.class);
        startActivity(Si);
    }

    public void pic(View view) {

        Intent Si = new Intent(this,Storage.class);
        startActivity(Si);
    }

    public void cvs(View view) {

        Intent Si = new Intent(this, CSV.class);
        startActivity(Si);
    }

    public void email(View view) {

        Intent Si = new Intent(this, Email.class);
        startActivity(Si);
    }
}
