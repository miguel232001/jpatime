package developer.miguel.gotime.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link developer.miguel.gotime.entities.Usuario}
 */
public class UsuarioDto implements Serializable {
    private final String nombrePersona;
    private final String email;
    private final String contraseña;

    public UsuarioDto(String nombrePersona, String email, String contraseña) {
        this.nombrePersona = nombrePersona;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDto entity = (UsuarioDto) o;
        return Objects.equals(this.nombrePersona, entity.nombrePersona) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.contraseña, entity.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombrePersona, email, contraseña);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nombrePersona = " + nombrePersona + ", " +
                "email = " + email + ", " +
                "contraseña = " + contraseña + ")";
    }
}