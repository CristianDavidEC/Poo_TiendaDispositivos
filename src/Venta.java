import java.util.ArrayList;

public class Venta {

    private ArrayList<Equipo> equipos = new ArrayList();

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public double calcularVentas(){
        double valor = 0;
        for (int i = 0; i < equipos.size(); i++){
            valor += equipos.get(i).calcularprecio();
        }
        return valor;
    }
}
