package modelo;

import java.io.Serializable;

public class Equipo implements Serializable {
    private int id;
    private String nombre;
    private String ciudad;
    private String categoria;
    private String nombreCapitan;
    private int telefonoCapitan;

    public Equipo(int id, String nombre, String ciudad, String categoria, String nombreCapitan, int telefonoCapitan) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.nombreCapitan = nombreCapitan;
        this.telefonoCapitan = telefonoCapitan;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getNombreCapitan() { return nombreCapitan; }
    public void setNombreCapitan(String nombreCapitan) { this.nombreCapitan = nombreCapitan; }

    public int getTelefonoCapitan() { return telefonoCapitan; }
    public void setTelefonoCapitan(int telefonoCapitan) { this.telefonoCapitan = telefonoCapitan; }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nombreCapitan='" + nombreCapitan + '\'' +
                ", telefonoCapitan='" + telefonoCapitan + '\'' +
                '}';
    }
}
