package com.codersgrimore.games.galaxysimulation;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton buttonRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // force the orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // get the button
        buttonRun = (ImageButton)findViewById(R.id.buttonRun);

        // add click listener
        buttonRun.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //
    }
}
