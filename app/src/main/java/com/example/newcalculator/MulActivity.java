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

public class MulActivity extends AppCompatActivity {

    EditText et5,et6;
    Button btn5,btn6;
    String resu,geNum1,geNum2;
    int mnum1,mnum2,ssum1;
    TextView txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        btn5=(Button) findViewById(R.id.mb1);
        btn6=(Button) findViewById(R.id.mb2);
txt3=(TextView) findViewById(R.id.mt1);
        et5=(EditText) findViewById(R.id.mn1);
        et6=(EditText) findViewById(R.id.mn2);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                geNum1=et5.getText().toString();
                geNum2=et6.getText().toString();
                mnum1=Integer.parseInt(geNum1);
                mnum2=Integer.parseInt(geNum2);
                ssum1=mnum1*mnum2;
                resu=String.valueOf(ssum1);
                txt3.setText(resu);
                Toast.makeText(getApplicationContext(),resu,Toast.LENGTH_LONG).show();

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob3=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob3);
            }
        });
    }
}