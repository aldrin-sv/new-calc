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

public class SubActivity extends AppCompatActivity {

    EditText et3,et4;
    Button btn3,btn4;
    TextView txt2;
    String resul,getsNum1,getsNum2;
    int snum1,snum2,ssum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        btn3=(Button) findViewById(R.id.sb1);
        btn4=(Button) findViewById(R.id.sb2);
        txt2=(TextView) findViewById(R.id.st1);
        et3=(EditText) findViewById(R.id.sn1);
        et4=(EditText) findViewById(R.id.sn2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getsNum1=et3.getText().toString();
                getsNum2=et4.getText().toString();
                snum1=Integer.parseInt(getsNum1);
                snum2=Integer.parseInt(getsNum2);
                ssum=snum1-snum2;
                resul=String.valueOf(ssum);

                txt2.setText(resul);

                Toast.makeText(getApplicationContext(),resul,Toast.LENGTH_LONG).show();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);
            }
        });
    }
}