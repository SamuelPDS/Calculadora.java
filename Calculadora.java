package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Entrada1;
    private EditText Entrada2;

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Entrada1 = findViewById(R.id.Entrada1);
        Entrada2 = findViewById(R.id.Entrada2);
        textView1 = findViewById(R.id.textView1);
    }

        public void Calcular (View v){
  int a = Integer.parseInt(Entrada1.getText().toString());
  int b = Integer.parseInt(Entrada2.getText().toString());

  int result = a + b;

     textView1.setText("O resultado é: "+Integer.toString(result));

 }
}
