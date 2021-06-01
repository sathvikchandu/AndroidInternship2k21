package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,number,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        link=findViewById(R.id.link);
    }

    public void next(View view) {
        //here wee will work with explicit intent
        String n= name.getText().toString();
        //Intent obj=new Intent(present class,next class)
        //we need StartActivity(object name) to start
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);
    }



    public void dial(View view) {
        //work with implicit intent
        String n=number.getText().toString();
        //uri-unified resource identifier
        //phone- tel; web-htpps:// loc- geo:lat,lan
        Uri uri= Uri.parse("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void search(View view) {
        String n= link.getText().toString();
        Uri uri=Uri.parse("https://"+n);
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);

    }
}