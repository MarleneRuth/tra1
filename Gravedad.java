public class Gravedad {
    public static void main(String[] args) {
        double masa = 70.0; // Masa en kilogramos

        double pesoEnMercurio = Planeta.MERCURIO.calcularPeso(masa);
        double pesoEnVenus = Planeta.VENUS.calcularPeso(masa);
        double pesoEnLaTierra = Planeta.TIERRA.calcularPeso(masa);

       
        System.out.println("El peso en la Tierra para una masa de " + masa + " kg es " + pesoEnLaTierra + " N");
    }

    enum Planeta {
        MERCURIO(3.303e+23,2.4397e60),
        VENUS(4.869e+4, 6.0518e6),
        TIERRA(5.976e+24, 6.37814e6);

        private final double masa;
        private final double radio;
        Planeta(double masa, double radio){
            this.masa = masa;
        }