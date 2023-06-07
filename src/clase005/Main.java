package src.clase005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables para todas las tareas
        Scanner cargarDatos = new Scanner(System.in);

        // 3) Calculadora de descuento:
        // ENUNCIADO: Pídele al usuario que ingrese el precio original de un producto.
        // Pídele al usuario que ingrese el porcentaje de descuento.
        // Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        // Muestra el precio final al usuario.
        System.out.println(""); // Salto de línea
        System.out.println("ACTIVIDAD 3: Programa para calcular el descuento y precio final a pagar.");
        System.out.println(""); // Salto de línea
        System.out.println("BIENVENIDO QUERIDO CLIENTE");
        System.out.print("Ayúdeme ingresando el valor del producto: ");
        // Crear variables para la actividad 3.
        Double valorDelProducto = cargarDatos.nextDouble(); // El cliente ingresa el valor del producto
        System.out.print("Ingrese el porcentaje de descuento del producto: ");
        Integer porcentajeDeDescuento = cargarDatos.nextInt(); // Ingreso del porcentaje de descuento
        Double valorAPagar = valorDelProducto - ((double) valorDelProducto * porcentajeDeDescuento / 100); // Puse double porque en entero da cero la división para 100
        System.out.println("");
        System.out.println("DETALLE DEL PAGO");
        System.out.println("Valor del producto: $" + valorDelProducto);
        System.out.println("Porcentaje de descuento: % " + porcentajeDeDescuento);
        System.out.println("Descuento: $" + (double) valorDelProducto * porcentajeDeDescuento / 100);
        System.out.println("Valor a pagar: $" + valorAPagar);


        // 4) Calculadora de propinas:
        // ENUNCIADO: Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        // Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        // Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina/ 100).
        System.out.println(""); // Salto de línea
        System.out.println("ACTIVIDAD 4: Programa para calcular la propina en función del porcentaje que el cliente desee.");
        System.out.println(""); // Salto de línea
        System.out.println("BIENVENIDO QUERIDO CLIENTE");
        System.out.print("Ayúdeme ingresando el valor total de su consumo: ");
        // Crear variables para la actividad 4.
        Double valorTotalDelConsumo = cargarDatos.nextDouble(); // El cliente ingresa el valor de su consumo
        System.out.print("Ahora ingrese el porcentaje de la propina que desee dejar: ");
        Integer porcentajeDeLaPropina = cargarDatos.nextInt(); // El cliente ingresa el porcentaje de la propina
        Double propina = valorTotalDelConsumo * ((double) porcentajeDeLaPropina / 100); // Puse double porque en entero da cero la división para 100
        System.out.println("");
        System.out.println("DETALLE DEL CONSUMO");
        System.out.println("Total del consumo: $" + valorTotalDelConsumo);
        System.out.println("Porcentaje de la propina: % " + porcentajeDeLaPropina);
        System.out.println("Valor de la propina: $" + propina);


        // 5) Juego de adivinar el número:
        // ENUNCIADO: Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ACTIVIDAD 5: Juego de adivinar el número.");
        System.out.println(""); // Salto de línea
        System.out.println("BIENVENIDOS AL JUEGO DE ADIVINA EL NÚMERO");
        System.out.println(""); // Salto de línea
        System.out.println("Tienes 3 intentos");
        System.out.println("Ingresa el número que creas que es el ganador.");
        System.out.print("Tu respuesta es: ");
        // Crear variables para la actividad 5.
        Integer numeroDelUsuario = cargarDatos.nextInt(); // El participante ingresa el número
        Integer numeroIncognito = (int) (Math.random() * 99) + 1; // 99 es el límite y se suma 1 para que no salga el cero
        System.out.println(""); // Salto de línea
        if(numeroDelUsuario == numeroIncognito){
            System.out.println("");
            System.out.println("FELICITACIONES: Ganaste el concurso.");
        } else{
            System.out.println("");
            System.out.println("QUE PENITA: Perdiste ja ja ja...");
            if (numeroDelUsuario  > numeroIncognito){
                System.out.println("Tu número es mayor al número ganador.");
            } else {
                System.out.println("Tu número es menor al número ganador.");
            }
            System.out.println("");
            System.out.println("No te rindas, hay más oportunidades para seguir participando y poder ganar.");
            System.out.println("");
            System.out.println("Tienes 2 intentos");
            System.out.println("Ingresa el número que creas que es el ganador.");
            System.out.print("Tu respuesta es: ");
            numeroDelUsuario = cargarDatos.nextInt(); // Segunda oportunidad para que el participante ingrese otro número
            if(numeroDelUsuario == numeroIncognito){
                System.out.println("");
                System.out.println("FELICITACIONES: Ganaste el concurso.");
            } else{
                System.out.println("");
                System.out.println("QUE PENITA: Perdiste ja ja ja...");
                if (numeroDelUsuario > numeroIncognito){
                    System.out.println("Tu número es mayor al número ganador.");
                } else {
                    System.out.println("Tu número es menor al número ganador.");
                }
                System.out.println("");
                System.out.println("No te rindas, hay más oportunidades para seguir participando y poder ganar.");
                System.out.println("");
                System.out.println("Tu puedes tienes la última oportunidad.");
                System.out.println("Ingresa el número que creas que es el ganador.");
                System.out.print("Tu respuesta es: ");
                numeroDelUsuario = cargarDatos.nextInt(); // Segunda oportunidad para que el participante ingrese otro número
                if(numeroDelUsuario == numeroIncognito){
                    System.out.println("");
                    System.out.println("FELICITACIONES: Ganaste el concurso.");
                } else{
                    System.out.println("");
                    System.out.println("QUE PENITA: Perdiste ja ja ja...");
                    System.out.println("Esto no es lo tuyo dedicate a otra cosa.");
                }
            }
        }
        System.out.println(""); // Salto de línea
        System.out.println("COMPARACIONES");
        System.out.println("El número que ingresaste es: " + numeroDelUsuario);
        System.out.println("El número ganador es: " + numeroIncognito);




    }
}