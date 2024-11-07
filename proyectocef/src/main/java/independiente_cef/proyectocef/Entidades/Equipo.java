package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "equipo", schema = "cefprueba1")
public class Equipo {

    @Id
    @Column(name = "equipoid")
    private int equipoid;

    @Column(name = "fechacreacion", nullable = false)
    private java.sql.Date fechaCreacion;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "usuario_documento", nullable = false)
    private Usuario usuario;

    public Equipo() {
    }

    public int getEquipoid() {
        return equipoid;
    }

    public void setEquipoid(int equipoid) {
        this.equipoid = equipoid;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "equipoid=" + equipoid +
                ", fechaCreacion=" + fechaCreacion +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}