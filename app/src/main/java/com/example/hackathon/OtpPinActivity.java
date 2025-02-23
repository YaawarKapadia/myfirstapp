package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OtpPinActivity extends AppCompatActivity {

    String phoneNumber;
    TextView number;
    TextView resendText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_pin);
        
        resendText = findViewById(R.id.resend_text);
        phoneNumber = getIntent().getExtras().getString("phone");
        number = findViewById(R.id.phone);
        number.setText(phoneNumber);
        Toast.makeText(this, phoneNumber, Toast.LENGTH_SHORT).show();
        
        
    }
    public void resend(View view){
        Toast.makeText(this, "Resending OTP", Toast.LENGTH_SHORT).show();
    }
    public void verify(View view){
        Intent intent = new Intent(getApplicationContext(), UserHomeActivity.class);
        startActivity(intent);
    }
}