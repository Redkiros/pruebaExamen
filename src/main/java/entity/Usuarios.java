package entity;

import jakarta.persistence.*;

@Entity
public class Usuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Basic
    @Column(name = "ID_ROL")
    private Integer idRol;
    @Basic
    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "ID_PROFESION")
    private int idProfesion;
    @Basic
    @Column(name = "CONTACTO")
    private String contacto;
    @Basic
    @Column(name = "PUNTUACION")
    private Integer puntuacion;
    @Basic
    @Column(name = "ID_ENTIDAD")
    private int idEntidad;
    @Basic
    @Column(name = "ID_ESTADO")
    private int idEstado;
    @Basic
    @Column(name = "ID_PROYECTO")
    private int idProyecto;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuarios usuarios = (Usuarios) o;

        if (idUsuario != usuarios.idUsuario) return false;
        if (idProfesion != usuarios.idProfesion) return false;
        if (idEntidad != usuarios.idEntidad) return false;
        if (idEstado != usuarios.idEstado) return false;
        if (idProyecto != usuarios.idProyecto) return false;
        if (idRol != null ? !idRol.equals(usuarios.idRol) : usuarios.idRol != null) return false;
        if (nombreUsuario != null ? !nombreUsuario.equals(usuarios.nombreUsuario) : usuarios.nombreUsuario != null)
            return false;
        if (nombre != null ? !nombre.equals(usuarios.nombre) : usuarios.nombre != null) return false;
        if (apellido != null ? !apellido.equals(usuarios.apellido) : usuarios.apellido != null) return false;
        if (password != null ? !password.equals(usuarios.password) : usuarios.password != null) return false;
        if (contacto != null ? !contacto.equals(usuarios.contacto) : usuarios.contacto != null) return false;
        if (puntuacion != null ? !puntuacion.equals(usuarios.puntuacion) : usuarios.puntuacion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (nombreUsuario != null ? nombreUsuario.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + idProfesion;
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        result = 31 * result + (puntuacion != null ? puntuacion.hashCode() : 0);
        result = 31 * result + idEntidad;
        result = 31 * result + idEstado;
        result = 31 * result + idProyecto;
        return result;
    }
}
