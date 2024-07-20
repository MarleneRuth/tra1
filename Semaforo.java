public class Semaforo {
    public static void main(String[] args) {
        ColorSemaforo estado = ColorSemaforo.AMARILLO;
        switch (estado) {
            case VERDE:
                System.out.println("Puedes avanzar");
                break;
            case AMARILLO:
                System.out.println("Empieza a detenerte");
                break;
            case ROJO:
                System.out.println("Detente");
                break;
            
            }
        }
    }

    enum ColorSemaforo {
        ROJO, AMARILLO, VERDE
    }
