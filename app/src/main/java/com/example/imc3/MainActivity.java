package com.example.imc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.txtPeso);
        alt = findViewById(R.id.txtAltura);
        resultado = findViewById(R.id.tresul);
    }

    EditText peso;
    EditText alt;
    TextView resultado;



        public void Masc(View view) {
            double txtPeso, txtAltura, tresul;

            txtPeso = Double.parseDouble(peso.getText().toString());
            txtAltura = Double.parseDouble(alt.getText().toString());
            double valor;

            valor = txtPeso / (txtAltura * txtAltura);

            if (valor > 43) {
                resultado.setText("Seu IMC é de: " + valor + "e você está com obesidade Morbida");
            } else if (valor > 30 && valor < 39.9) {
                resultado.setText("Seu IMC é de: " + valor + "e você está com obesidade Moderada");
            } else if (valor > 25 && valor < 29.9) {
                resultado.setText("Seu IMC é de: " + valor + "e você está com obesidade Leve");
            } else if (valor > 20 && valor < 24.49) {
                resultado.setText("Seu IMC é de: " + valor + "e você está Normal");
            } else {
                resultado.setText("Seu IMC é de: " + valor + "e você está abaixo do normal");
            }
        }
            public  void Fem (View view){
                double txtPeso, txtAltura, tresul;

                txtPeso = Double.parseDouble(peso.getText().toString());
                txtAltura = Double.parseDouble(alt.getText().toString());
                double valor;
                 valor = txtPeso / (txtAltura * txtAltura);

                if (valor > 39) {
                    resultado.setText("Seu IMC é de: " + valor + "e você está com obesidade Morbida");
                } else if (valor > 29 && valor < 38.9) {
                    resultado.setText("Seu IMC é de: " + valor + "e você está com obesidade Moderada");
                } else if (valor > 24 && valor < 28.9) {
                    resultado.setText("Seu IMC é de: " + valor + "e você está com obesidade Leve");
                } else if (valor > 19 && valor < 23.9) {
                    resultado.setText("Seu IMC é de: " + valor + "e você está Normal");
                } else {
                    resultado.setText("Seu IMC é de: " + valor + "e você está abaixo do normal");
                }

            }
        }
