package dominio;

/**
 * Clase que administra la casta del hechicero. <br>
 */
@SuppressWarnings("serial")
public class Hechicero extends Casta {
	/**
	 * Energia mínima para realizar una habilidad. <br>
	 */
	private static final int ENERGIAMINIMA = 10;
	/**
	 * Multiplicador de magia. <br>
	 */
	private static final double MULTIPLICADORMAGIA = 1.5;
	/**
	 * Divisor de magia. <br>
	 */
	private static final int DIVISORDEMAGIA = 2;
	/**
	 * Bonus de inteligencia. <br>
	 */
	private static final int BONUSINTELIGENCIA = 5;

	/**
	 * Crea un hechicero. <br>
	 * @param probCrit
	 *            Probabilidad de realizar un golpe crítico. <br>
	 * @param evasion
	 *            Probabilidad de evadir un ataque. <br>
	 * @param danioCrit
	 *            Multiplicador de daño crítico. <br>
	 */
	public Hechicero(final double probCrit, final double evasion,
			final double danioCrit) {
		super(probCrit, evasion, danioCrit);
	}

	/**
	 * Crea un hechicero con stats por defecto. <br>
	 */
	public Hechicero() {
		super();
	}

	/**
	 * Realiza la la habilidad de casta del hechicero, bola de fuego.
	 * <p>
	 * El personaje ataca con un ataque mágico de fuego.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidad1(final Personaje caster,
			final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (atacado.serAtacado((int) (caster
					.calcularPuntosDeMagia()
					* MULTIPLICADORMAGIA)) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Realiza la la habilidad de casta del hechicero, curar.
	 * <p>
	 * El personaje cura a un aliado.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param aliado
	 *            Aliada curado. <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidad2(final Personaje caster,
			final Peleable aliado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (aliado instanceof Personaje) {
				((Personaje) aliado)
				.serCurado(caster.calcularPuntosDeMagia());
				return true;
			}
		}
		return false;
	}

	/**
	 * Realiza la la habilidad de casta del hechicero,
	 *  robar energía y salud.
	 * <p>
	 * El personaje roba energía y salud del atacado.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidad3(final Personaje caster,
			final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (atacado instanceof Personaje) {
				int energiaRobada = ((Personaje) atacado)
						.serDesernegizado(caster
								.calcularPuntosDeMagia());
				int saludRobada = ((Personaje) atacado)
						.serRobadoSalud(caster
								.calcularPuntosDeMagia() / DIVISORDEMAGIA);
				caster.serEnergizado(energiaRobada);
				caster.serCurado(saludRobada);
				return true;
			}
		}
		return false;
	}

	/**
	 * Devuelve el bonus de inteligencia del hechicero. <br>
	 * @return Bonus de inteligencia. <br>
	 */
	@Override
	public final int recibirInteligenciaBonus() {
		return BONUSINTELIGENCIA;
	}

	/**
	 * Devuelve el bonus de destreza del hechicero. <br>
	 * @return Bonus de destreza. <br>
	 */
	@Override
	public final int recibirDestrezaBonus() {
		return 0;
	}

	/**
	 * Devuelve el bonus de fuerza del hechicero. <br>
	 * @return Bonus de fuerza. <br>
	 */
	@Override
	public final int recibirFuerzaBonus() {
		return 0;
	}

	/**
	 * Devuelve el nombre de la casta. <br>
	 * @return Nombre de la casta. <br>
	 */
	@Override
	public final String getNombreCasta() {
		return "Hechiero";
	}

	/**
	 * Devuelve las habilidades del hechicero. <br>
	 * @return Habilidades del hechicero. <br>
	 */
	@Override
	public final String[] getHabilidadesCasta() {
		return new String[] {"Bola de Fuego", "Curar Aliado",
				"Robar Energia y Salud"};
	}
}
