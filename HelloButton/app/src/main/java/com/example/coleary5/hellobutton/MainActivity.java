package com.example.coleary5.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    private TextView mMessageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //This method is called when the app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Code I add goes here :)
        //connect code to our view
        mMessageTextView = findViewById(R.id.message_textview);

        final Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter=0;
                updateView();
            }
        });

                //test - mMessageTextView.setText("Cahir");
        //Log.d("HB", "Test log");

        //Example crash
       // mMessageTextView=findViewById(0);
        //mMessageTextView.setText("This will crash");

    }

    public void handleDecrement(View view) {
        mCounter = mCounter -1;
        updateView();
    }

    public void handleIncrement(View view) {
        mCounter = mCounter +1;
        updateView();
    }
    private void updateView(){
        mMessageTextView.setText(getString(R.string.message_format, mCounter));

    }
}
