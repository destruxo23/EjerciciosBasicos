public class Ejercicio3{
    public static void main(String[]args){
        int[] arrayOriginal = {1,3,4,7,10,1};
        int[] arrayAcumulado = new int[arrayOriginal.length];

        arrayAcumulado[0] = arrayOriginal[0];

        for(int i = 1; i < arrayOriginal.length; i++){
            arrayAcumulado[i] = arrayAcumulado[i-1] + arrayOriginal[i];
        }

        System.out.print("Salida: [");
        for(int i = 0; i < arrayAcumulado.length; i++){
            System.out.print(arrayAcumulado[i]);
            if(i < arrayAcumulado.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}