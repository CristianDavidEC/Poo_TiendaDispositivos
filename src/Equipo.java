public abstract class Equipo {
    private boolean tarjeta;
    private double precioBase = 0;


    public Equipo(boolean tarjeta, double precioBase) {
        this.tarjeta = tarjeta;
        this.precioBase = precioBase;
    }

    public abstract double calcularprecio();

    //Gets
    public boolean isTarjeta() {
        return tarjeta;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    //Sets
    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}

