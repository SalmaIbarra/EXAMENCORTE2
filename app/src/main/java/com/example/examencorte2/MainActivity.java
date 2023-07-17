import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.examencorte2.Ventas;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private int idVenta = 1; // Contador para el ID de las ventas
    private ArrayList<Ventas> listaVentas = new ArrayList<>(); // Lista de ventas realizadas
    private TextView txtResultado;
    private EditText edtCantidadGasolina, edtPrecioGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        edtCantidadGasolina = findViewById(R.id.edtCantidadGasolina);
        edtPrecioGasolina = findViewById(R.id.edtPrecioGasolina);
    }

    // Método para iniciar una venta
    public void iniciarVenta(View view) {
        txtResultado.setText(""); // Limpiamos el resultado anterior
    }

    // Método para hacer una venta
    public void hacerVenta(View view) {
        int cantidadGasolina = Integer.parseInt(edtCantidadGasolina.getText().toString());
        float precioGasolina = Float.parseFloat(edtPrecioGasolina.getText().toString());

        // Creamos una nueva venta
        Ventas venta = new Ventas(idVenta, cantidadGasolina, precioGasolina);
        idVenta++;

        // Agregamos la venta a la lista de ventas realizadas
        listaVentas.add(venta);

        // Actualizamos el resultado en el TextView
        txtResultado.setText("Venta #" + venta.getIdVenta() + " realizada.\n" +
                "Total: $" + venta.getTotalVenta());
    }

    // Método para registrar una venta en la listaVentas
    public void registroVenta(View view) {
        // Puedes agregar aquí la lógica necesaria para registrar las ventas en tu base de datos o sistema de almacenamiento.
    }

    // Método para limpiar los campos de entrada y resultado
    public void limpiar(View view) {
        edtCantidadGasolina.setText("");
        edtPrecioGasolina.setText("");
        txtResultado.setText("");
    }

    // Método para cerrar la venta actual y empezar una nueva
    public void cerrar(View view) {
        idVenta++; // Aumentamos el contador de ID para la siguiente venta
        limpiar(view); // Limpiamos los campos de entrada y resultado
    }

    // Método para consultar las ventas realizadas
    public void consultarVentas(View view) {
        String resultado = "Ventas realizadas:\n";
        for (Ventas venta : listaVentas) {
            resultado += "Venta #" + venta.getIdVenta() + ", Gasolina: " + venta.getCantidadGasolina() + " litros, " +
                    "Precio: $" + venta.getPrecioGasolina() + ", Total: $" + venta.getTotalVenta() + "\n";
        }
        txtResultado.setText(resultado);
    }
}
