import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double radio;
        System.out.println("Introduzca el radio del circulo: ");
        radio= sc.nextDouble();
        double area= Math.PI * radio *radio;
        System.out.println("El area del circulo es: "+area);
    }
}
/*import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el radio del círculo
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * radio * radio;

        // Mostrar el resultado
        System.out.println("El área del círculo es: " + area);
    }
}*/
