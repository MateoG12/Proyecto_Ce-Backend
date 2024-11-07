package independiente_cef.proyectocef.Entidades;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "inscripcion", schema = "cefprueba1")
public class Inscripcion {

    @Id
    @Column(name = "documento")
    private int documento;

    @Column(nullable = false)
    private int edad;

    @Column(name = "fecha_nacimiento", nullable = false)
    private java.sql.Date fechaNacimiento;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String email;

    @Column(name = "email_acudiente", nullable = false)
    private String emailAcudiente;

    @Column(nullable = false)
    private String eps;

    @Column(nullable = false)
    private String foto;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "nombre_acudiente", nullable = false)
    private String nombreAcudiente;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String telefono;

    @Column(name = "telefono_acudiente", nullable = false)
    private String telefonoAcudiente;

    @Column(nullable = false)
    private String usuario;

    public Inscripcion() {
    }

    public Inscripcion(int documento, String usuario, String telefonoAcudiente, String telefono, String password, String nombreAcudiente, String nombre, String foto, String eps, String emailAcudiente, String email, String categoria, String apellidos, Date fechaNacimiento, int edad) {
        this.documento = documento;
        this.usuario = usuario;
        this.telefonoAcudiente = telefonoAcudiente;
        this.telefono = telefono;
        this.password = password;
        this.nombreAcudiente = nombreAcudiente;
        this.nombre = nombre;
        this.foto = foto;
        this.eps = eps;
        this.emailAcudiente = emailAcudiente;
        this.email = email;
        this.categoria = categoria;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(String telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getEmailAcudiente() {
        return emailAcudiente;
    }

    public void setEmailAcudiente(String emailAcudiente) {
        this.emailAcudiente = emailAcudiente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "documento=" + documento +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", apellidos='" + apellidos + '\'' +
                ", categoria='" + categoria + '\'' +
                ", email='" + email + '\'' +
                ", emailAcudiente='" + emailAcudiente + '\'' +
                ", eps='" + eps + '\'' +
                ", foto='" + foto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", password='" + password + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefonoAcudiente='" + telefonoAcudiente + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}