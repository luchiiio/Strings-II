
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix una cadena de text:");
        String cadena = teclat.nextLine();

        int longitud = cadena.length();

        System.out.println("La longitud de la cadena es: " + longitud);

        teclat.close();
    }
}
