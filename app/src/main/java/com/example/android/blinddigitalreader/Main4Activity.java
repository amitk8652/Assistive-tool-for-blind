package com.example.android.blinddigitalreader;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView feedbk ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        feedbk = (TextView)findViewById(R.id.feedback);
        feedbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String to = "dbitproject2019@gmail.com";
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,to);
                email.putExtra(Intent.EXTRA_SUBJECT,"FeedBack");
                email.putExtra(Intent.EXTRA_TEXT,"");

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose App to Send Email"));

            }
        });




    }
}
