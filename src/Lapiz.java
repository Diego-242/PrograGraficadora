public class Lapiz extends InstrumentoGrafico {

    @Override
    public void aplicar(Lienzo lienzo, int x1, int y1, int x2, int y2) {
        int pasos = Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));

        if (pasos == 0) {
            if (verificarLimites(lienzo, x1, y1)) {
                lienzo.modificarCelda(x1, y1, "*");
            }
            return;
        }

        for (int i = 0; i <= pasos; i++) {
            int x = x1 + Math.round(i * (x2 - x1) / (float) pasos);
            int y = y1 + Math.round(i * (y2 - y1) / (float) pasos);
            if (verificarLimites(lienzo, x, y)) {
                lienzo.modificarCelda(x, y, "*");
            }
        }
    }
}
