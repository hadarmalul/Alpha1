package com.example.alpha1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * The type Authentication.
 */
public class Authentication extends AppCompatActivity {

    private FirebaseAuth mAuth;
    /**
     * The N.
     */
    EditText N, /**
     * The P.
     */
    P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        N=(EditText) findViewById(R.id.N);
        P=(EditText) findViewById(R.id.P);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        /**
         *  Check if user is signed in (non-null) and update UI accordingly.
         */
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser currentUser) {

    }


    /**
     * Btn.
     *
     * @param view the view
     */
    public void btn(View view) {

        String email=N.getText().toString();
        String password=P.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    /**
                     * Sign in success, update UI with the signed-in user's information
                     */
                    FirebaseUser user = mAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    Log.e("Authentication", String.valueOf(task.getException()));
                    /**
                     *  If sign in fails, display a message to the user.
                     */
                    Toast.makeText(Authentication.this, "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }

                // ...
            }


        });
    }
}
