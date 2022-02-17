package Entidades;

import java.util.ArrayList;

public class Venta {
    private boolean tarjeta;
    private Equipo producto;

    public Venta(boolean tarjeta, Equipo producto) {
        this.tarjeta = tarjeta;
        this.producto = producto;
    }

    public double calcularValor() {
        if (tarjeta == true) {
            return producto.calcularprecio() + producto.getRecargo();
        }
        return producto.calcularprecio();
    }
}


