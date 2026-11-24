
public class Main {
    public static void main(String[] args) {

        String cadena = "w3resource";
        String resultat;

        if (cadena.length() < 2) {
            resultat = "";
        } else {
            String primers = cadena.substring(0, 2);
            String darrers = cadena.substring(cadena.length() - 2);

            resultat = primers + darrers;
        }

        System.out.println("Resultat: " + resultat);
    }
}
