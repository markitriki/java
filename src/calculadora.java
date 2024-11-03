import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double resultado=0;
       String operacion;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numero1=sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        numero2=sc.nextDouble();
        System.out.print("Ingrese la operacion: ");
        operacion=sc.next();
        if (operacion.equals("+")){
            resultado=numero1+numero2;
        }else if (operacion.equals("-")){
            resultado=numero1-numero2;
        }else if (operacion.equals("*")){
            resultado=numero1*numero2;
        }else if (operacion.equals("/")){
            resultado=numero1/numero2;
        }
        System.out.print("El resultado es: "+ resultado);
    }
}
