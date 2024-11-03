import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        int pares;
        int impares;
        int numero_entero;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba el numero entero: ");
        numero_entero=sc.nextInt();
        if(numero_entero % 2 == 0){
            System.out.println("El numero " + numero_entero + " es par");
        }else if(numero_entero % 2 == 1){
            System.out.print("El numero " + numero_entero + " es impar");
        }
    }
}
