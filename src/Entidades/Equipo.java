package Entidades;


public abstract class Equipo {
    //private boolean tarjeta;
    private double precioBase;
    private double recargo;

    public Equipo(double precioBase, double recargo) {
        this.precioBase = precioBase;
        this.recargo = recargo;
    }


    public abstract double calcularprecio();

    //Get
    public double getPrecioBase() {return precioBase;}
    public double getRecargo() {return recargo;}
}

