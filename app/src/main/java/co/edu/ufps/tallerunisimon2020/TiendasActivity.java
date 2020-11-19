package co.edu.ufps.tallerunisimon2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TiendasActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    FloatingActionButton registrarTienda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);
        recyclerView = (RecyclerView) findViewById(R.id.contenedortienda);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new TiendaAdapter(cargarDatos(),R.id.card);
        recyclerView.setAdapter(mAdapter);
        registrarTienda = findViewById(R.id.registrarTienda);
        registrarTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irRegistrarTienda();
            }
        });
    }

    private void irRegistrarTienda() {
        Intent intent = new Intent(this, RegistrarTiendaActivity.class);
        startActivity(intent);
    }

    public ArrayList<Tienda> cargarDatos(){
        ArrayList<Tienda> tiendas = new ArrayList<>();
        tiendas.add(new Tienda("1","https://www.eluniversal.com.co/binrepository/1050x700/0c0/0d0/none/13704/TNTI/image_content_3023679_20200427114131.jpg","Don Pedro","Viveres","8:00-9:00","Av 10",0,0,"5698794"));
        tiendas.add(new Tienda("2","https://www.dominoprofesional.com/wp-content/uploads/2019/02/Los-nombres-de-tiendas-de-barrio-que-todos-en-Guatemala-han-visto-alguna-vez-885x500.jpg","Don Antonio","Viveres","8:00-9:00","Av 10",0,0,"5698794"));
        tiendas.add(new Tienda("3","https://blog.oxfamintermon.org/wp-content/uploads/2014/11/tienda-solidaria-comercio-justo-oxfam-intermon.jpg","Don Juan","Viveres","8:00-9:00","Av 10",0,0,"5698794"));
        return tiendas;
    }
}