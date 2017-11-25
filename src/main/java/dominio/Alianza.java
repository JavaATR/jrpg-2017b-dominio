package dominio;

import java.util.LinkedList;

/**
 * Clase que administra una alianza entre personajes. <br>
 */
public class Alianza {
    /**
     * Nombre que tendra la alianza. <br>
     */
    private final String nombre;
    /**
     * Lista la cual contendra todos los integrantes de la alianza. <br>
     */
    private LinkedList<Personaje> aliados;

    /**
     * Crea una alianza entre personajes. <br>
     *
     * @param nombre
     *            Nombre que se le dará a la alianza. <br>
     */
    public Alianza(final String nombre) {
        this.nombre = nombre;
        this.aliados = new LinkedList<Personaje>();
    }

    /**
     * Devuelve la lista de los personajes que conforman la alianza. <br>
     *
     * @return Lista de aliados. <br>
     */
    public final LinkedList<Personaje> getAliados() {
        return new LinkedList<Personaje>(aliados);
    }

    /**
     * Devuelve el nombre de la alianza. <br>
     *
     * @return Nombre de la alianza. <br>
     */
    public final String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Se encarga de eliminar un personaje de la alianza. <br>
     *
     * @param personaje
     *            Personaje a remover de la alianza. <br>
     */
    public final void eliminarPersonaje(final Personaje personaje) {
        aliados.remove(personaje);
    }

    /**
     * Agrega un personaje a la alianza. <br>
     *
     * @param personaje
     *            Personaje a agregar a la alianza. <br>
     */
    public final void anadirPersonaje(final Personaje personaje) {
        aliados.add(personaje);
    }
}
