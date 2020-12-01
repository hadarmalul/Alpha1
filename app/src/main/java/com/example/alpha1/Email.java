package com.example.alpha1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * The type Email.
 */
public class Email extends AppCompatActivity {

    /**
     * The Et 1.
     */
    EditText et1, /**
     * The Et 2.
     */
    et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
    }

    /**
     * Send email.
     */
    protected void sendEmail() {

        String Email = et1.getText().toString();
        String Message = et2.getText().toString();

        Log.i("Send email", "");

        String[] TO = {Email};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");


        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Send Email");
        emailIntent.putExtra(Intent.EXTRA_TEXT, Message);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email.", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Email.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Emailb.
     *
     * @param view the view
     */
    public void Emailb(View view) {

        sendEmail();

    }
}
