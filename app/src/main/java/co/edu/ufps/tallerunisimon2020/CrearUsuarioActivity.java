package co.edu.ufps.tallerunisimon2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class CrearUsuarioActivity extends AppCompatActivity {
    TextInputEditText nuevoEmail, nuevaClave;
    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);
        nuevoEmail = findViewById(R.id.nuevoemail);
        nuevaClave = findViewById(R.id.nuevaclave);
        crear = findViewById(R.id.crear);
    }
}