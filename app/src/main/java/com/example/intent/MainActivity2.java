package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String getMsg = intent.getStringExtra("message");
        ((EditText)findViewById(R.id.editTextSecond)).setText(getMsg);
    }
    public void onSendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String getMessage = ((EditText)findViewById(R.id.editTextSecond)).getText().toString();
        intent.putExtra("message", getMessage);
        startActivity(intent);
        finish();
    }
    public void cancel(View view) {
        Intent oldIntent = getIntent();
        String getMsg = oldIntent.getStringExtra("message");
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("message", getMsg);
        startActivity(intent);
        finish();
    }

}