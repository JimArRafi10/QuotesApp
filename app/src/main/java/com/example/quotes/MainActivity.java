package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random= new Random();
    TextView tquotes;
    Button btnquote;
    Button share;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tquotes=findViewById(R.id.tvquotes);
        btnquote=findViewById(R.id.nextbutton);
        share=findViewById(R.id.sharebutton);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sharetext=tquotes.getText().toString();
                Intent sendIntent= new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/text");
                sendIntent.putExtra(Intent.EXTRA_TEXT, sharetext);
                startActivity(sendIntent);
            }
        });

        btnquote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayquote();
            }
        });

        displayquote();
    }

    public void displayquote(){

        int randnum= random.nextInt((10+1) -1)+1;
        String randquote="";

        switch (randnum){
            case 1:
                randquote= getString(R.string.quote1);
                break;
            case 2:
                randquote= getString(R.string.quote2);
                break;
            case 3:
                randquote= getString(R.string.quote3);
                break;
            case 4:
                randquote= getString(R.string.quote4);
                break;
            case 5:
                randquote= getString(R.string.quote5);
                break;
            case 6:
                randquote= getString(R.string.quote6);
                break;
            case 7:
                randquote= getString(R.string.quote7);
                break;
            case 8:
                randquote= getString(R.string.quote8);
                break;
            case 9:
                randquote= getString(R.string.quote9);
                break;
            case 10:
                randquote= getString(R.string.quote10);
                break;
        }

        tquotes.setText(randquote);
    }

}