package dominio;

/**
 * Clase que administra el personaje del humano. <br>
 */
@SuppressWarnings("serial")
public class Humano extends Personaje {
	/**
	 * Energia minima que se necesita para realizar una habilidad. <br>
	 */
	private static final int ENERGIAMINIMA = 10;
	/**
	 * Divisor de salud. <br>
	 */
	private static final int DIVISORSALUD = 2;
	/**
	 * Divisor de energía. <<br>
	 */
	private static final int DIVISORENERGIA = 2;
	/**
	 * Bonus de energia. <br>
	 */
	private static final int BONUSENERGIA = 5;
	/**
	 * Bonus de salud. <br>
	 */
	private static final int BONUSSALUD = 5;

	/**
	 * Crea un elfo. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 * @param casta
	 *            Casta del personaje. <br>
	 * @param id
	 *            Id del personaje. <br>
	 */
	public Humano(final String nombre, final Casta casta, final int id) {
		super(nombre, casta, id);
	}

	/**
	 * Crea un humano. <br>
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
	public Humano(final String nombre, final int salud, final int energia,
			final int fuerza, final int destreza, final int inteligencia,
			final Casta casta, final int experiencia, final int nivel,
			final int idPersonaje) {
		super(nombre, salud, energia, fuerza, destreza, inteligencia,
				casta, experiencia, nivel, idPersonaje);
	}

	/**
	 * Realiza la habilidad de raza del humano, incentivar.
	 * <p>
	 * El personaje aumenta su ataque con respecto
	 * a su capacidad de magia. <br>
	 * <p>
	 * Se debe tener el mínimo de energía necesario
	 * para poder realizar el
	 * ataque. <br>
	 * @param atacado
	 *            Personaje buffeado. <br>
	 * @return <b>true</b> si fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidadRaza1(final Peleable atacado) {
		if (super.getEnergia() >= ENERGIAMINIMA) {
			super.reducirEnergia(ENERGIAMINIMA);
			atacado.setAtaque(atacado.getAtaque() + this.getMagia());
			return true;
		}
		return false;
	}

	/**
	 * Realiza la habilidad de raza del humano, el golpe fatal. <br>
	 * <p>
	 * El personaje realiza un ataque de menor costo
	 * de energía siempre y cuando
	 * el personaje atacado no muera.
	 * <p>
	 * Se debe tener el mínimo de energía necesario
	 * para poder realizar el
	 * ataque. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return <b>true</b> si fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final boolean habilidadRaza2(final Peleable atacado) {
		if (super.getEnergia() >= ENERGIAMINIMA) {			
			if (atacado.getModoDios())
				if (!super.getModoDios()) {
					super.reducirEnergia(this.getEnergia() / DIVISORENERGIA);
					return true;
				}
			
			if (atacado.serAtacado(atacado
					.getSalud() / DIVISORSALUD) > 0) {
				super.reducirEnergia(this
					.getEnergia() / DIVISORENERGIA);
				return true;
			}
		}
		super.reducirEnergia(ENERGIAMINIMA);
		return false;
	}

	/**
	 * Devuelve las habilidades del humano. <br>
	 * @return Nombre de las habilidades del humano. <br>
	 */
	@Override
	public final String[] getHabilidadesRaza() {
		return new String[] {"Incentivar", "Golpe Fatal"};
	}

	/**
	 * Devuelve el bonus de salud del elfo. <br>
	 * @return Bonus de salud. <br>
	 */
	@Override
	public final int getSaludBonus() {
		return BONUSSALUD;
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
		return "Humano";
	}
}
