import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int numero = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        while (i <= numero){
            if (i%3 == 0 & i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            i += 1;
        }

    }
}