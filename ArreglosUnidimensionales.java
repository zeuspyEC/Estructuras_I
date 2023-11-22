import java.util.Scanner;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        /**
         * Inicializa el arreglo con el tamaño especificado por el usuario.
         *
         * @param tamañoArreglo Tamaño del arreglo.
         * @return Arreglo inicializado.
         */
        System.out.println("INGRESE EL TAMAÑO DEL ARREGLO: ");
        int tamañoArreglo;
        tamañoArreglo = x.nextInt();

        int [] arregloNumeros = new int [tamañoArreglo];

        for (int i=0; i<arregloNumeros.length; i++){
            System.out.print("INGRESE EL DATO A ALMACENAR EN LA POSICIÓN '" + (i+1) + "': ");
            arregloNumeros[i]=x.nextInt();
        }
        System.out.println();

        System.out.println("LOS DATOS DEL ARREGLO SON: ");
        for (int i=0; i<arregloNumeros.length; i++){
            System.out.print(arregloNumeros[i] +  " ");
        }
        System.out.println();

        System.out.println("\nINGRESE EL DATO A BUSCAR: ");
        int numeroABuscar = x.nextInt();
        boolean encontrado = false;

        for (int i=0; i<arregloNumeros.length; i++){
            if (arregloNumeros[i]==numeroABuscar){
                int posicionEnArreglo = arregloNumeros [i];
                System.out.println("El número: " + numeroABuscar + " se encuentra en la posición: " + posicionEnArreglo);
                encontrado = true;
                break;
            }
        }
        boolean falso=false;
        if (encontrado == falso){
            System.out.println("\nEl número: '" + numeroABuscar + "' no se encuentra dentro del arreglo");
        }
        System.out.println();
        System.out.println("INGRESE EL DATO A MODIFICAR: ");
        int numeroAModificar = x.nextInt();
        boolean modificado = false;

        for (int i=0; i<arregloNumeros.length; i++){
            if (arregloNumeros[i]==numeroAModificar){
                System.out.println("\nINGRESA EL NÚMERO PARA MODIFICAR AL NÚMERO: '" + numeroAModificar + "'");
                arregloNumeros[i]=x.nextInt();
                System.out.println("\nMODIFICADO EXISTOSO");
                break;
            }
        }
        if (modificado == false){
            System.out.println("\nEl número: " + numeroAModificar + " no se encuentra dentro del arreglo: ");
        }

        System.out.println("\nLOS DATOS DEL ARREGLO SON: ");
        for (int i=0; i<arregloNumeros.length; i++){
            System.out.print(arregloNumeros[i] + " ");
        }
        System.out.println();

        System.out.println("\nINGRESE EL DATO A ELIMINAR: ");
        int numeroAEliminar = x.nextInt();
        boolean eliminado = false;

        for (int i=0; i<arregloNumeros.length; i++){
            if (arregloNumeros[i]==numeroAEliminar){
                arregloNumeros[i]=0;
                eliminado=true;
                System.out.println("\nELIMINADO EXISTOSO");
                break;
            }
        }
        System.out.println("\nLOS DATOS DEL ARREGLO SON: ");
        for (int i=0; i<arregloNumeros.length; i++){
            System.out.print(arregloNumeros[i] + " ");
        }

        if (eliminado==false){
            System.out.println("\nEl número: " + numeroAEliminar + " no se encuentra dentro del arreglo: ");
        }
    }
}