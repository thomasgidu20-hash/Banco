
package modelo;

import java.time.LocalDate;

public class Cliente extends Persona{
    
    private String Tipo;
    
    public Cliente(){
        
    }

    public Cliente(String Tipo, String Documento, String Nombre, String correo, String Telefono, LocalDate fechaNacimiento, double Estatura) {
        super(Documento, Nombre, correo, Telefono, fechaNacimiento, Estatura);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
