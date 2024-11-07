package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "estadisticas", schema = "cefprueba1")
public class Estadisticas {

    @Id
    @Column(name = "id")
    private int id;

    @Column(nullable = false)
    private int goles;

    @Column(nullable = false)
    private int asistencias;

    @Column(nullable = false)
    private int tarjetasamarillas;

    @Column(nullable = false)
    private int tarjetasrojas;

    @Column(nullable = false)
    private int faltas;

    @Column(nullable = false)
    private int penales;

    @Column(nullable = false)
    private int tirolibres;

    @Column(nullable = false)
    private int corners;

    @ManyToOne
    @JoinColumn(name = "encuentros_encuentro_id", nullable = false)
    private Encuentros encuentro;

    public Estadisticas() {
    }

    public Estadisticas(int id, int goles, int asistencias, int tarjetasamarillas, int tarjetasrojas, int faltas, int penales, int tirolibres, int corners, Encuentros encuentro) {
        this.id = id;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetasamarillas = tarjetasamarillas;
        this.tarjetasrojas = tarjetasrojas;
        this.faltas = faltas;
        this.penales = penales;
        this.tirolibres = tirolibres;
        this.corners = corners;
        this.encuentro = encuentro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Encuentros getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentros encuentro) {
        this.encuentro = encuentro;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public int getTirolibres() {
        return tirolibres;
    }

    public void setTirolibres(int tirolibres) {
        this.tirolibres = tirolibres;
    }

    public int getPenales() {
        return penales;
    }

    public void setPenales(int penales) {
        this.penales = penales;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getTarjetasrojas() {
        return tarjetasrojas;
    }

    public void setTarjetasrojas(int tarjetasrojas) {
        this.tarjetasrojas = tarjetasrojas;
    }

    public int getTarjetasamarillas() {
        return tarjetasamarillas;
    }

    public void setTarjetasamarillas(int tarjetasamarillas) {
        this.tarjetasamarillas = tarjetasamarillas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "id=" + id +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", tarjetasamarillas=" + tarjetasamarillas +
                ", tarjetasrojas=" + tarjetasrojas +
                ", faltas=" + faltas +
                ", penales=" + penales +
                ", tirolibres=" + tirolibres +
                ", corners=" + corners +
                ", encuentro=" + encuentro +
                '}';
    }

}