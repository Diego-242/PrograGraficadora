public class Lienzo {
    private int ancho;
    private int largo;
    private String[][] cuadricula;

    public Lienzo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
        cuadricula = new String[largo][ancho];

        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                cuadricula[i][j] = "[ ]";
            }
        }
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void modificarCelda(int x, int y, String caracter) {
        if (x < 0 || x >= ancho || y < 0 || y >= largo) {
            return;
        }
        if (caracter == null || caracter.length() != 1) {
            return;
        }
        cuadricula[y][x] = "[" + caracter + "]";
    }

    public void mostrarTerminal() {
        System.out.print("   ");
        for (int j = 0; j < ancho; j++) {
            System.out.print(String.format("%3d", j));
        }
        System.out.println();

        for (int i = 0; i < largo; i++) {
            System.out.print(String.format("%2d ", i));
            for (int j = 0; j < ancho; j++) {
                System.out.print(cuadricula[i][j]);
            }
            System.out.println();
        }
    }
}
