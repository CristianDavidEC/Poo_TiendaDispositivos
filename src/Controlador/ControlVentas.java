package Controlador;

import Entidades.Equipo;
import Entidades.Venta;

import java.util.ArrayList;

public class ControlVentas {
    private ArrayList<Venta> ventas;

    public ControlVentas() {
        //Inicializaciones en el constructor
        this.ventas = new ArrayList();
    }

    public void registrarVenta (Equipo producto, boolean tarjeta) {
        Venta venta = new Venta(tarjeta, producto);
        ventas.add(venta);
    }

    public double calcularTotalVentas(){
        double valor = 0;
        for (int i = 0; i < ventas.size(); i++){
            valor += ventas.get(i).calcularValor();
        }
        return valor;
    }
}
