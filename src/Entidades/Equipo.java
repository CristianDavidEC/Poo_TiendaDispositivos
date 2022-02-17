package Entidades;


public abstract class Equipo {
    //private boolean tarjeta;
    private double precioBase = 0;

    public Equipo(double precioBase) {
        this.precioBase = precioBase;
    }


    public abstract double calcularprecio();

    //Get
    public double getPrecioBase() {return precioBase;}

}

