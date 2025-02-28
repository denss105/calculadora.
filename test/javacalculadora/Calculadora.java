/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculadora;
import java.util.*;

/**
 *
 * @author Denisse Joya
 */
public class Calculadora {
    float suma, resta, mult;
    String resultado; 

    public float suma(float a, float b) {
        suma = a + b;
        return suma;
    }

    public float resta(float a, float b) {
        resta = a - b;
        return resta;
    }

    public float Multiplicacion(float a, float b) {
        mult = a * b;
        return mult;
    }

    public void Division(float a, float b) {
        float div;
        if (a != 0) {
            div = a / b;
            System.out.println("La division es: " + div);

        } else {
            resultado = "Dato invalido A";
            System.out.println(resultado);
        }

    }

    public void Mood(float a, float b) {
        float mod;
        if (a != 0) {
            mod = a % b;
            System.out.println("El resultado final es: " + mod);
        } else {
            resultado = "Dato invalido A";
            System.out.println(resultado);

        }

    }

    public static void main(String[] args) {
        int op;
        float num1, num2;

        Scanner s = new Scanner(System.in);
        Calculadora cal = new Calculadora();

        do {
            System.out.println("---Calculadora---"
                    + "\n1.-SUMA,"
                    + "\n2.-RESTA."
                    + "\n3.-MULTIPLICACION"
                    + "\n4.-DIVSION"
                    + "\n5.-MOD"
                    + "\n0.-SALIR");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();

                    cal.suma(num1, num2);
                    System.out.println("la suma es " + cal.suma);
                    break;
                case 2:
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();

                    cal.resta(num1, num2);
                    System.out.println("la resta es " + cal.resta);

                    break;
                case 3:
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();

                    cal.Multiplicacion(num1, num2);
                    System.out.println("la multiplicacion es " + cal.mult);
                    break;
                case 4:
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();

                    cal.Division(num1, num2);

                    break;
                case 5:
                    System.out.println("ingrese el valor de a ");
                    num1 = s.nextFloat();
                    System.out.println("ingrese el valor de b ");
                    num2 = s.nextFloat();

                    cal.Mood(num1, num2);

                    break;
                default:
                    System.out.println("ADIOS HASTA LUEGO :D");
            }

        } while (op != 0);
    }
}