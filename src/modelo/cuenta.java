
package modelo;

public class cuenta {
    
    private int Numero;
    private String Tipo;
    private String Saldo;
    private String Clave;
    private Cliente Titular;
   public cuenta(Cliente Titular){
       
       

}

    public cuenta(int Numero, String Tipo, String Saldo, String Clave, Cliente Titular) {
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.Saldo = Saldo;
        this.Clave = Clave;
        this.Titular = Titular;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public Cliente getTitular() {
        return Titular;
    }

    public void setTitular(Cliente Titular) {
        this.Titular = Titular;
    }
 
   
}


