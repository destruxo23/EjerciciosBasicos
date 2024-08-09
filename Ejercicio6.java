import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        
        int pasos = 0;  // Variable para contar los pasos

        // Bucle para reducir el número a cero
        while (numero > 0) {
            if (numero % 2 == 0) {  // Si el número es par
                numero /= 2;  // Dividir el número por 2
            } else {  // Si el número es impar
                numero -= 1;  // Restar 1 al número
            }
            pasos = pasos + 1;  // Incrementar el contador de pasos
        }

        // Imprimir el número total de pasos
        System.out.println("Número de pasos para reducir a cero: " + pasos);
    }
}
