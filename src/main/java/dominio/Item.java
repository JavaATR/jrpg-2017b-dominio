package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

/**
 * Clase que representa los Items que posee el personaje.
 */
public class Item implements Serializable {
	/**
	 * ID del item. <br>
	 */
	private final int idItem;
	/**
	 * Foto del item. <br>
	 */
	private final String foto;
	/**
	 * Nombre del item. <br>
	 */
	private final String nombre;
	/**
	 * Ubicación en el cuerpo del item. <br>
	 */
	private final int wearLocation;
	/**
	 * Bonus de salud del item. <br>
	 */
	private final int bonusSalud;
	/**
	 * Bonus de energía del item. <br>
	 */
	private final int bonusEnergia;
	/**
	 * Bonus de fuerza del item. <br>
	 */
	private final int bonusFuerza;
	/**
	 * Bonus de destreza del item. <br>
	 */
	private final int bonusDestreza;
	/**
	 * Bonus de inteligencia del item. <br>
	 */
	private final int bonusInteligencia;
	/**
	 * Foto del item. <br>
	 */
	private final String fotoEquipado;

	/**
	 * Constructor del Item.
	 * 
	 * @param idItem
	 *            Entero que representa el id del item.
	 * @param nombre
	 *            String que representa el nombre del item.
	 * @param wearLocation
	 *            Entero que representa donde se usa el item.
	 * @param bonusSalud
	 *            Entero que representa el bonus de salud del item.
	 * @param bonusEnergia
	 *            Entero que representa el bonus de energia del item.
	 * @param bonusFuerza
	 *            Entero que representa el bonus de fuerza del item.
	 * @param bonusDestreza
	 *            Entero que representa el bonus de destreza del item.
	 * @param bonusInteligencia
	 *            Entero que representa el bonus de inteligencia del item.
	 * @param foto
	 *            String que representa el path de la foto del item.
	 * @param fotoEquipado
	 *            String que representa la foto cuando el item está equipado.
	 * @throws IOException
	 *             Cuando no se encuentra la foto del item.
	 */
	public Item(final int idItem, final String nombre, final int wearLocation, final int bonusSalud,
			final int bonusEnergia, final int bonusFuerza, final int bonusDestreza, final int bonusInteligencia,
			final String foto, final String fotoEquipado) throws IOException {
		this.foto = foto;
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
		this.bonusSalud = bonusSalud;
		this.bonusEnergia = bonusEnergia;
		this.bonusFuerza = bonusFuerza;
		this.bonusDestreza = bonusDestreza;
		this.bonusInteligencia = bonusInteligencia;
		this.fotoEquipado = fotoEquipado;
	}

	/**
	 * Método que retorna la foto del item.
	 * 
	 * @return retorna la foto del item.
	 * @throws IOException
	 *             Cuando no se encuentra la foto del item.
	 */
	public BufferedImage getFoto() throws IOException {
		return ImageIO.read(new File("recursos//" + foto));
	}

	/**
	 * Método que retorna el nombre del item.
	 * 
	 * @return Retorna el nombre del item.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que retorna el bonus de salud del item.
	 * 
	 * @return Retorna bonus de salud.
	 */
	public int getBonusSalud() {
		return bonusSalud;
	}

	/**
	 * Método que retorna el bonus de energia del item.
	 * 
	 * @return Retorna bonus de energia.
	 */
	public int getBonusEnergia() {
		return bonusEnergia;
	}

	/**
	 * Método que retorna el bonus de fuerza del item.
	 * 
	 * @return Retorna bonus de fuerza.
	 */
	public int getBonusFuerza() {
		return bonusFuerza;
	}

	/**
	 * Método que retorna el bonus de destreza del item.
	 * 
	 * @return Retorna bonus de destreza.
	 */
	public int getBonusDestreza() {
		return bonusDestreza;
	}

	/**
	 * Método que retorna el bonus de inteligencia del item.
	 * 
	 * @return Retorna bonus de inteligencia.
	 */
	public int getBonusInteligencia() {
		return bonusInteligencia;
	}

	/**
	 * Método que retorna el id del item.
	 * 
	 * @return Retorna el id del item.
	 */
	public int getIdItem() {
		return idItem;
	}
}
