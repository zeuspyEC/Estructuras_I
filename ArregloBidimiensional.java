public class ArregloBidimensional {
    public static void main(String[] args) {
        /**
         * Estructura bidimensional:
         * @parm y define el inicio de la secuencia numérica.
         * @parm suma imprime el valor de la suma de todos los dígitos.
         * @parm Matriz inmutable define una matriz 3x5
         */
        int y=1;
        int suma;
        int Matriz [][] = new int[3][5];
        /**
         * Se designa el primer ciclo for para las filas (3)
         * Se designa el segundo ciclo for para las columnas (5)
         */
        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                Matriz[i][j] = y;
                System.out.println(Matriz[i][j]);
                y++;
            }
        }
        /**
         * Se realiza la suma de las posiciones:
         * Primera posición: 1ra fila y 3ra columna.
         * Segunda posición: 2da fila y 1ra columna.
         * Tercera posición: 2da fila y 5ta columna.
         */
        suma = Matriz[0][2] + Matriz[1][0] + Matriz[1][4];
        System.out.println("Suma: " + suma);
    }
}
