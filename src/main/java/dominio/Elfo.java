package dominio;

/**
 * Clase que administra el personaje del elfo. <br>
 */
@SuppressWarnings("serial")
public class Elfo extends Personaje {
	/**
	 * Energia mínima que se necesita para realizar una habilidad. <br>
	 */
	private static final int ENERGIAMINIMA = 10;
	/**
	 * Multiplicador de nivel. <br>
	 */
	private static final int MULTIPLICADORNIVEL = 10;
	/**
	 * Bonus de energía. <br>
	 */
	private static final int BONUSENERGIA = 10;

	/**
	 * Crea un elfo. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 * @param casta
	 *            Casta del personaje. <br>
	 * @param id
	 *            Id del personaje. <br>
	 */
	public Elfo(final String nombre, final Casta casta, final int id) {
		super(nombre, casta, id);
	}

	/**
	 * Crea un elfo. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 * @param salud
	 *            Salud del personaje. <br>
	 * @param energia
	 *            Energia del personaje. <br>
	 * @param fuerza
	 *            Fuerza del Personaje. <br>
	 * @param destreza
	 *            Destreza del personaje. <br>
	 * @param inteligencia
	 *            Inteligencia del personaje. <br>
	 * @param casta
	 *            Casta del personaje. <br>
	 * @param experiencia
	 *            Experiencia del personaje. <br>
	 * @param nivel
	 *            Nivel del personaje. <br>
	 * @param idPersonaje
	 *            Id del personaje. <br>
	 */
	public Elfo(final String nombre, final int salud, final int energia,
			final int fuerza,
			final int destreza, final int inteligencia,
				final Casta casta, final int experiencia,
					final int nivel,
					final int idPersonaje) {
		super(nombre, salud, energia, fuerza, destreza, inteligencia,
				casta, experiencia, nivel, idPersonaje);
	}

	/**
	 * Realiza la habilidad de raza del elfo, el golpe de nivel.
	 * <p>
	 * El ataque consiste en que realiza un ataque
	 * con una fuerza de 10 niveles adicionales.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return <b>true</b> si fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidadRaza1(final Peleable atacado) {
		if (super.getEnergia() >= ENERGIAMINIMA) {
			super.reducirEnergia(ENERGIAMINIMA);
			if (atacado.serAtacado(super.getFuerza()
					+ super.getNivel()
						* MULTIPLICADORNIVEL) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Realiza la habilidad de raza del elfo, el ataque de bosque.
	 * <p>
	 * Si el atacado poseé magia recibe el ataque.
	 * <p>
	 * Se debe tener el mínimo de energía necesario para poder realizar el
	 * ataque. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return <b>true</b> si fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidadRaza2(final Peleable atacado) {
		if (super.getEnergia() >= ENERGIAMINIMA) {
			super.reducirEnergia(ENERGIAMINIMA);
			if (atacado.serAtacado((super.getMagia())) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Devuelve las habilidades del elfo. <br>
	 * @return Nombre de las habilidades del elfo. <br>
	 */
	@Override
	public final String[] getHabilidadesRaza() {
		return new String[] {"Golpe Level", "Ataque Bosque"};
	}

	/**
	 * Devuelve el bonus de salud del elfo. <br>
	 * @return Bonus de salud. <br>
	 */
	@Override
	public final int getSaludBonus() {
		return 0;
	}

	/**
	 * Devuelve el bonus de energía del elfo. <br>
	 * @return Bonus de energía. <br>
	 */
	@Override
	public final int getEnergiaBonus() {
		return BONUSENERGIA;
	}

	/**
	 * Devuelve el nombre de la raza. <br>
	 * @return Nombre de la raza. <br>
	 */
	@Override
	public final String getNombreRaza() {
		return "Elfo";
	}
}
