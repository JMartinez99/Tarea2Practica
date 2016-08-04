package com.example.sysadmin.tarea2practica;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ventana1 extends AppCompatActivity {
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana1);
        Button suma=(Button) findViewById(R.id.button);
        Button resta=(Button) findViewById(R.id.button2);
        Button multi=(Button) findViewById(R.id.button3);
        Button divi=(Button) findViewById(R.id.button4);
        final EditText N1 = (EditText) findViewById(R.id.editText);
        final EditText N2 = (EditText) findViewById(R.id.editText2);
        resultado = (TextView)findViewById(R.id.textView4);


    suma.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Double no1 = Double.parseDouble(N1.getText().toString());
                Double no2 = Double.parseDouble(N2.getText().toString());
                Double total = no1 + no2;
                String r = String.valueOf(total);
                resultado.setText(r);
            }});

        resta.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Double no1 = Double.parseDouble(N1.getText().toString());
                Double no2 = Double.parseDouble(N2.getText().toString());
                Double total = no1 - no2;
                String r = String.valueOf(total);
                resultado.setText(r);
            }});

        multi.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Double no1 = Double.parseDouble(N1.getText().toString());
                Double no2 = Double.parseDouble(N2.getText().toString());
                Double total = no1 * no2;
                String r = String.valueOf(total);
                resultado.setText(r);
            }});

        divi.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Double no1 = Double.parseDouble(N1.getText().toString());
                Double no2 = Double.parseDouble(N2.getText().toString());
                Double total = no1 / no2;
                String r = String.valueOf(total);
                resultado.setText(r);
            }});
    }
}

