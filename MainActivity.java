package com.example.prc_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText et1,et2;
    Button add,sub,div,mul;
    TextView ans;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div= findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        ans = findViewById(R.id.ans);

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int firstvalue, secondvalue, answer;

            firstvalue = Integer.parseInt(et1.getText().toString());
            secondvalue = Integer.parseInt(et2.getText().toString());
            answer = firstvalue + secondvalue;
            ans.setText(String.valueOf(answer));
        }
    });

    mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int firstvalue, secondvalue, answer;

            firstvalue = Integer.parseInt(et1.getText().toString());
            secondvalue = Integer.parseInt(et2.getText().toString());
            answer = firstvalue * secondvalue;
            ans.setText(String.valueOf(answer));
        }
    });

    sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int firstvalue, secondvalue, answer;

            firstvalue = Integer.parseInt(et1.getText().toString());
            secondvalue = Integer.parseInt(et2.getText().toString());
            answer = firstvalue - secondvalue;
            ans.setText(String.valueOf(answer));
        }
    });

    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int firstvalue, secondvalue, answer;

            firstvalue = Integer.parseInt(et1.getText().toString());
            secondvalue = Integer.parseInt(et2.getText().toString());
            answer = firstvalue / secondvalue;
            ans.setText(String.valueOf(answer));
        }
    });




}
}