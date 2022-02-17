package Entidades;

public class Portatil extends Equipo {

    public Portatil(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularprecio(){
        return super.getPrecioBase() * 1.1;
    }

}
