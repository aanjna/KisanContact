package com.kisannetwork.praveen.kisancontact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Praveen Patel on 10/3/2016.
 */
public class OtpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        Button btn = (Button) findViewById(R.id.message);
    }
}
