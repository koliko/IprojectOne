package com.iproject.iprojectone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //    this part defines my varibles in the program
    TextView textView;
    Button button;
    int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textView = findViewById( R.id.my_text );
        button = findViewById( R.id.my_button );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num *= 2;
                textView.setText( String.valueOf( num ) );
            }
        } );
    }

}
