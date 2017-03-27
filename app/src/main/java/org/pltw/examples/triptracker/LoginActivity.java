package org.pltw.examples.triptracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText mNameEdit;
    private Button mSignUpButton;
    private Button mLoginButton;
    private TextView mSignUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mNameEdit = (EditText) findViewById(R.id.enter_name);
        mSignUpButton = (Button) findViewById(R.id.sign_up_button);
        mLoginButton = (Button) findViewById(R.id.login_button);
        mSignUpTextView = (TextView) findViewById(R.id.sign_up_text);
        SignUpTextOnClick signUpTextOnClick = new SignUpTextOnClick();
        mSignUpTextView.setOnClickListener(signUpTextOnClick);
    }

    @Override
    public void onBackPressed(){
        mSignUpButton.setVisibility(View.GONE);
        mNameEdit.setVisibility(View.GONE);
        mLoginButton.setVisibility(View.VISIBLE);
        mSignUpTextView.setVisibility(View.VISIBLE);
    }

    private class SignUpTextOnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            mSignUpButton.setVisibility(View.VISIBLE);
            mNameEdit.setVisibility(View.VISIBLE);
            mLoginButton.setVisibility(View.GONE);
            mSignUpTextView.setVisibility(View.GONE);
        }
    }

}
