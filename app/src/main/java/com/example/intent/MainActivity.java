package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            setContentView(R.layout.activity_main);
            Intent intent = getIntent();
            String getMsg = intent.getStringExtra("message");
            ((EditText) findViewById(R.id.editTextFirst)).setText(getMsg);
            if (getMsg != null)
            Toast.makeText(getApplicationContext(), getMsg, Toast.LENGTH_SHORT).show();

    }
    public void onSendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String getMessage = ((EditText)findViewById(R.id.editTextFirst)).getText().toString();
        intent.putExtra("message", getMessage);
        startActivity(intent);
        finish();
    }
    public void exit(View view)
    {
        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);

        a_builder.setMessage(getString(R.string.ExitMessage)).setTitle(getString(R.string.Alert)).setIcon(R.drawable.alert).setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {dialog.cancel();}}).setPositiveButton("Выйти", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {finish();}});
        a_builder.show();

    }


}