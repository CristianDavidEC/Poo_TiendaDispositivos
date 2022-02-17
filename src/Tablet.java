public class Tablet extends Equipo{
    public Tablet(boolean tarjeta, double precioBase) {
        super(tarjeta, precioBase);
    }

    @Override
    public double calcularprecio(){
        if (super.isTarjeta()) {
            return (super.getPrecioBase() * 1.05) + 5000;
        }else {
            return super.getPrecioBase() * 1.05;
        }
    }

}
