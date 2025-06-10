package servicio;

import modelo.Equipo;
import repositorio.EquipoRepositorio;

import java.util.List;

public class EquipoServicio {
    private final EquipoRepositorio repositorio;
    private List<Equipo> equipos;

    public EquipoServicio() {
        this.repositorio = new EquipoRepositorio();
        this.equipos = repositorio.cargar();
    }

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
        repositorio.guardar(equipos);
    }

    public List<Equipo> listarEquipos() {
        return equipos;
    }

    public boolean eliminarEquipoPorId(int id) {
        boolean eliminado = equipos.removeIf(e -> e.getId() == id);
        if (eliminado) {
            repositorio.guardar(equipos);
        }
        return eliminado;
    }

    public boolean actualizarEquipo(int id, Equipo nuevo) {
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getId() == id) {
                equipos.set(i, nuevo);
                repositorio.guardar(equipos);
                return true;
            }
        }
        return false;
    }
}
