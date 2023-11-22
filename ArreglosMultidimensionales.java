public class ArreglosMultidimensionales {
    public static void main(String[] args) {
        int suma = 0;
        int FLORICOLA[][][] = {{{1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4},
                         {1, 2, 3, 4},{1, 2, 3, 4},{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}},
                           {{3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6},
                        {3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}},
                           {{3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6},
                        {3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}},
                          {{3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6},
                        {3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}},
                          {{3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6},
                        {3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}},
                          {{3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6},
                        {3, 4, 5, 6},{3, 4, 5, 6},{3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}, {3, 4, 5, 6}}};
        for (int i=0; i<6; i++) {
            for (int j=0; j<12; j++) {
                System.out.print("TOTAL DEL MES [" + j + "] DEL TIPO DE FLOR [" + i + "] DEL PRIMER AÑO: " + FLORICOLA[i][j][0]);
            }
            System.out.println("");
        }
        System.out.println("");

    for (int i=0; i<6; i++){
        for(int j=0; i<12; j++){
            suma=suma + FLORICOLA[i][j][0];
        }
    }
    System.out.println("TOTAL DE LA PRODUCCIÓN DURANTE EL PRIMER AÑO: " + suma);
    System.out.println("");

    int suma1=0;
    for (int j=0; j<12; j++){
        suma1=suma1+FLORICOLA[3][j][3];
    }
    System.out.println("TOTAL DE LA PRODUCCIÓN DEL TERCER TIPO DE FLOR A LO LARGO DEL ÚLTIMO AÑO: " + suma1);
}
}

