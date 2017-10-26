package dominio;

import java.io.Serializable;

/**
 * Clase abstracta de la cual heredarán las distintas castas.
 * <p>
 * Por defecto tiene parámetros relacionados a probabilidades de golpe crítico,
 * de evitar daño y de daño crítico ya asignados. <br>
 */
@SuppressWarnings("serial")
public abstract class Casta implements Serializable {
	/**
	 * Numero que indica probabilidad del personaje de realizar un golpe
	 * critico. <br>
	 */
	private double probabilidadGolpeCritico;
	/**
	 * Numero que indica probabilidad del personaje de evitar un ataque. <br>
	 */
	private double probabilidadEvitarDano;
	/**
	 * Numero por el cual sera multiplicado el ataque. <br>
	 */
	private double danoCritico;
	/**
	 * Probabilidad de evitar un golpe critico. <br>
	 */
	private static final double PROBEVITARGOLPC = 0.2;
	/**
	 * Probabilidad de evitar recibir daño. <br>
	 */
	private static final double PROBEVITARDANIO = 0.2;
	/**
	 * Numero por el cual sera multiplicado el ataque por defecto. <br>
	 */
	private static final double DANIOCRITICO = 1.5;

	/**
	 * Constructor de casta que asigna las probabilidades por defecto. <br>
	 */
	public Casta() {
		this.probabilidadGolpeCritico = PROBEVITARGOLPC;
		this.probabilidadEvitarDano = PROBEVITARDANIO;
		this.danoCritico = DANIOCRITICO;
	}

	/**
	 * Constructor de casta. <br>
	 * @param probCrit
	 *            Probabilidad de que el personaje realice un golpe crítico.
	 *            <br>
	 * @param evasion
	 *            Probabilidad de que el personaje evite un golpe crítico. <br>
	 * @param danioCrit
	 *            Valor por el cual será multiplicado el golpe básico. <br>
	 */
	public Casta(final double probCrit, final double evasion, final double danioCrit) {
		this.probabilidadGolpeCritico = probCrit;
		this.probabilidadEvitarDano = evasion;
		this.danoCritico = danioCrit;
	}

	/**
	 * Método abstracto para obtener la fuerza extra de la casta. <br>
	 * @return Fuerza extra de la casta. <br>
	 */
	public abstract int recibirFuerzaBonus();

	/**
	 * Método abstracto para obtener la destreza extra de la casta. <br>
	 * @return Destreza extra de la casta. <br>
	 */
	public abstract int recibirDestrezaBonus();

	/**
	 * Método abstracto para obtener la inteligencia extra de la casta. <br>
	 * @return Inteligencia extra de la casta. <br>
	 */
	public abstract int recibirInteligenciaBonus();

	/**
	 * Habilidad 1 empleada por la casta. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            Personaje que recibirá el ataque. <br>
	 * @return <b>true</b> si el ataque fue realizado exitosamente. <br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public abstract boolean habilidad1(Personaje caster, Peleable atacado);

	/**
	 * Habilidad 2 empleada por la casta. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            Personaje que recibirá el ataque. <br>
	 * @return <b>true</b> si el ataque fue realizado exitosamente.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public abstract boolean habilidad2(Personaje caster, Peleable atacado);

	/**
	 * Habilidad 3 empleada por la casta. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            Personaje que recibirá el ataque. <br>
	 * @return <b>true </b>si el ataque fue realizado exitosamente.<br>
	 *         <b>false </b> de lo contrario. <br>
	 */
	public abstract boolean habilidad3(Personaje caster, Peleable atacado);

	/**
	 * Devuelve el nombre de la casta. <br>
	 * @return Nombre de la casta. <br>
	 */
	public abstract String getNombreCasta();

	/**
	 * Devuelve las habilidades de la casta. <br>
	 * @return Nombres de las habilidades propias de la casta. <br>
	 */
	public abstract String[] getHabilidadesCasta();

	/**
	 * Devuelve la probabilidad de acertar un golpe crítico de la casta. <br>
	 * @return Probabilidad de critico propias de la casta. <br>
	 */
	public final double getProbabilidadGolpeCritico() {
		return probabilidadGolpeCritico;
	}

	/**
	 * Establece el valor del golpe crítico de la casta. <br>
	 * @param probabilidadGolpeCritico
	 *            Probabilidad del golpe crítico. <br>
	 */
	public final void setProbabilidadGolpeCritico(final double probabilidadGolpeCritico) {
		this.probabilidadGolpeCritico = probabilidadGolpeCritico;
	}

	/**
	 * Devuelve la probabilidad de evitar daño de la casta. <br>
	 * @return Probabilidad de evitar daño de la casta. <br>
	 */
	public final double getProbabilidadEvitarDano() {
		return probabilidadEvitarDano;
	}

	/**
	 * Establece la probabilidad de evitar daño de la casta. <br>
	 * @param probabilidadEvitarDanio
	 *            Probabilidad de evitar daño. <br>
	 */
	public final void setProbabilidadEvitarDano(final double probabilidadEvitarDanio) {
		this.probabilidadEvitarDano = probabilidadEvitarDanio;
	}

	/**
	 * Método que devuelve el danoCritico.
	 * @return danoCritico
	 */
	public final double getDanoCritico() {
		return danoCritico;
	}

	/**
	 * Método void que sobreescribe el atributo danoCritico. con el valor que se
	 * ingresa por parámetro.
	 * @param danioCritico
	 *            Valor que tendra danoCritico
	 */
	public final void setDanoCritico(final double danioCritico) {
		this.danoCritico = danioCritico;
	}

	/**
	 * Aumenta la probabilidad de evitar daño. <br>
	 * @param bonus
	 *            Aumento de probabilidad de evitar daño. <br>
	 */
	public final void aumentarEvitarDano(final double bonus) {
		this.probabilidadEvitarDano += bonus;
	}
}
