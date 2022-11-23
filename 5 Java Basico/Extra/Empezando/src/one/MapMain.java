package one;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>(); // HashMap es una implementacion de Map que no mantiene el orden de los elementos que se insertan

        personas.put("12345678A", "Nombre Apellido 1");
        personas.put("12345678H", "Nombre Apellido 1");
        personas.put("12345678G", "Nombre Apellido 1");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String value : personas.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

    }
}
