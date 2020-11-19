package co.edu.ufps.tallerunisimon2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class RegistrarTiendaActivity extends AppCompatActivity {
    TextInputEditText imagen, nombre, descripcion, horario,telefono;
    Button guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_tienda);
        imagen = findViewById(R.id.textimagen);
        nombre = findViewById(R.id.textnombre);
        descripcion = findViewById(R.id.textdescripcion);
        horario = findViewById(R.id.texthorario);
        telefono = findViewById(R.id.texthorario);
        guardar = findViewById(R.id.btguardar);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarTienda();
            }
        });
    }

    private void guardarTienda() {
    }
}