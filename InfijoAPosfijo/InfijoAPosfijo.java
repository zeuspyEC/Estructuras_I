public class InfijoAPosfijo {
    public static void main(String[] args) {
        String expresionInfijo = "2^(5-2)*2";
        char[] pila = new char[expresionInfijo.length()];
        int top = -1;
        StringBuilder expresionPosfijo = new StringBuilder();

        for (int i = 0; i < expresionInfijo.length(); i++) {
            char caracter = expresionInfijo.charAt(i);

            if (Character.isDigit(caracter)) {
                expresionPosfijo.append(caracter);
            } else {
                if (caracter == '(') {
                    pila[++top] = caracter;
                } else if (caracter == '^') {
                    while (top >= 0 && pila[top] != '(' && pila[top] != '+' &&
                            pila[top] != '-' && pila[top] != '*' && pila[top] != '/') {
                        expresionPosfijo.append(pila[top--]);
                    }
                    pila[++top] = caracter;
                } else if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/') {
                    while (top >= 0 && pila[top] != '(' && prioridad(caracter) <= prioridad(pila[top])) {
                        expresionPosfijo.append(pila[top--]);
                    }
                    pila[++top] = caracter;
                } else if (caracter == ')') {
                    while (top >= 0 && pila[top] != '(') {
                        expresionPosfijo.append(pila[top--]);
                    }
                    top--; // Eliminar '('
                }
            }
        }

        while (top >= 0) {
            expresionPosfijo.append(pila[top--]);
        }

        System.out.println("Expresión posfija: " + expresionPosfijo.toString());
    }

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
