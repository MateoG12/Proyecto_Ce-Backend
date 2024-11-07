package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "pagos", schema = "cefprueba1")
public class Pagos {

    @Id
    @Column(name = "pagos_id")
    private int pagosId;

    @Column(nullable = false)
    private java.sql.Date fecha;

    @Column(nullable = false)
    private int monto;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "inscripcion_documento", nullable = false)
    private Inscripcion inscripcion;

    public Pagos() {
    }

    public Pagos(int pagosId, Inscripcion inscripcion, String tipo, String descripcion, String categoria, int monto, Date fecha) {
        this.pagosId = pagosId;
        this.inscripcion = inscripcion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pagos{" +
                "pagosId=" + pagosId +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", inscripcion=" + inscripcion +
                '}';
    }

}