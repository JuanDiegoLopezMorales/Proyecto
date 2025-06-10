package repositorio;

import modelo.Equipo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoRepositorio {
    private final String archivo = "equipos.dat";

    public void guardar(List<Equipo> equipos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(equipos);
        } catch (IOException e) {
            System.out.println("Error al guardar los equipos: " + e.getMessage());
        }
    }


    public List<Equipo> cargar() {
        File file = new File(archivo);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Equipo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los equipos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
