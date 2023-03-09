package entity;

import jakarta.persistence.*;

@Entity
public class Profesiones {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PROFESION")
    private int idProfesion;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Profesiones that = (Profesiones) o;

        if (idProfesion != that.idProfesion) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProfesion;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
