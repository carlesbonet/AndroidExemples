package com.example.carles.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtNom;
    Button btnSaluda;
    TextView txtSaluda;
    Button btnEsborrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CONNECTAR AMB ELS Views del Layout per poder fer coses....

        edtNom = (EditText) findViewById(R.id.editTextNom);
        btnSaluda = (Button) findViewById(R.id.btnSaluda);
        txtSaluda = (TextView) findViewById(R.id.txtSalutacio);
        btnEsborrar= (Button)findViewById(R.id.btnEsborrar);

        /*btnSaluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSaluda.setText(edtNom.getText().toString());
            }
        });
       btnEsborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSaluda.setText(" ");
            }
        });*/

        //Per posar els Views al SAC del Senyor Listener cal afegir-los!!!

        // btnEsborrar.setOnClickListener(this);
        btnSaluda.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnSaluda:  saludar();  break;
            case R.id.btnEsborrar:  esborrar();   break;
        }

    }

    public void saludar(){
        txtSaluda.setText(edtNom.getText().toString());
    }

    public void esborrar(){
        txtSaluda.setText(" ");
    }




}
