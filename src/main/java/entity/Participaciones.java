package entity;

import jakarta.persistence.*;

@Entity
public class Participaciones {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PARTIPICACIONES")
    private int idPartipicaciones;
    @Basic
    @Column(name = "ID_ROL")
    private int idRol;
    @Basic
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Basic
    @Column(name = "ID_ENTIDAD")
    private int idEntidad;
    @Basic
    @Column(name = "ID_PROYECTO")
    private int idProyecto;
    @Basic
    @Column(name = "FECHAINICIO")
    private String fechainicio;
    @Basic
    @Column(name = "FECHAFIN")
    private String fechafin;

    public int getIdPartipicaciones() {
        return idPartipicaciones;
    }

    public void setIdPartipicaciones(int idPartipicaciones) {
        this.idPartipicaciones = idPartipicaciones;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Participaciones that = (Participaciones) o;

        if (idPartipicaciones != that.idPartipicaciones) return false;
        if (idRol != that.idRol) return false;
        if (idUsuario != that.idUsuario) return false;
        if (idEntidad != that.idEntidad) return false;
        if (idProyecto != that.idProyecto) return false;
        if (fechainicio != null ? !fechainicio.equals(that.fechainicio) : that.fechainicio != null) return false;
        if (fechafin != null ? !fechafin.equals(that.fechafin) : that.fechafin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPartipicaciones;
        result = 31 * result + idRol;
        result = 31 * result + idUsuario;
        result = 31 * result + idEntidad;
        result = 31 * result + idProyecto;
        result = 31 * result + (fechainicio != null ? fechainicio.hashCode() : 0);
        result = 31 * result + (fechafin != null ? fechafin.hashCode() : 0);
        return result;
    }
}
