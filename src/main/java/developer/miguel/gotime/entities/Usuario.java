package developer.miguel.gotime.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('usuarios_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_persona", nullable = false, length = 50)
    private String nombrePersona;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "fecha_registro")
    private Instant fechaRegistro;

    @Column(name = "fecha_login")
    private Instant fechaLogin;

    @Column(name = "\"contraseña\"", nullable = false, length = Integer.MAX_VALUE)
    private String contraseña;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "creado_en")
    private Instant creadoEn;

    @OneToMany(mappedBy = "usuario")
    private Set<Recordatorio> recordatorios = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Instant getFechaLogin() {
        return fechaLogin;
    }

    public void setFechaLogin(Instant fechaLogin) {
        this.fechaLogin = fechaLogin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Instant getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Instant creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Set<Recordatorio> getRecordatorios() {
        return recordatorios;
    }

    public void setRecordatorios(Set<Recordatorio> recordatorios) {
        this.recordatorios = recordatorios;
    }

}