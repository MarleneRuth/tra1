import java.util.ArrayList;
import java.util.List;

public class Semana {
    public static void main(String[] args) {
        String nombre = "Semana";
        int[] numeros = new int[5];
        MiClase objeto = new MiClase(); // Corrige el espacio en "MiClase"
        List<String> lista = new ArrayList<>();

        DiaSemana dia = DiaSemana.lunes;
        System.out.println(dia);
        
    }
    enum DiaSemana {lunes, martes, miercoles, jueves, viernes, sabado, domingo}

}

class MiClase {
    
}