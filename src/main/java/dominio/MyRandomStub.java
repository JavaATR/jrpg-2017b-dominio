package dominio;

/**
 * Clase con proposito de testing ya que se fijan sus valores.
 */
public class MyRandomStub extends RandomGenerator {
    /**
     * Valor que devolverá nextDouble().
     */
    private final double valDouble;
    /**
     * Valor que devolverá nextInt().
     */
    private final int valInt;

    /**
     * Constructor del MyRandomStub. <br>
     *
     * @param valDouble
     *            Valor random double del stub. <br>
     * @param valInt
     *            Valor random int del stub. <br>
     */
    public MyRandomStub(final double valDouble, final int valInt) {
        this.valDouble = valDouble;
        this.valInt = valInt;
    }

    /**
     * Devuelve un valor entero random del stub. <br>
     *
     * @param val
     *            Rango del random. <br>
     * @return Número entero random del stub. <br>
     */
    @Override
    public final int nextInt(final int val) {
        return this.valInt;
    }

    /**
     * Devuelve un valor double random del stub. <br>
     *
     * @return Número double random del stub. <br>
     */
    @Override
    public final double nextDouble() {
        return this.valDouble;
    }
}
