import java.util.Scanner;

public class Tabla1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            System.out.print("¿Qué tabla quieres ver? (1: Multiplicar, 2: Dividir, 3: Ambas): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tabla de multiplicar del " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + Math.abs(numero * i));
                    }
                    break;

                case 2:
                    System.out.println("Tabla de división del " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " ÷ " + i + " = " + Math.abs((double) numero / i));
                    }
                    break;

                case 3:
                    System.out.println("Tabla de multiplicar del " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + Math.abs(numero * i));
                    }
                    System.out.println("Tabla de división del " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " ÷ " + i + " = " + Math.abs((double) numero / i));
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.print("¿Quieres ver la tabla de otro número? (SI/NO): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("si"));

        scanner.close();
    }
}

