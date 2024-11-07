package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "encuentros", schema = "cefprueba1")
public class Encuentros {

    @Id
    @Column(name = "encuentro_id")
    private int encuentroId;

    @Column(nullable = false)
    private java.sql.Date fecha;

    @Column(nullable = false)
    private String hora;

    @Column(nullable = false)
    private String resultado;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String encuentroscol;

    @ManyToOne
    @JoinColumn(name = "equipo_equipoid", nullable = false)
    private Equipo equipo;

    public Encuentros() {
    }

    public Encuentros(int encuentroId, Date fecha, String hora, String resultado, String tipo, String ubicacion, String encuentroscol, Equipo equipo) {
        this.encuentroId = encuentroId;
        this.fecha = fecha;
        this.hora = hora;
        this.resultado = resultado;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.encuentroscol = encuentroscol;
        this.equipo = equipo;
    }

    public int getEncuentroId() {
        return encuentroId;
    }

    public void setEncuentroId(int encuentroId) {
        this.encuentroId = encuentroId;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getEncuentroscol() {
        return encuentroscol;
    }

    public void setEncuentroscol(String encuentroscol) {
        this.encuentroscol = encuentroscol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Encuentros{" +
                "encuentroId=" + encuentroId +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", resultado='" + resultado + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", encuentroscol='" + encuentroscol + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}