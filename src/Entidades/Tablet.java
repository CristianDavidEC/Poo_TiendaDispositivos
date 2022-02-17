package Entidades;

public class Tablet extends Equipo{
    public Tablet(double precioBase) {
        super(precioBase, 5000);
    }

    @Override
    public double calcularprecio(){
        return super.getPrecioBase() * 1.05;
    }

}
