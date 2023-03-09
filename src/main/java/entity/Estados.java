package entity;

import jakarta.persistence.*;

@Entity
public class Estados {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTADO")
    private int idEstado;
    @Basic
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estados estados = (Estados) o;

        if (idEstado != estados.idEstado) return false;
        if (descripcion != null ? !descripcion.equals(estados.descripcion) : estados.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstado;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
