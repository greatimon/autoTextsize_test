package com.example.jyn.autotextsize_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  AutofitTextView autofitTextView;
    private  AutofitTextView autofitTextView_1;
    private  AutofitTextView autofitTextView_2;
    private  AutofitTextView autofitTextView_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autofitTextView = findViewById(R.id.output_autofit);
        autofitTextView_1 = findViewById(R.id.output_autofit_1);
        autofitTextView_2 = findViewById(R.id.output_autofit_2);
        autofitTextView_3 = findViewById(R.id.output_autofit_3);


        autofitTextView.setText("1_AutoResizeTextview");
        autofitTextView_1.setText("2_AutoResizeTextview");
        autofitTextView_2.setText("3_AutoResizeTextview");
        autofitTextView_3.setText("4_AutoResizeTextview");
    }
}
