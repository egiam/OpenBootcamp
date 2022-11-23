package one.Interfaces;

import one.Interfaces.CocheService;
import one.Interfaces.CocheServiceClassicImpl;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService cocheService = new CocheServiceClassicImpl();
        cocheService.acelerar(100);
    }
}
