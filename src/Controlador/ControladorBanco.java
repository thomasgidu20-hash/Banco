
package Controlador;

import java.time.LocalDate;
import modelo.*;

public class ControladorBanco {
    Banco banco;
    public ControladorBanco(){
       banco = new Banco();
       
    }
    /*
    * Nombre del metodo : CrearCliente
    * Parametros recibidos : Documento, nombre, correo , fecha nacimiento, estatura, tipo 
    * Tipo de retorno : cliente
    * Descripcion : Crear un nuevo cliente 
    */
    public Cliente CrearCliente (String Tipo, String Documento, String Nombre, String correo, String Telefono,  int diaNacimiento,int MesNacimiento,int AñoNacimiento, double Estatura ){
        
        Cliente cliente = null;
        
        try{
        
        LocalDate fechaNacimiento = LocalDate.of(diaNacimiento,MesNacimiento,AñoNacimiento);
        
        cliente = new Cliente(Tipo, Documento, Nombre, correo, Telefono, LocalDate.MIN, Estatura);
        return cliente;
        
        }catch (Exception ex){
            System.out.println("error a el crear cliente " + ex.getMessage());
            return null;
        }
    }
    
}
