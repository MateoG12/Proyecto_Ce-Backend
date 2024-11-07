package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "implementos", schema = "cefprueba1")
public class Implementos {

    @Id
    @Column(name = "implementos")
    private int implementosId;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String nombre;

    public Implementos() {
    }

    public Implementos(String nombre, String descripcion, int cantidad, int implementosId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.implementosId = implementosId;
    }

    public int getImplementosId() {
        return implementosId;
    }

    public void setImplementosId(int implementosId) {
        this.implementosId = implementosId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Implementos{" +
                "implementosId=" + implementosId +
                ", cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}