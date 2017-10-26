package dominio;

/**
 * Clase que administra la casta del guerrero. <br>
 */
@SuppressWarnings("serial")
public class Guerrero extends Casta {
	/**
	 * Energia mínima requerida para realizar una habilidad. <br>
	 */
	private static final int ENERGIAMINIMA = 10;
	/**
	 * Multiplicador de fuerza. <br>
	 */
	private static final int MULTIPLICADORFUERZA = 2;
	/**
	 * Bonus de fuerza . <br>
	 */
	private static final int BONUSFUERZA = 5;

	/**
	 * Crea un guerrero. <br>
	 * @param probCrit
	 *            Probabilidad de realizar un golpe crítico. <br>
	 * @param evasion
	 *            Probabilidad de evadir un ataque. <br>
	 * @param danioCrit
	 *            Multiplicador de daño crítico. <br>
	 */
	public Guerrero(final double probCrit, final double evasion, final double danioCrit) {
		super(probCrit, evasion, danioCrit);
	}

	/**
	 * Crea un guerrero con stats por defecto. <br>
	 */
	public Guerrero() {
		super();
	}

	/**
	 * Realiza la la habilidad de casta del guerrero, ataque doble.
	 * <p>
	 * El personaje realiza un ataque doble.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
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
			if (atacado.serAtacado(caster.getAtaque() * MULTIPLICADORFUERZA) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Realiza la la habilidad de casta del guerrero, aumentar defensa.
	 * <p>
	 * El personaje aumenta su defensa.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * @param caster
	 *            Personaje atacante. <br>
	 * @param atacado
	 *            NULL. <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidad2(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			caster.aumentarDefensa(caster.getMagia());
			return true;
		}
		return false;
	}

	/**
	 * Realiza la la habilidad de casta del guerrero, ignorar defensa.
	 * <p>
	 * El personaje ignora la defensa del atacado y lo ataca.
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
	public final boolean habilidad3(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (atacado instanceof Personaje) {
				int defensaOriginal = ((Personaje) atacado).getDefensa();
				((Personaje) atacado).reducirDefensa(((Personaje) atacado).getDefensa());
				if (atacado.serAtacado(caster.getAtaque()) > 0) {
					((Personaje) atacado).aumentarDefensa(defensaOriginal);
					return true;
				}
			}

		}
		return false;
	}

	/**
	 * Devuelve el bonus de fuerza del guerrero. <br>
	 * @return Bonus de fuerza. <br>
	 */
	@Override
	public final int recibirFuerzaBonus() {
		return BONUSFUERZA;

	}

	/**
	 * Devuelve el bonus de destreza del guerrero. <br>
	 * @return Bonus de destreza. <br>
	 */
	@Override
	public final int recibirDestrezaBonus() {
		return 0;
	}

	/**
	 * Devuelve el bonus de inteligencia del guerrero. <br>
	 * @return Bonus de inteligencia. <br>
	 */
	@Override
	public final int recibirInteligenciaBonus() {
		return 0;
	}

	/**
	 * Devuelve el nombre de la casta. <br>
	 * @return Nombre de la casta. <br>
	 */
	@Override
	public final String getNombreCasta() {
		return "Guerrero";
	}

	/**
	 * Devuelve las habilidades del guerrero. <br>
	 * @return Habilidades del guerrero. <br>
	 */
	@Override
	public final String[] getHabilidadesCasta() {
		return new String[] { "Ataque Doble", "Aumentar Defensa", "Ignorar Defensa" };
	}
}
