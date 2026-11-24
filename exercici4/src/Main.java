
public class Main {
    public static void main(String[] args) {

        String cadena = "abc";

        if (cadena.length() < 3) {
            System.out.println(cadena);
        } else if (cadena.endsWith("ing")) {
            cadena = cadena + "ly";
            System.out.println(cadena);
        } else {
            cadena = cadena + "ing";
            System.out.println(cadena);
        }
    }
}
