import javax.swing.JOptionPane;

public class Pila {
    int pila[], tope, max; // Declaración de variables de la pila

    // Constructor de la clase Pila que recibe el tamaño máximo de la pila
    public Pila(int max) {
        this.tope = 0; // Inicializa el tope de la pila en 0
        this.max = max; // Asigna el tamaño máximo de la pila
        this.pila = new int[this.max + 1]; // Inicializa el array para almacenar los elementos de la pila
    }

    // Método para obtener el valor del tope de la pila
    public int getTope() {
        return tope;
    }

    // Método para verificar si la pila está vacía
    public boolean isPilaVacia() {
        return this.tope == 0;
    }

    // Método para verificar si la pila está llena
    public boolean isPilaLlena() {
        return this.max == this.tope;
    }

    // Método para vaciar la pila
    public void vaciarPila() {
        if (this.isPilaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila está vacía");
        } else {
            JOptionPane.showMessageDialog(null, "Se vació la pila");
        }
        this.tope = 0; // Reinicia el tope de la pila a 0
    }

    // Método para insertar elementos en la pila
    public void insertarEnPila() {
        if (this.isPilaLlena()) {
            JOptionPane.showMessageDialog(null, "La pila está llena");
        }
        while (!this.isPilaLlena()) {
            int dato;
            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato"));
            this.tope++; // Incrementa el tope de la pila
            this.pila[this.tope] = dato; // Inserta el dato en la posición del tope

            JOptionPane.showMessageDialog(null, "El dato " + dato + " se insertó en la pila");
        }
    }

    // Método para eliminar un elemento de la pila
    public void eliminarDePila() {
        if (!this.isPilaVacia()) {
            int dato = this.pila[this.tope]; // Obtiene el dato en el tope de la pila
            this.tope--; // Decrementa el tope de la pila
            JOptionPane.showMessageDialog(null, "El dato " + dato + " se eliminó de la pila");
        }
    }

    // Método para mostrar los elementos de la pila
    public void mostrarPila() {
        if (this.isPilaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila no tiene datos para mostrar");
        } else {
            String mostrar = "";
            for (int i = 1; i <= this.tope; i++) {
                mostrar = mostrar + this.pila[i] + "\n"; // Concatena los elementos de la pila para mostrarlos
            }
            JOptionPane.showMessageDialog(null, "El total de datos es: " + this.tope +
                    "\nLos datos de la pila son:\n" + mostrar); // Muestra los datos de la pila
        }
    }

    public static Pila P; // Instancia estática de la clase Pila

    // Método estático para mostrar el menú interactivo de la pila
    public static void MenuPila() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Ingresar datos en la pila\n" +
                            "2. Eliminar datos en la pila\n" +
                            "3. Mostrar datos en la pila\n" +
                            "4. Vaciar datos en la pila\n" +
                            "5. Salir\n", "Menú Pila", JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    P.insertarEnPila();
                    break;
                case 2:
                    P.eliminarDePila();
                    break;
                case 3:
                    P.mostrarPila();
                    break;
                case 4:
                    P.vaciarPila();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresar una opción válida",
                            "Error de opción", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (opcion != 5); // El bucle se ejecuta hasta que se seleccione la opción 5 (Salir)
    }

    // Punto de entrada del programa
    public static void main(String[] args) {
        int max;
        max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pila"));
        P = new Pila(max); // Crea una instancia de la pila con el tamaño especificado
        MenuPila(); // Inicia el menú de la pila
    }
}
