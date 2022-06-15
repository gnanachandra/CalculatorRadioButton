package com.example.calculatorradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton add;
    RadioButton sub;
    int select;
    RadioGroup radioGroup;
    TextView textView;
    EditText t1;
    EditText t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void result(View view)
    {
        t1 = findViewById(R.id.num1);
        t2 = findViewById(R.id.num2);
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        textView = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radioGroup);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        int addid = add.getId();
        int subid = sub.getId();
        select =  radioGroup.getCheckedRadioButtonId();
        if(select==addid)
        {
            textView.setText("Result : "+(n1+n2));
        }
        else if(select==subid)
        {
            textView.setText("Result :"+(n1-n2));
        }
    }
}