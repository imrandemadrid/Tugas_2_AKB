package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Mohamad Imran 10117170 IF5
//Tanggal pengerjaan 15 April

public class Main4Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity5();
            }
        });


    }

    public void OpenActivity5(){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
}