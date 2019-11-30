package com.example.bandala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botoncito1;
    private Button botoncito2;
    private Button botoncito3;
    private Button botoncito4;

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botoncito1= (Button) findViewById(R.id.botoncito1);
        botoncito2= (Button) findViewById(R.id.botoncito2);
        botoncito3= (Button) findViewById(R.id.botoncito3);
        botoncito4=(Button) findViewById(R.id.botoncito4);

        texto=(TextView) findViewById(R.id.texto);
    }
    public void accionbotoncito1(View elemento){texto.setText("Hello World");}

    public void accionbotoncito2(View elemento){texto.setText("por fin");}

    public void accionbotoncito3(View elemento){texto.setText("se acaba");}

    public void accionbotoncito4(View elemento){texto.setText("el semestreeeee");}
}
