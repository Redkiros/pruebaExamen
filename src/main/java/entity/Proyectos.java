package entity;

import jakarta.persistence.*;

@Entity
public class Proyectos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PROYECTO")
    private int idProyecto;
    @Basic
    @Column(name = "TITULO")
    private String titulo;
    @Basic
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic
    @Column(name = "ID_TAGS")
    private int idTags;
    @Basic
    @Column(name = "ID_PROFESION")
    private int idProfesion;
    @Basic
    @Column(name = "VALORACION")
    private String valoracion;
    @Basic
    @Column(name = "ID_ESTADO")
    private int idEstado;
    @Basic
    @Column(name = "VISIBILIDAD")
    private String visibilidad;
    @Basic
    @Column(name = "FECHAINICIO")
    private String fechainicio;
    @Basic
    @Column(name = "FECHAFIN")
    private String fechafin;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTags() {
        return idTags;
    }

    public void setIdTags(int idTags) {
        this.idTags = idTags;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
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

        Proyectos proyectos = (Proyectos) o;

        if (idProyecto != proyectos.idProyecto) return false;
        if (idTags != proyectos.idTags) return false;
        if (idProfesion != proyectos.idProfesion) return false;
        if (idEstado != proyectos.idEstado) return false;
        if (titulo != null ? !titulo.equals(proyectos.titulo) : proyectos.titulo != null) return false;
        if (descripcion != null ? !descripcion.equals(proyectos.descripcion) : proyectos.descripcion != null)
            return false;
        if (valoracion != null ? !valoracion.equals(proyectos.valoracion) : proyectos.valoracion != null) return false;
        if (visibilidad != null ? !visibilidad.equals(proyectos.visibilidad) : proyectos.visibilidad != null)
            return false;
        if (fechainicio != null ? !fechainicio.equals(proyectos.fechainicio) : proyectos.fechainicio != null)
            return false;
        if (fechafin != null ? !fechafin.equals(proyectos.fechafin) : proyectos.fechafin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProyecto;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + idTags;
        result = 31 * result + idProfesion;
        result = 31 * result + (valoracion != null ? valoracion.hashCode() : 0);
        result = 31 * result + idEstado;
        result = 31 * result + (visibilidad != null ? visibilidad.hashCode() : 0);
        result = 31 * result + (fechainicio != null ? fechainicio.hashCode() : 0);
        result = 31 * result + (fechafin != null ? fechafin.hashCode() : 0);
        return result;
    }
}
