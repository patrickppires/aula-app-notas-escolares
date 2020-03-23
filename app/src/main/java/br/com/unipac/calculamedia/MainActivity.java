package br.com.unipac.calculamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etanol, gasolina;
    Button addCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etanol = (EditText) findViewById(R.id.inputEtanol);
        gasolina = (EditText) findViewById(R.id.inputGasolina);

        addCalc = (Button) findViewById(R.id.button);

        addCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valorEtanol = Double.parseDouble(etanol.getText().toString());
                Double valorGasolina = Double.parseDouble(gasolina.getText().toString());

                Double result = valorEtanol / valorGasolina;

                if(result >= 0.7)
                {
                    Toast.makeText(MainActivity.this, "Compensa Gasolina", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Compensa Etanol", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
