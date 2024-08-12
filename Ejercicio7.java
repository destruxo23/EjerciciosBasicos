import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Crear una lista enlazada de ejemplo: 1 -> 2 -> 3 -> 4 -> 5
        List<Integer> Numeros;

        Numeros = new ArrayList<>();
        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);
        Numeros.add(6);
        Numeros.add(7);
        Numeros.add(8);

        List<Integer> Par = new ArrayList<>();
        List<Integer> Impar = new ArrayList<>();

        for (int num : Numeros){
            if(num % 2 == 0){
                Par.add(num);
            }
            else{
                Impar.add(num);
            }
        }
    System.out.println("Numeros pares: " + Par);
    System.out.println("Numeros impares: " + Impar);
    }
}
