package src.clase007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // 1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        int[] numeros = new int[5];


        for(int i = 0; i < 5; i++){
            System.out.print("Ingrese el dato # " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los numeros ingresados son: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Dato # " + i + ": " + numeros[i]);
        }
    }
}
