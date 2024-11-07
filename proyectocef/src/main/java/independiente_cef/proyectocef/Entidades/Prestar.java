package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prestar", schema = "cefprueba1")
public class Prestar {

    @EmbeddedId
    private PrestarId id;  // Usamos la clave compuesta embebida

    @Column(nullable = false)
    private int cantidad;

    @Column(name = "fechadepresta", nullable = false)
    private Date fechaDePresta;

    @Column(nullable = false)
    private String estado;

    // Constructor vacío
    public Prestar() {}

    // Constructor con parámetros
    public Prestar(PrestarId id, int cantidad, Date fechaDePresta, String estado) {
        this.id = id;
        this.cantidad = cantidad;
        this.fechaDePresta = fechaDePresta;
        this.estado = estado;
    }

    // Getters y setters
    public PrestarId getId() {
        return id;
    }

    public void setId(PrestarId id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaDePresta() {
        return fechaDePresta;
    }

    public void setFechaDePresta(Date fechaDePresta) {
        this.fechaDePresta = fechaDePresta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestar{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", fechaDePresta=" + fechaDePresta +
                ", estado='" + estado + '\'' +
                '}';
    }
}
