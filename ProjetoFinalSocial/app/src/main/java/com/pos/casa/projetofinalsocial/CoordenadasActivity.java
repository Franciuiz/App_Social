package com.pos.casa.projetofinalsocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CoordenadasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordenadas);

        final EditText stringLatitude = findViewById(R.id.editTextLatitude);
        final EditText stringLongitude = findViewById(R.id.editTextLongitude);
        Button buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double valorLatitude = Double.parseDouble(stringLatitude.getText().toString());
                Double valorLongitude = Double.parseDouble(stringLongitude.getText().toString());

                Intent i = new Intent(CoordenadasActivity.this, MapsActivity.class);
                Bundle bundle = new Bundle();

                bundle.putDouble("latitude", valorLatitude);
                bundle.putDouble("longitude", valorLongitude);

                i.putExtras(bundle);
                startActivity(i);
            }
        });


    }
}
