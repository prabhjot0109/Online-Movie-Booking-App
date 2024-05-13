package com.example.onlinemoviebookingapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView signUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);
        signUpTextView = findViewById(R.id.signup);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(LoginActivity.this, "Please enter username", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

                // TODO: Implement your authentication logic here
                Toast.makeText(LoginActivity.this, "Login button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        TextView signUpTextView = findViewById(R.id.signup);

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Implement your sign-up logic here
                Toast.makeText(LoginActivity.this, "Sign Up text clicked", Toast.LENGTH_SHORT).show();
            }
        });
    } // This is the closing brace for the onCreate method
} // This is the closing brace for the LoginActivity class