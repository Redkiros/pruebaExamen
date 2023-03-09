package entity;

import jakarta.persistence.*;

@Entity
public class Entidades {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ENTIDAD")
    private int idEntidad;
    @Basic
    @Column(name = "CODIGO")
    private int codigo;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "WEB")
    private String web;
    @Basic
    @Column(name = "ID_PROFESION")
    private int idProfesion;
    @Basic
    @Column(name = "CONTACTO")
    private String contacto;

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entidades entidades = (Entidades) o;

        if (idEntidad != entidades.idEntidad) return false;
        if (codigo != entidades.codigo) return false;
        if (idProfesion != entidades.idProfesion) return false;
        if (nombre != null ? !nombre.equals(entidades.nombre) : entidades.nombre != null) return false;
        if (web != null ? !web.equals(entidades.web) : entidades.web != null) return false;
        if (contacto != null ? !contacto.equals(entidades.contacto) : entidades.contacto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEntidad;
        result = 31 * result + codigo;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + idProfesion;
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        return result;
    }
}
