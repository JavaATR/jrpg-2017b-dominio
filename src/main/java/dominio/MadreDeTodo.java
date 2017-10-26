package dominio;

import java.util.ArrayList;

/**
 * Clase abstracta que tiene como funcion la administración de los distintos
 * tipos de personajes. <br>
 */
public abstract class MadreDeTodo {
	/**
	 * Fuerza del personaje. <br>
	 */
	private int fuerza;
	/**
	 * Defensa del personaje. <br>
	 */
	private int defensa;
	/**
	 * Nivel del personaje. <br>
	 */
	private int nivel;
	/**
	 * Nombre del personaje. <br>
	 */
	private String nombre;
	/**
	 * Generador de números random. <br>
	 */
	private RandomGenerator random;
	/**
	 * Inventario del personaje. <br>
	 */
	private ArrayList<Item> items = new ArrayList<Item>();

	/**
	 * Crea un personaje. <br>
	 * @param fuerza
	 *            Fuerza del personaje. <br>
	 * @param defensa
	 *            Defensa del personaje. <br>
	 * @param nivel
	 *            Nivel del personaje. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 */
	public MadreDeTodo(final int fuerza, final int defensa, final int nivel, final String nombre) {
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.nivel = nivel;
		this.nombre = nombre;
		this.random = new MyRandom();
	}

	/**
	 * Devuelve la fuerza del personaje. <br>
	 * @return Fuerza del personaje. <br>
	 */
	public final int getFuerza() {
		return fuerza;
	}

	/**
	 * Devuelve la defensa del personaje. <br>
	 * @return Defensa del personaje. <br>
	 */
	public final int getDefensa() {
		return defensa;
	}

	/**
	 * Devuelve el nivel del personaje. <br>
	 * @return Nivel del personaje. <br>
	 */
	public final int getNivel() {
		return nivel;
	}

	/**
	 * Devuelve el nombre del personaje. <br>
	 * @return Nombre del personaje. <br>
	 */
	public final String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del personaje. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 */
	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Aumenta la fuerza del personaje. <br>
	 * @param aumento
	 *            Bonus de fuerza. <br>
	 */
	public final void aumentarFuerza(final int aumento) {
		this.fuerza += aumento;
	}

	/**
	 * Sube de nivel al personaje. <br>
	 */
	public final void aumentarNivel() {
		this.nivel++;
	}

	/**
	 * Devuelve el random del personaje. <br>
	 * @return Generador de números random. <br>
	 */
	public final RandomGenerator getRandom() {
		return this.random;
	}

	/**
	 * Establece el random del personaje. <br>
	 * @param random
	 *            Generador de números random. <br>
	 */
	public final void setRandom(final RandomGenerator random) {
		this.random = random;
	}

	/**
	 * Aumenta la defensa del personaje. <br>
	 * @param bonus
	 *            Bonus de defensa. <br>
	 */
	public final void aumentarDefensa(final int bonus) {
		this.defensa += bonus;
	}

	/**
	 * Reduce la defensa del personaje. <br>
	 * @param reduc
	 *            Penalización de defensa. <br>
	 */
	public final void reducirDefensa(final int reduc) {
		this.defensa -= reduc;
	}

	/**
	 * Añade un item al inventario del personaje. <br>
	 * @param item
	 *            Item a agregar. <br>
	 */
	public final void anadirItem(final Item item) {
		this.items.add(item);
	}

	/**
	 * Remueve un item del inventario del personaje. <br>
	 * @param item
	 *            Item a eliminar. <br>
	 */
	public final void removerItem(final Item item) {
		this.items.remove(item);
	}

	/**
	 * Devuelve el inventario del personaje. <br>
	 * @return Inventario del personaje. <br>
	 */
	public ArrayList<Item> getItems() {
		return this.items;
	}

	/**
	 * Establece la defensa. <br>
	 * @param defensa
	 *            Puntos de defensa. <br>
	 */
	public void setDefensa(final int defensa) {
		this.defensa = defensa;
	}

	/**
	 * Establece un item. <br>
	 * @param items
	 *            Items a establecer. <br>
	 */
	public void setItem(final ArrayList<Item> items) {
		this.items = items;
	}
}
