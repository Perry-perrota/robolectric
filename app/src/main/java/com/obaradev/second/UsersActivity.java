package com.obaradev.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UsersActivity extends AppCompatActivity {
    private TextView mUsersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.users_activity);

        mUsersTextView=(TextView) findViewById(R.id.usersTextView);
        Intent intent=getIntent();
        String location=intent.getStringExtra("location");
        mUsersTextView.setText("Here are the close by locations:" + location);
    }
}
