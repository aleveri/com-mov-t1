package com.desarrollomovil.taller1_aleveri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int _number;
    private int _numberTries;
    private TextView _clue;
    private TextView _nTries;
    private TextView _compare;
    private EditText _input;
    private Button _verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _number = (int) (Math.random() * 51 + 1);
        _numberTries = 0;
        _clue = findViewById(R.id.clue);
        _nTries = findViewById(R.id.nTries);
        _compare = findViewById(R.id.compare);
        _verify = findViewById(R.id.verify);
        _input = findViewById(R.id.userNumber);

        _verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _numberTries++;
                _nTries.setText(Integer.toString(_numberTries));
                int userNumber = Integer.parseInt(_input.getText().toString());
                if(userNumber == _number)_compare.setText(R.string.equal);
                if(userNumber > _number)_compare.setText(R.string.above);
                if(userNumber < _number)_compare.setText(R.string.under);
            }
        });
    }
}
