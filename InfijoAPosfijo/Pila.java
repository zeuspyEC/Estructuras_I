import javax.swing.JOptionPane;
public class Pila {
    int pila[], tope, max;
    public Pila(int max){
        this.tope = 0;
        this.max = max;
        this.pila = new int [this.max+1];
    }

    public int getTope(){
        return tope;
    }
    public boolean isPilaVacia(){
        return this.tope == 0;
    }
    public boolean isPilaLlena(){
        return this.max == this.tope;
    }

    public void vaciarPila(){
        if(this.isPilaVacia()){
            JOptionPane.showMessageDialog(null,  "La pila está vacía");
        }else{
            JOptionPane.showMessageDialog(null, "Se vació la pila");
        }
        this.tope=0;
    }

    public void insertarEnPila(){
        if(this.isPilaLlena()){
            JOptionPane.showMessageDialog(null, "La pila está llena");
        }
        while (!this.isPilaLlena()){
                int dato;
                dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato"));
                this.tope++;
                this.pila[this.tope] = dato;

                JOptionPane.showMessageDialog(null, "El dato "+dato+" Se insertó en la pila");
            }
        }


    public void eliminarDePila(){
        if(!this.isPilaVacia()){
            int dato = this.pila[this.tope];
            this.tope--;
            JOptionPane.showMessageDialog(null, "El dato "+dato+" se eliminó de la pila");
        }
    }

    public void mostrarPila(){
        if(this.isPilaVacia()){
            JOptionPane.showMessageDialog(null, "La pila no tiene datos a mostrar");
        }else{
            String mostrar = "";
            for (int i=1; i<= this.tope; i++){
                mostrar = mostrar + this.pila[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "El total de datos es: "+this.tope+
                    "\nLos datos de la pila son:\n"+mostrar);
        }
    }

    public static Pila P;

    public static void MenuPila(){
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Ingresar datos en la pila\n"+
                            "2. Eliminar datos en la pila\n"+
                            "3. Mostrar datos en la pila\n"+
                            "4. Vaciar datos en la pila\n"+
                            "5. Salir\n", "Menú Pila", JOptionPane.QUESTION_MESSAGE));
            switch (opcion){
                case 1: P.insertarEnPila(); break;
                case 2: P.eliminarDePila(); break;
                case 3: P.mostrarPila(); break;
                case 4: P.vaciarPila(); break;
                case 5: break;
                default: JOptionPane.showMessageDialog(null, "Ingresar una opción válida",
                        "Error de opción", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        int max;
        max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pila"));
        P = new Pila(max);
        MenuPila();
    }
}
