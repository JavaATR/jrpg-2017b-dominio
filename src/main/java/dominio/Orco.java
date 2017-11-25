package dominio;

/**
 * Clase que administra al personaje del orco. <br>
 */
@SuppressWarnings("serial")
public class Orco extends Personaje {
    /**
     * Energia minima que se necesita para realizar una habilidad. <br>
     */
    private static final int ENERGIAMINIMA = 10;
    /**
     * Bonus de salud. <br>
     */
    private static final int BONUSSALUD = 10;
    /**
     * Multiplicador de defensa. <br>
     */
    private static final int MULTIPLICADORDEFENSA = 2;

    /**
     * Crea un orco. <br>
     *
     * @param nombre
     *            Nombre del personaje. <br>
     * @param casta
     *            Casta del personaje. <br>
     * @param id
     *            Id del personaje. <br>
     */
    public Orco(final String nombre, final Casta casta, final int id) {
        super(nombre, casta, id);
    }

    /**
     * Crea un orco. <br>
     *
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
    public Orco(final String nombre, final int salud, final int energia,
            final int fuerza, final int destreza, final int inteligencia,
            final Casta casta, final int experiencia, final int nivel,
            final int idPersonaje) {
        super(nombre, salud, energia, fuerza, destreza, inteligencia, casta,
                experiencia, nivel, idPersonaje);
    }

    /**
     * Realiza la habilidad de raza del orco, el golpe defensa.
     * <p>
     * El ataque consiste en un ataque que utiliza los puntos de defensa del
     * orco para atacar. <br>
     * <p>
     * Se debe tener el mínimo de energía necesario para poder realizar el
     * ataque. <br>
     *
     * @param atacado
     *            Personaje atacado. <br>
     * @return <b>true</b> si fue realizado con éxito.<br>
     *         <b>false</b> de lo contrario. <br>
     */
    @Override
    public final boolean habilidadRaza1(final Peleable atacado) {
        if (super.getEnergia() >= ENERGIAMINIMA) {
            super.reducirEnergia(ENERGIAMINIMA);
            if (atacado.serAtacado(
                    super.getDefensa() * MULTIPLICADORDEFENSA) > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Realiza la habilidad de raza del orco, el mordisco de vida.
     * <p>
     * El orco realiza un ataque que le restaura vida teniendo en cuenta la
     * fuerza del contrincante.
     * <p>
     * Se debe tener el mínimo de energía necesario para poder realizar el
     * ataque. <br>
     *
     * @param atacado
     *            Personaje atacado. <br>
     * @return <b>true</b> si fue realizado con éxito.<br>
     *         <b>false</b> de lo contrario. <br>
     */
    @Override
    public final boolean habilidadRaza2(final Peleable atacado) {
        if (super.getEnergia() >= ENERGIAMINIMA) {
            super.reducirEnergia(ENERGIAMINIMA);
            int danioCausado = atacado.serAtacado(this.getFuerza());
            if (danioCausado > 0) {
                this.serCurado(danioCausado);
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve las habilidades del orco. <br>
     *
     * @return Nombre de las habilidades del orco. <br>
     */
    @Override
    public final String[] getHabilidadesRaza() {
        return new String[] {"Golpe Defensa", "Mordisco de Vida"};
    }

    /**
     * Devuelve el bonus de salud del orco. <br>
     *
     * @return Bonus de salud. <br>
     */
    @Override
    public final int getSaludBonus() {
        return BONUSSALUD;
    }

    /**
     * Devuelve el bonus de energía del orco. <br>
     *
     * @return Bonus de energía. <br>
     */
    @Override
    public final int getEnergiaBonus() {
        return 0;
    }

    /**
     * Devuelve el nombre de la raza. <br>
     *
     * @return Nombre de la raza. <br>
     */
    @Override
    public final String getNombreRaza() {
        return "Orco";
    }
}
