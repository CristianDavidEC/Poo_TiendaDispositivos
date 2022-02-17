public class Portatil extends Equipo {

    public Portatil(boolean tarjeta, double precioBase) {
        super(tarjeta, precioBase);
    }

    @Override
    public double calcularprecio(){
        if (super.isTarjeta()) {
            return (super.getPrecioBase() * 1.1) + 10000;
        }else {
            return super.getPrecioBase() * 1.1;
        }
    }

}
