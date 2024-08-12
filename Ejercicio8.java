import java.util.ArrayList;
import java.util.List;

public class Ejercicio8{d
    public static void main(String[]args){
        List<Integer> Numeros;
        Numeros = new ArrayList<>();

        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);
        Numeros.add(6);
        Numeros.add(7);

        List<Integer> NumerosPar;
        NumerosPar = new ArrayList<>();

        NumerosPar.add(1);
        NumerosPar.add(2);
        NumerosPar.add(3);
        NumerosPar.add(4);
        NumerosPar.add(5);
        NumerosPar.add(6);
        NumerosPar.add(7);
        NumerosPar.add(8);

        List<Integer> MitadImpar = new ArrayList<>();
        List<Integer> MitadPar = new ArrayList<>();

        for (int i = 0; i <= Numeros.size(); i ++){
            if(i > Numeros.size() / 2){
                MitadImpar.add(i);
            }
        }
        for (int i = 0; i <= NumerosPar.size(); i ++){
            if(i > NumerosPar.size() / 2){
                MitadPar.add(i);
            }
        }
    System.out.println("Los numeros son con la lista impar son: " + MitadImpar);
    System.out.print("Los numeros son con la lista par son: " + MitadPar);
    }
}