package com.example.abhisheki.intentfirst;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btngoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngoogle = (Button) findViewById(R.id.btnGoogle);
        btngoogle.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        EditText txt= (EditText)findViewById(R.id.TxtSearch);
        StartGoogle(txt.getText().toString());
    }

    private void StartGoogle(String searchString)
    {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, searchString);
        startActivity(intent);
    }
}
