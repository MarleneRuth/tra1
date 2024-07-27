import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos nombres quieres ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        String[] nombres = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        Arrays.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.print("Introduce un nombre para buscar: ");
        String nombreABuscar = scanner.nextLine();
        if (buscarNombre(nombres, nombreABuscar)) {
            System.out.println("El nombre " + nombreABuscar + " está en la lista.");
        } else {
            System.out.println("El nombre " + nombreABuscar + " no está en la lista.");
        }

        System.out.print("Introduce un nombre para eliminar: ");
        String nombreAEliminar = scanner.nextLine();
        nombres = eliminarNombre(nombres, nombreAEliminar);

        System.out.println("Lista después de eliminar " + nombreAEliminar + ":");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        String nombreMasLargo = encontrarNombreMasLargo(nombres);
        System.out.println("El nombre más largo en la lista es: " + nombreMasLargo);

        scanner.close();
    }

    public static boolean buscarNombre(String[] nombres, String nombre) {
        for (String n : nombres) {
            if (n.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static String[] eliminarNombre(String[] nombres, String nombreAEliminar) {
        int index = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreAEliminar)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return nombres;  
        }

        String[] nuevosNombres = new String[nombres.length - 1];
        for (int i = 0, j = 0; i < nombres.length; i++) {
            if (i != index) {
                nuevosNombres[j++] = nombres[i];
            }
        }
        return nuevosNombres;
    }

    public static String encontrarNombreMasLargo(String[] nombres) {
        String nombreMasLargo = "";
        for (String nombre : nombres) {
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }
        return nombreMasLargo;
    }
}
