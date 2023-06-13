package src.clase005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables para todas las tareas
        Scanner cargarDatos = new Scanner(System.in);

        // 1) Calculadora de edad de perros:
        // ENUNCIADO: Pídele al usuario que ingrese la edad de su perro.
        // Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ACTIVIDAD 1: Programa para calcular la edad de un perro en años humano.");
        System.out.println(""); // Salto de línea
        System.out.println("BIENVENIDO A LA CALCULADORA DE EDAD DE PERROS");
        System.out.print("Ingrese cuántos años de vida tiene el perro: ");
        // Crear variables para la actividad 1.
        Double aniosDelPerro = cargarDatos.nextDouble(); // Ingreso de años de vida del perro.
        Double edadDelPerro = aniosDelPerro * 7; // Conversión de años perros a años humanos.
        System.out.println("");
        System.out.println("DETALLE DE LA CONVERSIÓN DE AÑOS PERROS A AÑOS HUMANOS");
        System.out.println("Años de vida del perro: " + aniosDelPerro);
        System.out.println("Edad del perro en años humano: " + edadDelPerro);
        System.out.println("");
        System.out.println("Entonces el perro con " + aniosDelPerro + " años de vida equivale a " + edadDelPerro + " años humano.");


        // 2) Conversor de millas a kilómetros:
        // ENUNCIADO: Pídele al usuario que ingrese una distancia en millas.
        // Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        // Muestra la distancia en kilómetros al usuario.
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ACTIVIDAD 2: Programa para convertir las millas en kilómetros.");
        System.out.println(""); // Salto de línea
        System.out.println("BIENVENIDO AL CONVERSOR DE MILLAS A KILÓMETROS");
        System.out.print("Ingrese la cantidad de millas: ");
        // Crear variables para la actividad 2.
        Double millas = cargarDatos.nextDouble(); // Ingreso de la cantidad de millas
        Double km = millas * 1.60934; // Conversión de millas a kilómetros
        System.out.println("");
        System.out.println("DETALLE DE LA CONVERSIÓN");
        System.out.println("Millas: " + millas);
        System.out.println("Kilómetros: " + km);
        System.out.println("");
        System.out.println("Entonces " + millas + " millas equivale a " + km + " km");



        // 3) Calculadora de descuento:
        // ENUNCIADO: Pídele al usuario que ingrese el precio original de un producto.
        // Pídele al usuario que ingrese el porcentaje de descuento.
        // Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        // Muestra el precio final al usuario.
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
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
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
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
        // Integer numeroIncognito = (int) (Math.random() * 99) + 1; // 99 es el límite y se suma 1 para que no salga el cero

        Integer numeroIncognito = (int) Math.floor(Math.random() * 99) + 1; // Math.floor quita los decimales el más 1 es para que no salga cero
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