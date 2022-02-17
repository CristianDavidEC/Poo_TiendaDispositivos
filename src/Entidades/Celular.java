package Entidades;

public class Celular extends Equipo {
    public Celular(double precioBase) {
        super(precioBase, 0);
    }

    @Override
    public double calcularprecio(){
        return super.getPrecioBase();
    }
}
