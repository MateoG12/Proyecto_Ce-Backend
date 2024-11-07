package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "torneo", schema = "cefprueba1")
public class Torneo {

    @Id
    @Column(name = "torneo_id")
    private int torneoId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "encuentros_encuentro_id", nullable = false)
    private Encuentros encuentros;

    public Torneo() {
    }

    public Torneo(int torneoId, String nombre, String ubicacion, Encuentros encuentros) {
        this.torneoId = torneoId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.encuentros = encuentros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTorneoId() {
        return torneoId;
    }

    public void setTorneoId(int torneoId) {
        this.torneoId = torneoId;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Encuentros getEncuentros() {
        return encuentros;
    }

    public void setEncuentros(Encuentros encuentros) {
        this.encuentros = encuentros;
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "torneoId=" + torneoId +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", encuentros=" + encuentros +
                '}';
    }
}