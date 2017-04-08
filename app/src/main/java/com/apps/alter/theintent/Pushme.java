package com.apps.alter.theintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pushme extends AppCompatActivity {
    TextView tvshow ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushme);
        tvshow = (TextView)findViewById(R.id.txtshowid);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        String j =(String) b.get("StringPush");
        tvshow.setText(j);
    }
}
