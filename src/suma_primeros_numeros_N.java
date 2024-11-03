import java.util.Scanner;

public class suma_primeros_numeros_N {
    public static void main(String[] args) {
        int numeros_naturales;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero natural: ");
        numeros_naturales = sc.nextInt();
        for (int i = 0; i <= numeros_naturales ; i++) {
            suma += i;
            System.out.print("La suma de los primeros numeros" + numeros_naturales + " es " + suma);

        }
    }
}
