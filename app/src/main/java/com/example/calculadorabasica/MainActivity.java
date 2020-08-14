package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Procesar (View vista){
        try{
        RadioGroup optOperaciones=(RadioGroup)findViewById(R.id.optOperaciones);


        TextView tempval=(TextView)findViewById(R.id.txtnum1);
        double num1= Double.parseDouble( tempval.getText().toString());

        tempval=(TextView)findViewById(R.id.txtnum2);
        double num2= Double.parseDouble((tempval.getText().toString()));
        double respuesta=0;
        switch (optOperaciones.getCheckedRadioButtonId()) {
            case R.id.rbnSuma:
                respuesta = num1 + num2;
                break;
            case R.id.rbnResta:
                respuesta = num1 - num2;
                break;
            case R.id.rbnMulti:
                respuesta = num1 * num2;
                break;
            case R.id.rbnDivicion:
                respuesta = num1 / num2;
                break;
            case R.id.rbnexpo:
                respuesta= Math.pow(num1, num2);
                break;
            case R.id.rbnPorcen:
                respuesta = (num1 / num2) * num1;
                break;
            case R.id.rbnMod:
                respuesta= num1%num2;
                break;
            case R.id.rbnFactoreo:
                respuesta= num1*(num1+1)*(Math.pow(num2,2)-3);
                break;
        }
            tempval=(TextView)findViewById(R.id.lblresp);
            tempval.setText("Respuesta: " + respuesta);
        } catch (Exception err){
            Toast.makeText(getApplicationContext(), "Porfavor ingrese valores", Toast.LENGTH_LONG).show();

        }
    }


}