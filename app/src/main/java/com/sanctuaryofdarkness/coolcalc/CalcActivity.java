package com.sanctuaryofdarkness.coolcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    String runningNumber = "";
    TextView resultsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button oneBtn = (Button)findViewById(R.id.oneBtn);
        Button twoBtn = (Button)findViewById(R.id.twoBtn);
        Button threeBtn = (Button)findViewById(R.id.threeBtn);
        Button fourBtn = (Button)findViewById(R.id.fourBtn);
        Button fiveBtn = (Button)findViewById(R.id.fiveBtn);
        Button sixBtn = (Button)findViewById(R.id.sixBtn);
        Button sevenBtn = (Button)findViewById(R.id.sevenBtn);
        Button eightBtn = (Button)findViewById(R.id.eightBtn);
        Button nineBtn = (Button)findViewById(R.id.nineBtn);
        Button zeroBtn = (Button)findViewById(R.id.zeroBtn);

        ImageButton calcBtn = (ImageButton)findViewById(R.id.calcBtn);
        ImageButton divideBtn = (ImageButton)findViewById(R.id.divideBtn);
        ImageButton multiplyBtn = (ImageButton)findViewById(R.id.multiplyBtn);
        ImageButton subtractBtn = (ImageButton)findViewById(R.id.subtractBtn);
        ImageButton addBtn = (ImageButton)findViewById(R.id.addBtn);

        Button clearBtn = (Button)findViewById(R.id.clearBtn);

        resultsView = (TextView)findViewById(R.id.resultsView);
        resultsView.setText(""); // Clear results

        oneBtn.setOnClickListener( new View.OnClickListener(){
           @Override
            public void onClick(View w){
               numberPressed(1);

           }
        });

        twoBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(2);
            }
        });

        threeBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(3);

            }
        });

        fourBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(4);
            }
        });

        fiveBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(5);
            }
        });

        sixBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(6);
            }
        });

        sevenBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(7);
            }
        });

        eightBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(8);
            }
        });

        nineBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(9);
            }
        });

        zeroBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){
                numberPressed(0);
            }
        });

        calcBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){

            }
        });

        clearBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){

            }
        });

        addBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){

            }
        });

        subtractBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){

            }
        });

        divideBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){

            }
        });

        multiplyBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View w){

            }
        });


    }

    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        resultsView.setText(runningNumber);
    }
}
