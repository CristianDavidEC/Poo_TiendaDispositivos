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
            if (producto instanceof Celular) {
                return producto.calcularprecio() + 2000;
            } else if (producto instanceof Tablet) {
                return producto.calcularprecio() + 5000;
            } else if (producto instanceof Portatil) {
                return producto.calcularprecio() + 10000;
            }
        }
        return producto.calcularprecio();
    }
}


