package dominio;

/**
 * Interfaz dedicada a la pelea entre personajes. <br>
 */
public interface Peleable {
	/**
	 * El personaje recibe un ataque. <br>
	 * @param dano
	 *            Daño bruto recibido. <br>
	 * @return Daño neto recibido. <br>
	 */
	int serAtacado(int dano);

	/**
	 * Devuelve la salud del personaje. <br>
	 * @return Salud del personaje. <br>
	 */
	int getSalud();

	/**
	 * Devuelve los puntos de magia del personaje. <br>
	 * @return Puntos de magia del personaje. <br>
	 */
	int getMagia();

	/**
	 * Realiza una acción post-turno. <br>
	 */
	void despuesDeTurno();

	/**
	 * Ataca a otro personaje. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return Daño que realiza al personaje. <br>
	 */
	int atacar(Peleable atacado);

	/**
	 * Otorga experiencia al personaje. <br>
	 * @return Experiencia recibida. <br>
	 */
	int otorgarExp();

	/**
	 * Devuelve los puntos de ataque del personaje. <br>
	 * @return Puntos de ataque del personaje. <br>
	 */
	int getAtaque();

	/**
	 * Establece los puntos de ataque de un personaje. <br>
	 * @param ataque
	 *            Puntos de ataque. <br>
	 */
	void setAtaque(int ataque);

	/**
	 * Indica si el personaje se encuentra vivo. <br>
	 * @return <b>true</b> si se encuentra vivo. <br>
	 *         <b>false</b> si se encuentra muerto. <br>
	 */
	boolean estaVivo();

	/**
	 * Devuelve el nombre del personaje. <br>
	 * @return Nombre del personaje. <br>
	 */
	String getNombre();
}
