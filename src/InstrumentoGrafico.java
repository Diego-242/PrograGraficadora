public abstract class InstrumentoGrafico {

    public boolean verificarLimites(Lienzo lienzo, int x, int y) {
        return x >= 0 && x < lienzo.getAncho() && y >= 0 && y < lienzo.getLargo();
    }

    public abstract void aplicar(Lienzo lienzo, int x1, int y1, int x2, int y2);
}
