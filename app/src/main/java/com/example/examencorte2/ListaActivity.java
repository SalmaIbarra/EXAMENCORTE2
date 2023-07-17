package com.example.examencorte2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaActivity extends Activity {
    private ListView lst;
    private ArrayList<Float> precios; // Lista de precios de los elementos en el ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lst = findViewById(R.id.listView);
        precios = new ArrayList<>();

        // Supongamos que llenamos la lista con algunos precios, por ejemplo:
        precios.add(10.5f);
        precios.add(5.75f);
        precios.add(8.25f);

        // Creamos un ArrayAdapter para mostrar los precios en el ListView
        ArrayAdapter<Float> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, precios);
        lst.setAdapter(adapter);
    }

    // Método para calcular el total de la lista de precios
    private float calcularTotal() {
        float total = 0;
        for (Float precio : precios) {
            total += precio;
        }
        return total;
    }

    // Método para regresar a la actividad anterior
    private void regresar() {
        // Puedes agregar el código necesario para regresar a la actividad anterior aquí
        // Por ejemplo:
        // finish();
    }
}
