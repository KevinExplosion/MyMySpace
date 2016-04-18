package com.epicodus.myspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mhomeButton;
    private Button mprofileButton;
    private Button mpictureButton;
    private Button mfriendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpictureButton = (Button) findViewById(R.id.pictureButton);
        mpictureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pictureActivity.class);
                startActivity(intent);
            }
        });

        mprofileButton = (Button) findViewById(R.id.profileButton);
        mprofileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profileActivity.class);
                startActivity(intent);
            }
        });

        mhomeButton = (Button) findViewById(R.id.homeButton);
        mhomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        mfriendButton = (Button) findViewById(R.id.friendButton);
        mfriendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FriendActivity.class);
                startActivity(intent);
            }

        });


    }
}
