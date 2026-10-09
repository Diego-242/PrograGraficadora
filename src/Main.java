import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InstrumentoGrafico lapiz = new Lapiz();
        InstrumentoGrafico borrador = new Borrador();

        System.out.println("=== Graficadora ===");
        int ancho = leerEntero(scanner, "Ancho del lienzo: ");
        int largo = leerEntero(scanner, "Largo del lienzo: ");
        Lienzo lienzo = new Lienzo(ancho, largo);

        lienzo.mostrarTerminal();

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero(scanner, "Opcion: ");

            switch (opcion) {
                case 1:
                    trazarLinea(scanner, lienzo, lapiz);
                    break;
                case 2:
                    trazarLinea(scanner, lienzo, borrador);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("--- MENU ---");
        System.out.println("1) Dibujar linea (lapiz)");
        System.out.println("2) Borrar linea (borrador)");
        System.out.println("3) Salir");
    }

    private static void trazarLinea(Scanner scanner, Lienzo lienzo, InstrumentoGrafico instrumento) {
        int x1 = leerEntero(scanner, "x1: ");
        int y1 = leerEntero(scanner, "y1: ");
        int x2 = leerEntero(scanner, "x2: ");
        int y2 = leerEntero(scanner, "y2: ");

        instrumento.aplicar(lienzo, x1, y1, x2, y2);
        lienzo.mostrarTerminal();
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Valor invalido. " + mensaje);
        }
        return scanner.nextInt();
    }
}
