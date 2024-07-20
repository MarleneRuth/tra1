import java.util.Scanner;
import java.time.Year;
public class cienaños{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

                    
System.out.print("Introduce tu nombre: ");
String nombre = scanner.nextLine();

                                            
System.out.print("Introduce tu edad: ");
int edad = scanner.nextInt();

                                                                    
int añosParaCien = 100 - edad;

                                                                        
int añoActual = java.time.Year.now().getValue();

int añoCienAños = añoActual + añosParaCien;

System.out.println(nombre + ", te faltan " + añosParaCien + " años para cumplir 100 años.");
 System.out.println("Cumplirás 100 años en el año " + añoCienAños + ".");

scanner.close();
}
 }
