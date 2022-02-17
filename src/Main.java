import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Equipo> equipos = new ArrayList();
        Celular cel1 = new Celular(false, 150000);
        Celular cel2 = new Celular(true, 200000);
        Tablet tab1 = new Tablet(true, 300000);
        Tablet tab2 = new Tablet(false, 250000);
        Portatil por1 = new Portatil(true, 2000000);
        Portatil por2 = new Portatil(false, 2500000);

        equipos.add(cel1);
        equipos.add(cel2);
        equipos.add(tab1);
        equipos.add(tab2);
        equipos.add(por1);
        equipos.add(por2);

        Venta venta = new Venta();
        venta.setEquipos(equipos);
        double total = venta.calcularVentas();
        System.out.print(total);

    }
}
