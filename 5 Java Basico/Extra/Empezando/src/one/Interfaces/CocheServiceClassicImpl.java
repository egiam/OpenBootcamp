package one.Interfaces;

import one.Coche;
import one.CocheHibrido;
import one.Interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public void acelerar(Integer cantidad) {
        Coche coche = crearCocheDemo();
        coche.acelerar(cantidad);
        System.out.println(coche);
    }

    @Override
    public void frenar(Integer cantidad) {
        Coche coche = crearCocheDemo();
        coche.acelerar(cantidad);
        System.out.println(coche);
    }

    @Override
    public Coche crearCocheDemo() {
        return new CocheHibrido("Rojo", "Fiat", "Uno", 1000.0, 4.0, "Motor Electrico", "Motor Hibrido");
    }
}

