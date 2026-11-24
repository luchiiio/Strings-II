
public class Main {
    public static void main(String[] args) {

        String cadena = "google.com";
        String caractersComptats = "";

        for (int i = 0; i < cadena.length(); i++) {

            char caracter = cadena.charAt(i);

            if (!caractersComptats.contains(String.valueOf(caracter))) {

                int comptador = 0;

                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == caracter) {
                        comptador++;
                    }
                }

                System.out.println(caracter + ": " + comptador);

                caractersComptats += caracter;
            }
        }
    }
}
