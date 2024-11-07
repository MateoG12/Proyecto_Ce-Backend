package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario", schema = "cefprueba1")
public class Usuario {

    @Id
    @Column(name = "documento")
    private int documento;

    @Column(name = "correo_electronico", nullable = false)
    private String correoElectronico;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String rol;

    @Column(nullable = false)
    private String foto;

    @ManyToOne
    @JoinColumn(name = "inscripcion_documento")
    private Inscripcion inscripcion;

    public Usuario() {
    }

    public Usuario(int documento, String foto, Inscripcion inscripcion, String rol, String telefono, String usuario, String password, String nombre, String correoElectronico) {
        this.documento = documento;
        this.foto = foto;
        this.inscripcion = inscripcion;
        this.rol = rol;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "documento=" + documento +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", usuario='" + usuario + '\'' +
                ", telefono='" + telefono + '\'' +
                ", rol='" + rol + '\'' +
                ", foto='" + foto + '\'' +
                ", inscripcion=" + inscripcion +
                '}';
    }
}
