package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

// TODO: Auto-generated Javadoc
/**
 * Clase que administra los items del personaje. <br>
 */
public class Item implements Serializable {
    /**
     * Serial versión. <br>
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID del item. <br>
     */
    private int idItem;
    /**
     * Foto del item. <br>
     */
    private String foto;
    /**
     * Nombre del item. <br>
     */
    private String nombre;
    /**
     * Bonus de salud del item. <br>
     */
    private int bonusSalud;
    /**
     * Bonus de energía del item. <br>
     */
    private int bonusEnergia;
    /**
     * Bonus de fuerza del item. <br>
     */
    private int bonusFuerza;
    /**
     * Bonus de destreza del item. <br>
     */
    private int bonusDestreza;
    /**
     * Bonus de inteligencia del item. <br>
     */
    private int bonusInteligencia;
    /**
     * Foto del item. <br>
     */
    private String fotoEquipado;

    /**
     * Crea un item. <br>
     *
     * @param idItem            Id del item. <br>
     * @param name            Nombre del item. <br>
     * @param saludBonus            Bonus de salud del item. <br>
     * @param energiaBonus            Bonus de energía del item. <br>
     * @param fuerzaBonus            Bonus de fuerza del item. <br>
     * @param destrezaBonus            Bonus de destreza del item. <br>
     * @param inteligenciaBonus            Bonus de inteligencia del item. <br>
     * @param picture            Dirección del archivo de la foto. <br>
     * @param equipadoFoto            Dirección del archivo de la foto cuando el item esta equipado.
     *            <br>
     * @throws IOException             La dirección de la foto del item es erronea. <br>
     */
    public Item(final int idItem, final String name, final int saludBonus,
            final int energiaBonus, final int fuerzaBonus,
            final int destrezaBonus, final int inteligenciaBonus,
            final String picture, final String equipadoFoto)
            throws IOException {
        this.foto = picture;
        this.idItem = idItem;
        this.nombre = name;
        this.bonusSalud = saludBonus;
        this.bonusEnergia = energiaBonus;
        this.bonusFuerza = fuerzaBonus;
        this.bonusDestreza = destrezaBonus;
        this.bonusInteligencia = inteligenciaBonus;
        this.fotoEquipado = equipadoFoto;
    }

    /**
     * Crea un item. <br>
     */
    public Item() {

    }

    /**
     * Devuelve la imágen del item. <br>
     *
     * @return Imágen del item. <br>
     * @throws IOException
     *             El path de la imagen es errónea. <br>
     */
    public BufferedImage getImagenItem() throws IOException {
        return ImageIO.read(new File("recursos//" + foto));
    }

    /**
     * Devuelve el path de la foto. <br>
     *
     * @return Path de la foto. <br>
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Devuelve el nombre del item. <br>
     *
     * @return Nombre del item. <br>
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el bonus de salud del item. <br>
     *
     * @return Bonus de salud. <br>
     */
    public int getBonusSalud() {
        return bonusSalud;
    }

    /**
     * Devuelve el bonus de energía del item. <br>
     *
     * @return Bonus de energía. <br>
     */
    public int getBonusEnergia() {
        return bonusEnergia;
    }

    /**
     * Devuelve el bonus de fuerza del item. <br>
     *
     * @return Bonus de fuerza. <br>
     */
    public int getBonusFuerza() {
        return bonusFuerza;
    }

    /**
     * Devuelve el bonus de destreza del item. <br>
     *
     * @return Bonus de destreza. <br>
     */
    public int getBonusDestreza() {
        return bonusDestreza;
    }

    /**
     * Devuelve el bonus de inteligencia del item. <br>
     *
     * @return Bonus de inteligencia. <br>
     */
    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    /**
     * Devuelve id del item. <br>
     *
     * @return Id del item. <br>
     */
    public int getIdItem() {
        return idItem;
    }

    /**
     * Gets the foto equipado.
     *
     * @return the foto equipado
     */
    public String getFotoEquipado() {
        return fotoEquipado;
    }

    /**
     * Sets the id item.
     *
     * @param itemId the new id item
     */
    public void setIdItem(int itemId) {
        this.idItem = itemId;
    }

    /**
     * Sets the foto.
     *
     * @param picture the new foto
     */
    public void setFoto(String picture) {
        this.foto = picture;
    }

    /**
     * Sets the nombre.
     *
     * @param name the new nombre
     */
    public void setNombre(String name) {
        this.nombre = name;
    }

    /**
     * Sets the bonus salud.
     *
     * @param saludBonus the new bonus salud
     */
    public void setBonusSalud(int saludBonus) {
        this.bonusSalud = saludBonus;
    }

    /**
     * Sets the bonus energia.
     *
     * @param energiaBonus the new bonus energia
     */
    public void setBonusEnergia(int energiaBonus) {
        this.bonusEnergia = energiaBonus;
    }

    /**
     * Sets the bonus fuerza.
     *
     * @param fuerzaBonus the new bonus fuerza
     */
    public void setBonusFuerza(int fuerzaBonus) {
        this.bonusFuerza = fuerzaBonus;
    }

    /**
     * Sets the bonus destreza.
     *
     * @param destrezaBonus the new bonus destreza
     */
    public void setBonusDestreza(int destrezaBonus) {
        this.bonusDestreza = destrezaBonus;
    }

    /**
     * Sets the bonus inteligencia.
     *
     * @param inteligenciaBonus the new bonus inteligencia
     */
    public void setBonusInteligencia(int inteligenciaBonus) {
        this.bonusInteligencia = inteligenciaBonus;
    }

    /**
     * Sets the foto equipado.
     *
     * @param equipadoFoto the new foto equipado
     */
    public void setFotoEquipado(String equipadoFoto) {
        this.fotoEquipado = equipadoFoto;
    }
}
