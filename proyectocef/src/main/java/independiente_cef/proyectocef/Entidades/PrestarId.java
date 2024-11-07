package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PrestarId implements Serializable {

    private int usuarioDocumento;          // Documento del usuario
    private int implementosInventarioId;   // ID del implemento

    // Constructor vacío (requerido por JPA)
    public PrestarId() {}

    // Constructor con parámetros
    public PrestarId(int usuarioDocumento, int implementosInventarioId) {
        this.usuarioDocumento = usuarioDocumento;
        this.implementosInventarioId = implementosInventarioId;
    }

    // Getters y setters
    public int getUsuarioDocumento() {
        return usuarioDocumento;
    }

    public void setUsuarioDocumento(int usuarioDocumento) {
        this.usuarioDocumento = usuarioDocumento;
    }

    public int getImplementosInventarioId() {
        return implementosInventarioId;
    }

    public void setImplementosInventarioId(int implementosInventarioId) {
        this.implementosInventarioId = implementosInventarioId;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestarId prestarId = (PrestarId) o;
        return usuarioDocumento == prestarId.usuarioDocumento &&
                implementosInventarioId == prestarId.implementosInventarioId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioDocumento, implementosInventarioId);
    }

    @Override
    public String toString() {
        return "PrestarId{" +
                "usuarioDocumento=" + usuarioDocumento +
                ", implementosInventarioId=" + implementosInventarioId +
                '}';
    }
}
