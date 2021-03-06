package com.example.smd_assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static ContactRoomDatabse db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         db = Room.databaseBuilder(getApplicationContext(),
                ContactRoomDatabse.class, "database-name").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        setContentView(R.layout.activity_main);
        TextView moveto=(TextView) findViewById(R.id.textView5);
        moveto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
            }
        });
        Button lgn;
        lgn=(Button) findViewById(R.id.button);
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ContactList.class);
                startActivity(i);
            }
        });
    }
}
