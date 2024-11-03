import java.util.Scanner;
public class conversion_temp {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        double celcius;
        System.out.println("Ingrese aqui el valor en grados celcius: ");
        celcius = entrada.nextDouble();
        double fahrenheit = celcius * 9 / 5 + 32;
        System.out.println("El valor del grado en fahrenheit es : " + fahrenheit);
    }
}

     /*   // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la temperatura en Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir la temperatura a Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Mostrar el resultado
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
    }
}*/