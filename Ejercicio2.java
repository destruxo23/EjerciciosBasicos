//importamos la libreria para obtener datos
import java.util.Scanner;

public class Ejercicio2{
    public static void main(String args[]){
        //Declaramos variables
        int filas = 0, columnas = 0, contador = 1;
        Scanner entrada = new Scanner(System.in);
        //Pedimos info al usuario
        System.out.println("Cuantas filas deseas?");
        filas = entrada.nextInt(); //como es dato numerico lo ponemos en Int

        System.out.println("Cuantas columnas deseas?");
        columnas = entrada.nextInt(); //como es dato numerico lo ponemos en Int

        //Declaramos la matriz
        //El orden siempre es: filas y columnas
        //En este caso ya está definida filas y columnas asi que solo la invocamos
        int numeros[][] = new int [filas][columnas];

        //Comenzamos realizando el for anidado
        //El primer for sirve para verificar cuantas filas se realizarán
        for(int j = 0; j < filas; j++){
            //Este segundo for sirve para verificar cuantas columnas se realizarán
            for (int i = 0; i < columnas; i++){
                //se reemplaza la variable numeros con el valor del contador
                numeros [j][i] = contador;
                //Aumentamos el contador en 1
                contador++;
                //imprimimos el numero asignado a [j][i]
                System.out.print("[" + numeros [j][i] + "]");
            }
            //Si terminó de completar con la columna, pasa a imprimir un espacio
            System.out.println("");
        }
        //Y si aún no se completan las filas pedidas, se repite el proceso.
    }
}