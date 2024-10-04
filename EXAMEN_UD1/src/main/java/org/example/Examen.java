package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        int trim1 = 0;
        int trim2 = 0;
        int trim3 = 0;
        int media = 0;
        int res = 0;

        try {
            //Leemos el programa desde 0 para que no se rompa
            System.out.println("Introduce la nota del primer trimestre (0 - 10)");
            trim1 = entrada.nextInt();
            //prguntamos numero y cogemos la variable
            while (trim1 < 0) {
                System.out.println("Introduce la nota del primer trimestre (0 - 10)");
                trim1 = entrada.nextInt();
            }
            //si es menor que 0 seguimos preguntando hasta que sea mayor
            while (trim1 > 10) {
                System.out.println("Introduce la nota del primer trimestre (0 - 10)");
                trim1 = entrada.nextInt();
            }
            //si es mayor que 10 seguimos preguntando hasta que sea mayor
            System.out.println("Introduce la nota del segundo trimestre (0 - 10)");
            trim2 = entrada.nextInt();
            //prguntamos numero y cogemos la variable
            while (trim2 < 0) {
                System.out.println("Introduce la nota del segundo trimestre (0 - 10)");
                trim2 = entrada.nextInt();
            }
            //si es menor que 0 seguimos preguntando hasta que sea mayor
            while (trim2 > 10) {
                System.out.println("Introduce la nota del segundo trimestre (0 - 10)");
                trim2 = entrada.nextInt();
            }
            //si es mayor que 10 seguimos preguntando hasta que sea mayor
            System.out.println("Introduce la nota del tercer trimestre (0 - 10)");
            trim3 = entrada.nextInt();
            //prguntamos numero y cogemos la variable
            while (trim3 < 0) {
                System.out.println("Introduce la nota del tercer trimestre (0 - 10)");
                trim3 = entrada.nextInt();
            }
            //si es menor que 0 seguimos preguntando hasta que sea mayor
            while (trim3 > 10) {
                System.out.println("Introduce la nota del tercer trimestre (0 - 10)");
                trim3 = entrada.nextInt();
            }
            //si es mayor que 10 seguimos preguntando hasta que sea mayor
            media = (trim1 + trim2 + trim3);
            //sumamos las 3 notas
            res = (media / 3);
            //dividimos la suma entre 3
            System.out.println("La media final del curso es " + res);
            //mostramos el resultado
            if (res < 5) {
                System.out.println("SUSPENDIDO");
            }
            //si es menor que 5 ha suspendido
            else {
                System.out.println("APROBADO");
            }
            //si es mayor a 5 ha aprobado
        }catch (InputMismatchException er) {
            //Que le valor que introduzca sea un numero y no una letra
            System.out.println("ERROR. Introduce un valor válido");
            entrada.nextLine();
        }
    }

    public void ejercicio2() {

        int num = 0;
        //variable integra num a 0
        Scanner entrada = new Scanner(System.in);
        //creamos una variable llamada entrada con la función scanner para recoger la respuesta del usuario

        try {
            System.out.println("Dime un número");
            //preguntamos un numero dentro de try-catch para que no se rompa el programa si no introduce el caracter correcto
            num = entrada.nextInt();
            //cogemos el numero
        } catch (InputMismatchException er) {
            //Que le valor que introduzca sea un numero y no una letra
            System.out.println("ERROR. Introduce un valor válido");
            //codigo de error
            entrada.nextLine();
        }
        if (num < 0) {
        //Comprobamos que el num sea menor a 0
            num = (num * (-1));
        //Multiplicamos el numero por -1
            System.out.println("El valor absoluto es " + num);
        //Mostramos el resultado
        } else {
        //Si es mayor a 0 entramos al else
            System.out.println("El valor absoluto es " + num);
        //Mostramos l resultado
        }
    }
}