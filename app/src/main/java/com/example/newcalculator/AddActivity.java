package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn1,btn2;
    TextView txt1;
    String result,getNum1,getNum2;
    int num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        btn1=(Button) findViewById(R.id.ab1);
        btn2=(Button) findViewById(R.id.ab2);

        txt1=(TextView) findViewById(R.id.at1);

        et1=(EditText) findViewById(R.id.an1);
        et2=(EditText) findViewById(R.id.an2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);

                txt1.setText(result);

                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob1);
            }
        });
    }
}