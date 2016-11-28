package com.activity.devibar.hitch;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UploadDocActivity extends AppCompatActivity implements View.OnClickListener {



    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_upload_doc);


        mSubmit = (Button) findViewById(R.id.btnSubmit);

        mSubmit.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("HITCH PROVIDER #20161007H204");
        builder.setMessage("Your registration is now processed. Please check your e-mail for the next step.");
        builder.show();
    }
}
