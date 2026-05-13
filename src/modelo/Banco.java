
package modelo;

import java.util.ArrayList;

public class Banco {
    
    private String Nombre;
    private int Nit;
    ArrayList<cuenta> lstCuentas;
    
    public Banco(){
        this.Nit = "123456789-01";
        this.
        this.lstCuentas = new ArrayList<>();

    }

    public Banco(String Nombre, int Nit) {
        this.Nombre = Nombre;
        this.Nit = Nit;
        lstCuentas = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public ArrayList<cuenta> getLstCuentas() {
        return lstCuentas;
    }

    public void setLstCuentas(ArrayList<cuenta> lstCuentas) {
        this.lstCuentas = lstCuentas;
    }
    
    
}
