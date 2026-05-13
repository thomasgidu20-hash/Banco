
package modelo;

import java.time.LocalDate;

public class Empleado extends Persona {
   private String cargo;
    private String Salario;
    
    public Empleado(){
        
    }

    public Empleado(String cargo, String Salario, String Documento, String Nombre, String correo, String Telefono, LocalDate fechaNacimiento, double Estatura) {
        super(Documento, Nombre, correo, Telefono, fechaNacimiento, Estatura);
        this.cargo = cargo;
        this.Salario = Salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
}
