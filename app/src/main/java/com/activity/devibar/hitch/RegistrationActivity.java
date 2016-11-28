package com.activity.devibar.hitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mUpload;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_registration);


        mUpload = (Button) findViewById(R.id.btnUpload);
        mUpload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(RegistrationActivity.this, UploadDocActivity.class);
        startActivity(intent);
    }
}