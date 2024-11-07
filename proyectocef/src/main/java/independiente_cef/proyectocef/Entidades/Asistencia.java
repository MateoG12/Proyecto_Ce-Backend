package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "asistencia", schema = "cefprueba1")
public class Asistencia {

    @Id
    @Column(name = "asistencia_id")
    private int asistenciaId;

    @Column(nullable = false)
    private boolean asistio;

    @Column(nullable = false)
    private int documento;

    @ManyToOne
    @JoinColumn(name = "torneo_torneo_id", nullable = false)
    private Torneo torneo;

    public Asistencia() {
    }

    public Asistencia(Torneo torneo, int asistenciaId, boolean asistio, int documento) {
        this.torneo = torneo;
        this.asistenciaId = asistenciaId;
        this.asistio = asistio;
        this.documento = documento;
    }

    public int getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(int asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "asistenciaId=" + asistenciaId +
                ", asistio=" + asistio +
                ", documento=" + documento +
                ", torneo=" + torneo +
                '}';
    }
}