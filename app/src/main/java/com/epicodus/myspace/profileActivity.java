package com.epicodus.myspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {
    private Button mblogButton;
    private EditText minputBlog;
    private TextView mBlogTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        minputBlog = (EditText) findViewById(R.id.blogInput);
        mblogButton = (Button) findViewById(R.id.blogButton);
        mBlogTextView = (TextView) findViewById(R.id.BlogTextView);
        mblogButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String blog = minputBlog.getText().toString();
//                Intent intent = new Intent(profileActivity.this, profileActivity.class);
//                intent.putExtra("blog", blog);
                mBlogTextView.setText(blog);
                //startActivity(intent);


            }
        });
    }
}
