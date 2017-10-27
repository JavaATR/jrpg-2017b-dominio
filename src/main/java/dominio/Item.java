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
	 * @param itemId
	 *            Id del item. <br>
	 * @param name
	 *            Nombre del item. <br>
	 * @param wearLoc
	 *            Ubicación del item en el personaje. <br>
	 * @param saludBonus
	 *            Bonus de salud del item. <br>
	 * @param energiaBonus
	 *            Bonus de energía del item. <br>
	 * @param fuerzaBonus
	 *            Bonus de fuerza del item. <br>
	 * @param destrezaBonus
	 *            Bonus de destreza del item. <br>
	 * @param inteligenciaBonus
	 *            Bonus de inteligencia del item. <br>
	 * @param picture
	 *            Dirección del archivo de la foto. <br>
	 * @param equipadoFoto
	 *            Dirección del archivo de la foto
	 *            cuando el item esta equipado.
	 *            <br>
	 * @throws IOException
	 *             La dirección de la foto del item es erronea. <br>
	 */
	public Item(final int itemId, final String name,
			final int wearLoc, final int saludBonus,
			final int energiaBonus, final int fuerzaBonus,
			final int destrezaBonus, final int inteligenciaBonus,
			final String picture, final String equipadoFoto)
					throws IOException {
		this.foto = picture;
		this.idItem = itemId;
		this.nombre = name;
		this.wearLocation = wearLoc;
		this.bonusSalud = saludBonus;
		this.bonusEnergia = energiaBonus;
		this.bonusFuerza = fuerzaBonus;
		this.bonusDestreza = destrezaBonus;
		this.bonusInteligencia = inteligenciaBonus;
		this.fotoEquipado = equipadoFoto;
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
