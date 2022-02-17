public class Celular extends Equipo {
    public Celular(boolean tarjeta, double precioBase) {
        super(tarjeta, precioBase);
    }

    @Override
    public double calcularprecio(){
        if (super.isTarjeta()) {
            return super.getPrecioBase() + 2000;
        }else {
            return super.getPrecioBase();
        }
    }

}
