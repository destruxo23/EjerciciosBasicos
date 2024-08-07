public class Ejercicio1{
    public static void main(String args[]){
        //Aqui definimos que serán dos filas y dos columnas
        int numeros[][] = new int [2][2];
        //Definimos los numeros con los que rellenaremos
        numeros[0][0] = 5;
        numeros[0][1] = 2;
        numeros[1][0] = 2;
        numeros[1][1] = 5;
        //Imprimimos
        System.out.print("[" + numeros [0][0] + "]");
        System.out.println("[" + numeros [0][1] + "]");
        System.out.print("[" + numeros [1][0] + "]");
        System.out.print("[" + numeros [1][1] + "]");
    }
 }