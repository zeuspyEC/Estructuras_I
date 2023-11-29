package Colas;
import javax.swing.JOptionPane;

public class ColaSimple {
    private String cola[];
    private int frente = -1;
    private int FIN = -1;

    public ColaSimple(){
        super();
    }

    public ColaSimple(int dimension){
        this.cola = new String[dimension];
    }

    public String[] getCola() {
        return cola;
    }

    public void setCola(String[] cola) {
        this.cola = cola;
    }

    public void InsertarCola(String nombre) {
        if (this.cola.length == this.FIN + 1) {
            JOptionPane.showMessageDialog(null, 
            "Cola Simple llena\n Existe desbordamiento");
        } else {
            this.FIN = this.FIN + 1;
            this.cola[this.FIN] = nombre;
            if (this.FIN == 0) {
                this.frente = 0;
            }
        }
    }

    public void EliminarCola() {
        if (this.frente == (-1)) {
            JOptionPane.showMessageDialog(null, 
            "Cola vacia\n Se puede producir un subdesbordamiento");
        } else {
            if (this.frente == this.FIN) {
                this.cola[this.frente] = null;
                this.frente = -1;
                this.FIN = -1;
            } else {
                this.cola[this.frente] = null;
                this.frente = this.frente + 1;
            }
        }
    }

    public String toString() {
        String salida = "";
        for (int i = 0; i < cola.length; i++) {
            salida += this.cola[i] + "|";
        }
        return salida;
    }

}