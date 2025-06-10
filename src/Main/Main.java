package Main;

import modelo.Equipo;
import servicio.EquipoServicio;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EquipoServicio servicio = new EquipoServicio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n🏆 COPA DEL BARRIO - MENÚ 🏆");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Listar equipos");
            System.out.println("3. Eliminar equipo");
            System.out.println("4. Actualizar equipo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre del equipo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = scanner.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Nombre del capitán: ");
                    String capitan = scanner.nextLine();
                    System.out.print("Teléfono del capitán: ");
                    int telefono = scanner.nextInt();
                    scanner.nextLine();

                    Equipo nuevo = new Equipo(id, nombre, ciudad, categoria, capitan, telefono);
                    servicio.registrarEquipo(nuevo);
                    System.out.println("✅ Equipo registrado correctamente.");
                    break;

                case 2:
                    List<Equipo> equipos = servicio.listarEquipos();
                    System.out.println("\n📋 Lista de Equipos:");
                    for (Equipo e : equipos) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("ID del equipo a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (servicio.eliminarEquipoPorId(idEliminar)) {
                        System.out.println("✅ Equipo eliminado.");
                    } else {
                        System.out.println("❌ No se encontró el equipo.");
                    }
                    break;

                case 4:
                    System.out.print("ID del equipo a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre del equipo: ");
                    String nNombre = scanner.nextLine();
                    System.out.print("Nueva ciudad: ");
                    String nCiudad = scanner.nextLine();
                    System.out.print("Nueva categoría: ");
                    String nCategoria = scanner.nextLine();
                    System.out.print("Nuevo nombre del capitán: ");
                    String nCapitan = scanner.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    int nTelefono =scanner.nextInt();
                    scanner.nextLine();

                    Equipo actualizado = new Equipo(idActualizar, nNombre, nCiudad, nCategoria, nCapitan, nTelefono);
                    if (servicio.actualizarEquipo(idActualizar, actualizado)) {
                        System.out.println("✅ Equipo actualizado.");
                    } else {
                        System.out.println("❌ No se encontró el equipo.");
                    }
                    break;

                case 5:
                    System.out.println("👋 Saliendo del sistema. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
