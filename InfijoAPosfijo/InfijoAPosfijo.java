public class InfijoAPosfijo {

    /**
     * Método principal que realiza la conversión de notación infija a posfija.
     */
    public static void main(String[] args) {

        // Expresión matemática en notación infija
        String expresionInfijo = "2^(5-2)*2";

        // Pila para almacenar operadores
        char[] pila = new char[expresionInfijo.length()];
        int top = -1; // Índice que señala el tope de la pila

        // StringBuilder para almacenar la expresión en notación posfija
        StringBuilder expresionPosfijo = new StringBuilder();

        // Recorre la expresión infija caracter por caracter
        for (int i = 0; i < expresionInfijo.length(); i++) {
            char caracter = expresionInfijo.charAt(i);

            // Si el caracter es un dígito, lo agrega directamente a la expresión posfija
            if (Character.isDigit(caracter)) {
                expresionPosfijo.append(caracter);
            } else { // Si es un operador o paréntesis
                if (caracter == '(') { // Si es un paréntesis de apertura, lo agrega a la pila
                    pila[++top] = caracter;
                } else if (caracter == '^') { // Si es el operador de exponenciación, analiza su precedencia
                    while (top >= 0 && pila[top] != '(' && pila[top] != '+' &&
                            pila[top] != '-' && pila[top] != '*' && pila[top] != '/') {
                        expresionPosfijo.append(pila[top--]);
                    }
                    pila[++top] = caracter; // Apilar el operador
                } else if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/') {
                    // Analiza la expresión posfija según la precedencia
                    while (top >= 0 && pila[top] != '(' && prioridad(caracter) <= prioridad(pila[top])) {
                        expresionPosfijo.append(pila[top--]);
                    }
                    pila[++top] = caracter; // Agrega el operador a la pila
                } else if (caracter == ')') { // Si es un paréntesis de cierre
                    // Desapila y agrega los operadores hasta encontrar el paréntesis de apertura correspondiente
                    while (top >= 0 && pila[top] != '(') {
                        expresionPosfijo.append(pila[top--]);
                    }
                    top--; // Elimina el paréntesis de apertura de la pila
                }
            }
        }

        // Agrega los operadores restantes de la pila a la expresión posfija
        while (top >= 0) {
            expresionPosfijo.append(pila[top--]);
        }

        // Imprime la expresión en notación posfija
        System.out.println("Expresión posfija: " + expresionPosfijo.toString());
    }

    /**
     * Método que devuelve la prioridad de un operador dado.
     *
     * @param operador Operador del cual se quiere obtener la prioridad.
     * @return La prioridad del operador: 3 para '^', 2 para '*' y '/', 1 para '+' y '-' y 0 para otros caracteres.
     */
    private static int prioridad(char operador) {
        switch (operador) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
}
