package com.example.peterboncheff.timetogo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

public class StartSearch extends AppCompatActivity {

    EditText originText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchstart);

        originText = (EditText) findViewById(R.id.origin);

        Button searchBtn = (Button) findViewById(R.id.btn_Next);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String origin = originText.getText().toString();
                Intent intentBundle = new Intent(StartSearch.this, Map.class);
                intentBundle.putExtra("origin", origin);
                startActivity(intentBundle);
            }
        });
    }
}

