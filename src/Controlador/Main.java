package Controlador;

import Entidades.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ControlVentas cv = new ControlVentas();

        Celular c1 = new Celular(150000);
        cv.registrarVenta(c1, false);

        Celular c2 = new Celular(200000);
        cv.registrarVenta(c2, true);

        Tablet t1 = new Tablet(300000);
        cv.registrarVenta(t1, true);

        Tablet t2 = new Tablet(250000);
        cv.registrarVenta(t2, false);

        Portatil p1 = new Portatil(2000000);
        cv.registrarVenta(p1, true);

        Portatil p2 = new Portatil(2500000);
        cv.registrarVenta(p2, false);

        System.out.print(cv.calcularTotalVentas());


    }
}
