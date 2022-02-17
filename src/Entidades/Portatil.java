package Entidades;

public class Portatil extends Equipo {

    public Portatil(double precioBase) {
        super(precioBase, 10000);
    }

    @Override
    public double calcularprecio(){
        return super.getPrecioBase() * 1.1;
    }

}
