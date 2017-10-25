package dominio;

import java.util.Random;

/**
 * Clase que genera números aleatoreos. <br>
 */
public class MyRandom extends RandomGenerator {
	/**
	 * Genera un número double al azar. <br>
	 * 
	 * @return Número double random. <br>
	 */
	@Override
	public final double nextDouble() {
		return new Random().nextDouble();
	}

	/**
	 * Genera un número entero al azar según el límite indicado. <br>
	 * 
	 * @param val
	 *            Valor límite. <br>
	 * @return Número entero random. <br>
	 */
	@Override
	public final int nextInt(final int val) {
		return new Random().nextInt(val);
	}
}
