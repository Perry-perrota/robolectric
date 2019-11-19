package com.obaradev.second;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity{
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mLogInButton;
    private EditText mLoginText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        mLogInButton=(Button) findViewById(R.id.button);
        mLoginText=(EditText) findViewById(R.id.locationText);
        mLogInButton.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    String location=mLoginText.getText().toString();
                    Intent intent=new Intent(MainActivity.this,UsersActivity.class);
                    intent.putExtra("location",location);
                    startActivity(intent);

                }
                });
            }

    }


