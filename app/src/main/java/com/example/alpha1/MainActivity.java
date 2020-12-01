package com.example.alpha1;

/**
 * @author Hadar Malul
 * @version alpha
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Auth.
     *
     * @param view the view
     */
    public void auth(View view) {

        Intent Si = new Intent(this,Authentication.class);
        startActivity(Si);
    }

    /**
     * Pic.
     *
     * @param view the view
     */
    public void pic(View view) {

        Intent Si = new Intent(this,Storage.class);
        startActivity(Si);
    }

    /**
     * Cvs.
     *
     * @param view the view
     */
    public void cvs(View view) {

        Intent Si = new Intent(this, CSV.class);
        startActivity(Si);
    }

    /**
     * Email.
     *
     * @param view the view
     */
    public void email(View view) {

        Intent Si = new Intent(this, Email.class);
        startActivity(Si);
    }
}
