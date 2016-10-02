package com.kisannetwork.praveen.kisancontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tv, contct, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        Button btn = (Button) findViewById(R.id.message);
        tv = (TextView) findViewById(R.id.tv_name);
        contct = (TextView) findViewById(R.id.tv_contact);
        email = (TextView) findViewById(R.id.tv_email);
        //store the text in variable
//     String name = getIntent().getExtras().getString("name");
 //       String contact = getIntent().getExtras().getString("contact");
        //String email = getIntent().getExtras().getString("email");
        //display text

        tv.setText("Anu Shree");
        contct.setText("9660294530");
        email.setText("kisan@gmail.com");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(DetailActivity.this, OtpActivity.class);
                startActivity(i);
            }
        });
    }
}
