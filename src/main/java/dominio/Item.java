package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

/**
 * Clase que administra los items del personaje. <br>
 */
public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ID del item. <br>
	 */
	private  int idItem;
	/**
	 * Foto del item. <br>
	 */
	private  String foto;
	/**
	 * Nombre del item. <br>
	 */
	private  String nombre;
	/**
	 * Ubicación en el cuerpo del item. <br>
	 */
	private  int wearLocation;
	/**
	 * Bonus de salud del item. <br>
	 */
	private  int bonusSalud;
	/**
	 * Bonus de energía del item. <br>
	 */
	private  int bonusEnergia;
	/**
	 * Bonus de fuerza del item. <br>
	 */
	private  int bonusFuerza;
	/**
	 * Bonus de destreza del item. <br>
	 */
	private  int bonusDestreza;
	/**
	 * Bonus de inteligencia del item. <br>
	 */
	private  int bonusInteligencia;
	/**
	 * Foto del item. <br>
	 */
	private  String fotoEquipado;

	/**
	 * Crea un item. <br>
	 * @param idItem
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
	public Item(final int idItem, final String name,
			final int wearLoc, final int saludBonus,
			final int energiaBonus, final int fuerzaBonus,
			final int destrezaBonus, final int inteligenciaBonus,
			final String picture, final String equipadoFoto)
					throws IOException {
		this.foto = picture;
		this.idItem = idItem;
		this.nombre = name;
		this.wearLocation = wearLoc;
		this.bonusSalud = saludBonus;
		this.bonusEnergia = energiaBonus;
		this.bonusFuerza = fuerzaBonus;
		this.bonusDestreza = destrezaBonus;
		this.bonusInteligencia = inteligenciaBonus;
		this.fotoEquipado = equipadoFoto;
	}
	
	public Item(){
		
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
	

	public int getWearLocation() {
		return wearLocation;
	}

	public String getFotoEquipado() {
		return fotoEquipado;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setWearLocation(int wearLocation) {
		this.wearLocation = wearLocation;
	}

	public void setBonusSalud(int bonusSalud) {
		this.bonusSalud = bonusSalud;
	}

	public void setBonusEnergia(int bonusEnergia) {
		this.bonusEnergia = bonusEnergia;
	}

	public void setBonusFuerza(int bonusFuerza) {
		this.bonusFuerza = bonusFuerza;
	}

	public void setBonusDestreza(int bonusDestreza) {
		this.bonusDestreza = bonusDestreza;
	}

	public void setBonusInteligencia(int bonusInteligencia) {
		this.bonusInteligencia = bonusInteligencia;
	}

	public void setFotoEquipado(String fotoEquipado) {
		this.fotoEquipado = fotoEquipado;
	}
}
