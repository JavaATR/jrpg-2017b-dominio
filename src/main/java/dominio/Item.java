package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

/**
 * Clase que administra los items del personaje. <br>
 */
@SuppressWarnings("serial")
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
	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
	private final String fotoEquipado;

	/**
	 * Crea un item. <br>
	 * @param idItem
	 *            Id del item. <br>
	 * @param nombre
	 *            Nombre del item. <br>
	 * @param wearLocation
	 *            Ubicación del item en el personaje. <br>
	 * @param bonusSalud
	 *            Bonus de salud del item. <br>
	 * @param bonusEnergia
	 *            Bonus de energía del item. <br>
	 * @param bonusFuerza
	 *            Bonus de fuerza del item. <br>
	 * @param bonusDestreza
	 *            Bonus de destreza del item. <br>
	 * @param bonusInteligencia
	 *            Bonus de inteligencia del item. <br>
	 * @param foto
	 *            Dirección del archivo de la foto. <br>
	 * @param fotoEquipado
	 *            Dirección del archivo de la foto cuando el item esta equipado.
	 *            <br>
	 * @throws IOException
	 *             La dirección de la foto del item es erronea. <br>
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
	 * Devuelve la imágen del item. <br>
	 * @return Imágen del item. <br>
	 * @throws IOException
	 *             El path de la imagen es errónea. <br>
	 */
	public BufferedImage getFoto() throws IOException {
		return ImageIO.read(new File("recursos//" + foto));
	}

	/**
	 * Devuelve el nombre del item. <br>
	 * @return Nombre del item. <br>
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el bonus de salud del item. <br>
	 * @return Bonus de salud. <br>
	 */
	public int getBonusSalud() {
		return bonusSalud;
	}

	/**
	 * Devuelve el bonus de energía del item. <br>
	 * @return Bonus de energía. <br>
	 */
	public int getBonusEnergia() {
		return bonusEnergia;
	}

	/**
	 * Devuelve el bonus de fuerza del item. <br>
	 * @return Bonus de fuerza. <br>
	 */
	public int getBonusFuerza() {
		return bonusFuerza;
	}

	/**
	 * Devuelve el bonus de destreza del item. <br>
	 * @return Bonus de destreza. <br>
	 */
	public int getBonusDestreza() {
		return bonusDestreza;
	}

	/**
	 * Devuelve el bonus de inteligencia del item. <br>
	 * @return Bonus de inteligencia. <br>
	 */
	public int getBonusInteligencia() {
		return bonusInteligencia;
	}

	/**
	 * Devuelve id del item. <br>
	 * @return Id del item. <br>
	 */
	public int getIdItem() {
		return idItem;
	}
}
