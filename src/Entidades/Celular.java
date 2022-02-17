package Entidades;

public class Celular extends Equipo {
    public Celular(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularprecio(){
        return super.getPrecioBase();
    }
}
