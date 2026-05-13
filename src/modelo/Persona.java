
package modelo;

import java.time.LocalDate;

public class Persona {
    
    private String Documento;
    private String Nombre;
    private String correo;
    private String Telefono;
    LocalDate fechaNacimiento;
    private double Estatura;
    
    public Persona (){
        
    }

    public Persona(String Documento, String Nombre, String correo, String Telefono, LocalDate fechaNacimiento, double Estatura) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.correo = correo;
        this.Telefono = Telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.Estatura = Estatura;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }
    
}
