package br.com.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private TextView textNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (Button) findViewById(R.id.btnJogar);
        textNumber = (TextView) findViewById(R.id.textNumber);


        btnJogar.setOnClickListener((View view) -> {
            textNumber.setText("Número sorteado foi : " + generateNumber());
        });

    }

    private int generateNumber() {
        return new Random().nextInt(11);
    }
}
