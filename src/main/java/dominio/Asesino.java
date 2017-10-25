package dominio;

/**
 * Clase que administra la casta del asesino. <br>
 */
@SuppressWarnings("serial")
public class Asesino extends Casta {
	/**
	 * Energia mínima necesaria para realizar una habilidad. <br>
	 */
	private static final int ENERGIAMINIMA = 10;
	/**
	 * Bonus de destreza. <br>
	 */
	private static final int BONUSDESTREZA = 5;
	/**
	 * Bonus para aumentar la probabilidad de evitar daño. <br>
	 */
	private static final double AUMENTARPROBEVITAR = 0.15;
	/**
	 * Probabilidad de evitar daño. <br>
	 */
	private static final double PROBEVITARDANIO = 0.5;
	/**
	 * Máxima probabilidad de evasión. <br>
	 */
	private static final double MAXIMAEVASION = 0.5;

	/**
	 * Crea un asesino. <br>
	 * 
	 * @param probCrit
	 *            Probabilidad de realizar un golpe crítico. <br>
	 * @param evasion
	 *            Probabilidad de evadir un ataque. <br>
	 * @param danioCrit
	 *            Multiplicador de daño crítico. <br>
	 */
	public Asesino(final double probCrit, final double evasion, final double danioCrit) {
		super(probCrit, evasion, danioCrit);
	}

	/**
	 * Crea un asesino con stats por defecto. <br>
	 */
	public Asesino() {
		super();
	}

	/**
	 * Realiza la habilidad de casta del asesino, golpe crítico.
	 * <p>
	 * El personaje realiza un ataque con golpe crítico.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * 
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            Personaje que recibe el ataque. <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidad1(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (atacado.serAtacado((int) (caster.getAtaque() * caster.getCasta().getDanoCritico())) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Realiza la la habilidad de casta del asesino, aumentar evasión.
	 * <p>
	 * El personaje aumenta su evasión.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * aumento. <br>
	 * 
	 * @param caster
	 *            Personaje que lanza la habilidad. <br>
	 * @param atacado
	 *            NULL. <br>
	 * @return <b>true</b> si fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidad2(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (super.getProbabilidadEvitarDaño() + AUMENTARPROBEVITAR < MAXIMAEVASION) {
				super.aumentarEvitarDano(AUMENTARPROBEVITAR);
			} else {
				super.setProbabilidadEvitarDano(PROBEVITARDANIO);
			}
			return true;
		}
		return false;
	}

	/**
	 * Habilidad no implementada. <br>
	 * 
	 * @param caster
	 *            Null. <br>
	 * @param atacado
	 *            Null. <br>
	 * @return <b>false</b>
	 */
	@Override
	public final boolean habilidad3(final Personaje caster, final Peleable atacado) {
		return false;
	}

	/**
	 * Devuelve el bonus de destreza del asesino. <br>
	 * 
	 * @return Bonus de destreza. <br>
	 */
	@Override
	public final int recibirDestrezaBonus() {
		return BONUSDESTREZA;
	}

	/**
	 * Devuelve el bonus de fuerza del asesino. <br>
	 * 
	 * @return Bonus de fuerza. <br>
	 */
	@Override
	public final int recibirFuerzaBonus() {
		return 0;
	}

	/**
	 * Devuelve el bonus de inteligencia del asesino. <br>
	 * 
	 * @return Bonus de inteligencia. <br>
	 */
	@Override
	public final int recibirInteligenciaBonus() {
		return 0;
	}

	/**
	 * Devuelve el nombre de la casta. <br>
	 * 
	 * @return Nombre de la casta. <br>
	 */
	@Override
	public final String getNombreCasta() {
		return "Asesino";
	}

	/**
	 * Devuelve las habilidades del asesino. <br>
	 * 
	 * @return Habilidades del asesino. <br>
	 */
	@Override
	public final String[] getHabilidadesCasta() {
		return new String[] { "Golpe Critico", "Aumentar Evasion", "Robar" };
	}
}
