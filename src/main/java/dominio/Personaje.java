package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;

/**
 * Clase Personaje. La cual sirve de base para la creacion de las distintas
 * Razas.
 */
public abstract class Personaje extends MadreDeTodo implements Peleable, Serializable {
	/**
	 * Salud del personaje. <br>
	 */
	private int salud;
	/**
	 * Energia del personaje. <br>
	 */
	private int energia;
	/**
	 * Cantidad de habilidades que posee el personaje dada su casta. <br>
	 */
	private static final int CANT_HABILIDADES_CASTA = 3;
	/**
	 * Cantidad de habilidades que posee el personaje dada su raza. <br>
	 */
	private static final int CANT_HABILIDADES_RAZA = 2;
	/**
	 * Cantidad de niveles. <br>
	 */
	private static final int CANTIDAD_NIVELES = 101;
	/**
	 * Constante que se suma al cargar la tabla de niveles. <br>
	 */
	private static final int CONSTANTE_NIVEL = 50;
	/**
	 * Fuerza inicial del personaje. <br>
	 */
	private static final int FUERZA_INICIAL = 10;
	/**
	 * Destreza inicial del personaje. <br>
	 */
	private static final int DESTREZA_INICIAL = 10;
	/**
	 * Inteligencia inicial del personaje. <br>
	 */
	private static final int INTELIGENCIA_INICIAL = 10;
	/**
	 * Defensa inicial del personaje. <br>
	 */
	private static final int DEFENSA_INICIAL = 0;
	/**
	 * Experiencia inicial del personaje. <br>
	 */
	private static final int EXPERIENCIA_INICIAL = 0;
	/**
	 * Nivel inicial del personaje. <br>
	 */
	private static final int NIVEL_INICIAL = 1;
	/**
	 * Salud tope inicial del personaje. <br>
	 */
	private static final int SALUD_TOPE_INICIAL = 100;
	/**
	 * Energia tope inicial del personaje. <br>
	 */
	private static final int ENERGIA_TOPE_INICIAL = 100;
	/**
	 * Fuerza máxima del personaje. <br>
	 */
	private static final int FUERZA_MAXIMA = 200;
	/**
	 * Defensa máxima del personaje. <br>
	 */
	private static final int DEFENSA_MAXIMA = 200;
	/**
	 * Inteligencia máxima del personaje. <br>
	 */
	private static final int INTELIGENCIA_MAXIMA = 200;
	/**
	 * Nivel máximo permitido. <br>
	 */
	private static final int NIVEL_MAXIMO = 100;
	/**
	 * Aumento de salud tope al subir de nivel. <br>
	 */
	private static final int SALUD_TOPE_SUBIRN = 25;
	/**
	 * Aumento de energia tope al subir de nivel. <br>
	 */
	private static final int ENERGIA_TOPE_SUBIRN = 20;
	/**
	 * Multiplicador de fuerza. <br>
	 */
	private static final double MULTIPLICADOR_FUERZA = 1.5;
	/**
	 * Multiplicador de magia. <br>
	 */
	private static final double MULTIPLICADOR_MAGIA = 1.5;
	/**
	 * Multiplicador de experiencia. <br>
	 */
	private static final int MULTIPLICADOR_EXP = 40;
	/**
	 * Energia mínima necesaria para poder realizar una habilidad. <br>
	 */
	private static final int ENERGIA_MINIMA = 10;
	/**
	 * Divisor de destreza. <br>
	 */
	private static final int DIVISOR_DE_DESTREZA = 1000;
	/**
	 * Posicion X inicial del personaje. <br>
	 */
	private static final int POS_X_I = 0;
	/**
	 * Posicion Y inicial del personaje. <br>
	 */
	private static final int POS_Y_I = 0;
	/**
	 * Puntos de ataque del personaje. <br>
	 */
	private int ataque;
	/**
	 * Puntos de magia del personaje. <br>
	 */
	private int magia;
	/**
	 * Nombre de la raza del personaje. <br>
	 */
	private String nombreRaza;
	/**
	 * Salud tope del personaje. <br>
	 */
	private int saludTope;
	/**
	 * Energia tope del personaje. <br>
	 */
	private int energiaTope;
	/**
	 * Putnos de destreza del personaje. <br>
	 */
	private int destreza;
	/**
	 * Puntos de inteligencia del personaje. <br>
	 */
	private int inteligencia;
	/**
	 * Casta del personaje. <br>
	 */
	private Casta casta;
	/**
	 * Posición X del personaje. <br>
	 */
	private int x;
	/**
	 * Posición Y del Personaje. <br>
	 */
	private int y;
	/**
	 * Experiencia del personaje. <br>
	 */
	private int experiencia;
	/**
	 * Identificador del personaje. <br>
	 */
	private int idPersonaje;
	/**
	 * Alianza del personaje. <br>
	 */
	private Alianza clan = null;
	/**
	 * Variable estatica que contiene los niveles de personaje. <br>
	 */
	private static int[] tablaDeNiveles;
	/**
	 * Habilidades obtenidas según la raza del personaje. <br>
	 */
	private String[] habilidadesRaza = new String[CANT_HABILIDADES_RAZA];
	/**
	 * Habilidades obtenidas según la casta del personaje. <br>
	 */
	private String[] habilidadesCasta = new String[CANT_HABILIDADES_CASTA];
	/**
	 * Nombre de la casta del personaje. <br>
	 */
	private String nombreCasta;

	/**
	 * Devuelve las habilidades de la casta del personaje. <br>
	 * @return Habilidades de la casta. <br>
	 */
	public final String[] getHabilidadesCasta() {
		return casta.getHabilidadesCasta();
	}

	/**
	 * Carga la tabla de niveles del personaje. <br>
	 */
	public static void cargarTablaNivel() {
		Personaje.setTablaDeNiveles(new int[CANTIDAD_NIVELES]);
		Personaje.getTablaDeNiveles()[0] = 0;
		Personaje.getTablaDeNiveles()[1] = 0;
		for (int i = 2; i < CANTIDAD_NIVELES; i++) {
			Personaje.getTablaDeNiveles()[i] = Personaje.getTablaDeNiveles()[i - 1] + CONSTANTE_NIVEL;
		}
	}

	/**
	 * Crea un personaje según su casta.
	 * <p>
	 * Carga un personaje con valores por default. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 * @param casta
	 *            Casta del personaje. <br>
	 * @param id
	 *            Id del personaje. <br>
	 */
	public Personaje(final String nombre, final Casta casta, final int id) {
		super(FUERZA_INICIAL, DEFENSA_INICIAL, NIVEL_INICIAL, nombre);
		this.casta = casta;
		this.idPersonaje = id;
		this.experiencia = EXPERIENCIA_INICIAL;
		this.inteligencia = INTELIGENCIA_INICIAL;
		this.destreza = DESTREZA_INICIAL;
		this.saludTope = SALUD_TOPE_INICIAL;
		this.energiaTope = ENERGIA_TOPE_INICIAL;
		aumentarEnergiaTope(getEnergiaBonus());
		aumentarSaludTope(getSaludBonus());
		aumentarDestreza(casta.recibirDestrezaBonus());
		aumentarFuerza(casta.recibirFuerzaBonus());
		aumentarInteligencia(casta.recibirInteligenciaBonus());
		this.nombreRaza = getNombreRaza();
		this.nombreCasta = casta.getNombreCasta();
		this.habilidadesRaza = getHabilidadesRaza();
		this.habilidadesCasta = casta.getHabilidadesCasta();
		this.x = POS_X_I;
		this.y = POS_Y_I;
		this.salud = saludTope;
		this.energia = energiaTope;
		this.ataque = this.calcularPuntosDeAtaque();
		this.magia = this.calcularPuntosDeMagia();
		this.aumentarDefensa(destreza);
	}

	/**
	 * Crea un personaje. <br>
	 * @param nombre
	 *            Nombre del personaje. <br>
	 * @param salud
	 *            Salud del personaje. <br>
	 * @param energia
	 *            Energia del personaje. <br>
	 * @param fuerza
	 *            Fuerza del personaje. <br>
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
	public Personaje(final String nombre, final int salud, final int energia, final int fuerza, final int destreza,
			final int inteligencia, final Casta casta, final int experiencia, final int nivel, final int idPersonaje) {
		super(fuerza, 0, nivel, nombre);
		this.salud = salud;
		this.energia = energia;
		this.destreza = destreza;
		this.aumentarDefensa(destreza);
		this.inteligencia = inteligencia;
		this.casta = casta;
		this.experiencia = experiencia;
		this.saludTope = this.salud;
		this.energiaTope = this.energia;
		this.idPersonaje = idPersonaje;
		this.ataque = this.calcularPuntosDeAtaque();
		this.magia = this.calcularPuntosDeMagia();
	}

	/**
	 * Devueve el ataque del personaje. <br>
	 * @return Ataque del personaje. <br>
	 */
	@Override
	public final int getAtaque() {
		return ataque;
	}

	/**
	 * Establece el ataque del personaje. <br>
	 * @param ataque
	 *            Puntos de ataque. <br>
	 */
	@Override
	public final void setAtaque(final int ataque) {
		this.ataque = ataque;
	}

	/**
	 *Devuelve la magia del personaje. <br>
	 * @return Magia del personaje. <br>
	 */
	@Override
	public final int getMagia() {
		return this.magia;
	}

	/**
	 * Establece la magia del personaje. <br>
	 * @param magia
	 *            Puntos de magia. <br>
	 */
	public final void setMagia(final int magia) {
		this.magia = magia;
	}

	/**
	 * Devuelve la alianza del personaje. <br>
	 *
	 * @return Alianza del personaje. <br>
	 */
	public final Alianza getClan() {
		return this.clan;
	}

	/**
	 * Establece la alianza del personaje. <br>
	 * @param clan
	 *            Nueva alianza. <br>
	 */
	public final void setClan(final Alianza clan) {
		this.clan = clan;
		clan.anadirPersonaje(this);
	}

	/**
	 * Devuelve la salud del personaje. <br>
	 *
	 * @return Salud del personaje. <br>
	 */
	@Override
	public final int getSalud() {
		return this.salud;
	}

	/**
	 * Devuelve la energía del personaje. <br>
	 *
	 * @return Energía del personaje. <br>
	 */
	public final int getEnergia() {
		return this.energia;
	}

	/**
	 * Devuelve la destreza del personaje. <br>
	 * @return Destreza del personaje. <br>
	 */
	public final int getDestreza() {
		return this.destreza;
	}

	/**
	 * Devuelve la inteligencia del personaje. <br>
	 * @return Inteligencia del personaje. <br>
	 */
	public final int getInteligencia() {
		return this.inteligencia;
	}

	/**
	 * Devuelve la casta del personaje. <br>
	 * @return Casta del personaje. <br>
	 */
	public final Casta getCasta() {
		return this.casta;
	}

	/**
	 * Devuelve la experiencia del personaje. <br>
	 * @return Experiencia del personaje. <br>
	 */
	public final int getExperiencia() {
		return this.experiencia;
	}

	/**
	 * Devuelve el id del personaje. <br>
	 * @return Id del personaje. <br>
	 */
	public final int getIdPersonaje() {
		return this.idPersonaje;
	}

	/**
	 * Devuelve la salud tope del personaje. <br>
	 * @return Salud tope del personaje. <br>
	 */
	public final int getSaludTope() {
		return this.saludTope;
	}

	/**
	 * Devuelve la energía tope del personaje. <br>
	 * @return Energia tope del personaje. <br>
	 */
	public final int getEnergiaTope() {
		return this.energiaTope;
	}

	/**
	 * El personaje ataca a otro personaje. <br>
	 * @param atacado
	 *            Personaje atacado. <br>
	 * @return <b>true</b> si el ataque fue realizado.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	@Override
	public final int atacar(final Peleable atacado) {
		if (this.salud == 0) {
			return 0;
		}
		if (atacado.getSalud() > 0) {
			if (this.getRandom().nextDouble() <= this.casta.getProbabilidadGolpeCritico()
					+ this.destreza / DIVISOR_DE_DESTREZA) {
				return atacado.serAtacado(this.golpeCritico());
			} else {
				return atacado.serAtacado(this.ataque);
			}
		}
		return 0;
	}

	/**
	 * El personaje realiza un ataque crítico. <br>
	 * @return Golpe crítico del personaje. <br>
	 */
	public final int golpeCritico() {
		return (int) (this.ataque * this.getCasta().getDanoCritico());
	}

	/**
	 * Realiza la acción después de turno. <br>
	 */
	@Override
	public void despuesDeTurno() {

	}

	/**
	 * Indica si el personaje tiene enrgía mínima disponible para realizar un ataque. <br>
	 * @return <b>true</b> si puede atacar.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public final boolean puedeAtacar() {
		return this.energia > ENERGIA_MINIMA;
	}

	/**
	 * Calcula los puntos de ataque del personaje. <br>
	 * @return Puntos de ataque del personaje. <br>
	 */
	public final int calcularPuntosDeAtaque() {
		return (int) (this.getFuerza() * MULTIPLICADOR_FUERZA);
	}

	/**
	 * Calcula los puntos de defensa del personaje. <br>
	 * @return Puntos de destreza del personaje. <br>
	 */
	public final int calcularPuntosDeDefensa() {
		return (this.getDestreza());
	}

	/**
	 * Calcula los puntos de magia del personaje. <br>
	 * @return Puntos de magia del personaje. <br>
	 */
	public final int calcularPuntosDeMagia() {
		return (int) (this.getInteligencia() * MULTIPLICADOR_MAGIA);
	}

	/**
	 * Reestablece la salud del personaje al máximo. <br>
	 */
	public final void restablecerSalud() {
		this.salud = this.saludTope;
	}

	/**
	 * Reestablece la energía del personaje al máximo. <br>
	 */
	public final void restablecerEnergia() {
		this.energia = this.energiaTope;
	}

	/**
	 * Modifica los atributos del personaje a nuevos valores. 
	 * <p>
	 * Si los puntos de stats del personaje no fueron modificados, los atributos permanecen igual. <br>
	 */
	public final void modificarAtributos() {
		/*
		 * Tener en cuenta para cuando implementemos asignarPuntosSkills
		 */
		this.ataque = this.calcularPuntosDeAtaque();
		this.aumentarDefensa(destreza);
		this.magia = this.calcularPuntosDeMagia();
	}

	/**
	 * Indica si el personaje se encuentra vivo. <br>
	 * @return <b>true</b> si se encuentra vivo.<br>
	 *         <b>false</b> si esta muerto. <br>
	 */
	@Override
	public final boolean estaVivo() {
		return this.salud > 0;
	}

	/**
	 * El personaje recibe daño. <br>
	 * @param danio
	 *            Daño bruto recibido. <br>
	 * @return Daño neto recibido. <br>
	 */
	@Override
	public final int serAtacado(int danio) {
		if (this.getRandom().nextDouble() >= this.getCasta().getProbabilidadEvitarDano()) {
			danio -= this.getDefensa();
			if (danio > 0) {
				if (salud <= danio) {
					danio = salud;
					salud = 0;
				} else {
					salud -= danio;
				}
				return danio;
			}
			return 0;
		}
		return 0;
	}

	/**
	 * Al personaje le roban salud. <br>
	 * @param danio
	 *            Daño bruto recibido. <br>
	 * @return Vida robada al personaje. <br>
	 */
	public final int serRobadoSalud(int danio) {
		danio -= this.getDefensa();
		if (danio <= 0) {
			return 0;
		}
		if ((salud - danio) >= 0) {
			salud -= danio;
		} else {
			danio = salud;
			salud = 0;
		}
		return danio;
	}

	/**
	 * Al personaje le quitan energía. <br>
	 * @param danio
	 *            Daño bruto recibido. <br>
	 * @return Energía robada. <br>
	 */
	public final int serDesernegizado(int danio) {
		danio -= this.getDefensa();
		if (danio <= 0) {
			return 0;
		}
		if ((energia - danio) >= 0) {
			energia -= danio;
		} else {
			danio = energia;
			energia = 0;
		}
		return danio;
	}

	/**
	 * Curan al personaje. <br>
	 * @param salud
	 *            Puntos de salud restaurado. <br>
	 */
	public final void serCurado(final int salud) {
		if ((this.salud + salud) <= this.saludTope) {
			this.salud += salud;
		} else {
			this.salud = this.saludTope;
		}
	}

	/**
	 * El personaje es energizado. <br>
	 * @param energia
	 *            Puntos de energía restaurado. <br>
	 */
	public final void serEnergizado(final int energia) {
		if ((this.energia + energia) <= this.energiaTope) {
			this.energia += energia;
		} else {
			this.energia = this.energiaTope;
		}
	}

	/**
	 * Crea una alianza. 
	 * <p>
	 * El personaje queda incluido autmáticamente en esta nueva alianza. <br>
	 * @param nombreAlianza
	 *            Nombre de la alianza. <br>
	 */
	public final void crearAlianza(final String nombreAlianza) {
		this.clan = new Alianza(nombreAlianza);
		this.clan.anadirPersonaje(this);
	}

	/**
	 * El personaje sale de la alianza a la que pertenece. 
	 * <p>
	 * Si el personaje no pertenece a una alianza no sucede nada. <br>
	 */
	public final void salirDeAlianza() {
		if (this.clan != null) {
			this.clan.eliminarPersonaje(this);
			this.clan = null;
		}
	}

	/**
	 * El personaje realiza una alianza con otro personaje. <br>
	 * @param nuevoAliado
	 *            Personaje que se añade al clan. <br>
	 * @return <b>true</b> si el personaje se une a la alianza.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public final boolean aliar(final Personaje nuevoAliado) {
		if (this.clan == null) {
			Alianza a = new Alianza("Alianza 1");
			this.clan = a;
			a.anadirPersonaje(this);
		}
		if (nuevoAliado.clan == null) {
			nuevoAliado.clan = this.clan;
			this.clan.anadirPersonaje(nuevoAliado);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Asigna puntos de skill al personaje y actualiza sus atributos. <br>
	 * @param fuerza
	 *            Puntos de fuerza. <br>
	 * @param destreza
	 *            Puntos de destreza. <br>
	 * @param inteligencia
	 *            Punto de inteligencia. <br>
	 */
	public final void AsignarPuntosSkills(final int fuerza, final int destreza, final int inteligencia) {
		if (this.getFuerza() + fuerza <= FUERZA_MAXIMA) {
			this.aumentarFuerza(fuerza);
		}
		if (this.destreza + destreza <= DEFENSA_MAXIMA) {
			this.destreza += destreza;
		}
		if (this.inteligencia + inteligencia <= INTELIGENCIA_MAXIMA) {
			this.inteligencia += inteligencia;
		}
		this.modificarAtributos();
	}

	/**
	 * Sube de nivel al personaje. 
	 * <p>
	 * Mientras no se haya llegado al máximo nivel, se reinicia la experiencia. <br> 
	 */
	public final void subirNivel() {
		int acumuladorExperiencia = 0;
		if (this.getNivel() == NIVEL_MAXIMO) {
			return;
		}
		while (this.getNivel() != NIVEL_MAXIMO
				&& (this.experiencia >= Personaje.getTablaDeNiveles()[this.getNivel() + 1] + acumuladorExperiencia)) {
			acumuladorExperiencia += Personaje.getTablaDeNiveles()[this.getNivel() + 1];
			this.aumentarNivel();
			this.modificarAtributos();
			this.saludTope += SALUD_TOPE_SUBIRN;
			this.energiaTope += ENERGIA_TOPE_SUBIRN;
		}
		this.experiencia -= acumuladorExperiencia;
	}

	/**
	 * El personaje recibe experiencia. <br>
	 * @param exp
	 *            Experiencia adquirida. <br>
	 * @return <b>true</b> si el personaje sube de nivel.<br>
	 *         <b>false</b> si el personaje mantiene el personaje. <br>
	 */
	public final boolean ganarExperiencia(final int exp) {
		this.experiencia += exp;
		if (experiencia >= Personaje.getTablaDeNiveles()[this.getNivel() + 1]) {
			subirNivel();
			return true;
		}
		return false;
	}

	/**
	 * Devuelve la experiencia que daría derrotar al personaje. <br>
	 * @return Experiencia que da al ser derrotado. <br>
	 */
	@Override
	public final int otorgarExp() {
		return this.getNivel() * MULTIPLICADOR_EXP;
	}

	/**
	 * Clona al personaje. <br>
	 * @throws CloneNotSupportedException
	 *             Excepción de clonación cuando no está implementada. <br>
	 * @return Personaje clonado. <br>
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * Devuelve la distancia de un personaje con respecto a otro. <br>
	 * @param personaje
	 *            Personaje. <br>
	 * @return La distancia entre los dos personajes. <br>
	 */
	public final double distanciaCon(final Personaje personaje) {
		return Math.sqrt(Math.pow(this.x - personaje.x, 2) + Math.pow(this.y - personaje.y, 2));
	}

	/**
	 * Realiza la habilidad 1 de la casta del personaje. <br>
	 * @param atacado
	 *            Personaje que recibe el ataque. <br>
	 *            <i><u>Nota</u>: Puede no ser requerido según la habilidad.</i> <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public final boolean habilidadCasta1(final Peleable atacado) {
		return this.getCasta().habilidad1(this, atacado);
	}

	/**
	 * Realiza la habilidad 2 de la casta del personaje. <br>
	 * @param atacado
	 *            Personaje que recibe el ataque. <br>
	 *            <i><u>Nota</u>: Puede no ser requerido según la habilidad.</i> <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public final boolean habilidadCasta2(final Peleable atacado) {
		return this.getCasta().habilidad2(this, atacado);
	}

	/**
	 * Realiza la habilidad 3 de la casta del personaje. <br>
	 * @param atacado
	 * 			  Personaje que recibe el ataque. <br>
	 *            <i><u>Nota</u>: Puede no ser requerido según la habilidad.</i> <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public final boolean habilidadCasta3(final Peleable atacado) {
		return this.getCasta().habilidad3(this, atacado);
	}

	/**
	 * Realiza la habilidad 1 de la raza del personaje. <br>
	 * @param atacado
	 *            Personaje que recibe el ataque. <br>
	 *            <i><u>Nota</u>: Puede no ser requerido según la habilidad.</i> <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public abstract boolean habilidadRaza1(Peleable atacado);

	/**
	 * Realiza la habilidad 2 de la raza del personaje. <br>
	 * @param atacado
	 *            Personaje que recibe el ataque. <br>
	 *            <i><u>Nota</u>: Puede no ser requerido según la habilidad.</i> <br>
	 * @return <b>true</b> si el ataque fue realizado con éxito.<br>
	 *         <b>false</b> de lo contrario. <br>
	 */
	public abstract boolean habilidadRaza2(Peleable atacado);

	/**
	 * Devuelve las habilidades de la raza del personaje. <br>
	 * @return Habilidades de la raza del personaje. <br>
	 */
	public abstract String[] getHabilidadesRaza();

	/**
	 * Devuelve el bonus de salud del personaje. <br>
	 * @return Bonus de salud del personaje. <br>
	 */
	public abstract int getSaludBonus();

	/**
	 * Devuelve el bonus de energía del personaje. <br>
	 * @return Bonus de energía del personaje. <br>
	 */
	public abstract int getEnergiaBonus();

	/**
	 * Devuelve el nombre de la raza del personaje. <br>
	 * @return Nombre de la raza del personaje. <br>
	 */
	public abstract String getNombreRaza();

	/**
	 * Aumenta la inteligencia del personaje. <br>
	 * @param bonus
	 *            Bonus de inteligencia. <br>
	 */
	public final void aumentarInteligencia(final int bonus) {
		this.inteligencia += bonus;
	}

	/**
	 * Aumenta la destreza del personaje. <br>
	 * @param bonus
	 *            Bonus de destreza. <br>
	 */
	public final void aumentarDestreza(final int bonus) {
		this.destreza += bonus;
	}

	/**
	 * Aumenta la saludTope del personaje. <br>
	 * @param bonus
	 *            Bonus de salud tope. <br>
	 */
	public final void aumentarSaludTope(final int bonus) {
		this.saludTope += bonus;
	}

	/**
	 * Aumenta la energiaTope del personaje. <br>
	 * @param bonus
	 *            Bonus de energía tope. <br>
	 */
	public final void aumentarEnergiaTope(final int bonus) {
		this.energiaTope += bonus;
	}

	/**
	 * Devuelve la tabla de niveles del personaje. <br>
	 * @return Tabla de niveles del personaje. <br>
	 */
	public static final int[] getTablaDeNiveles() {
		return tablaDeNiveles;
	}

	/**
	 * Establece la tabla de niveles del personaje. <br>
	 * @param tablaDeNiveles
	 *            Tabla de niveles del personaje. <br>
	 */
	private static void setTablaDeNiveles(final int[] tablaDeNiveles) {
		Personaje.tablaDeNiveles = tablaDeNiveles;
	}

	/**
	 * Aumenta la energía del personaje. <br>
	 * @param bonus
	 *            Bonus de energía. <br>
	 */
	public final void aumentarEnergia(final int bonus) {
		this.energia += bonus;
	}

	/**
	 * Reduce la energía del personaje. <br>
	 * @param monto
	 *            Energía a reducir. <br>
	 */
	public final void reducirEnergia(final int monto) {
		if (this.energia > monto) {
			this.energia -= monto;
		} else {
			this.energia = 0;
		}
	}

	/**
	 * Reduce la salud del personaje. <br>
	 * @param reduc
	 *            Vida a reducir. <br>
	 */
	public final void reducirSalud(final int reduc) {
		this.salud -= reduc;
	}

	/**
	 * Aumenta la salud del personaje. <br>
	 * @param bonus
	 *            Bonus de salud. <br>
	 */
	public final void aumentarSalud(final int bonus) {
		salud += bonus;
	}

	/**
	 * Actualiza la salud y la energía del personaje en batalla. <br>
	 * @param map
	 *            Atributos del personaje. <br>
	 */
	public final void actualizarAtributos(final HashMap<String, Number> map) {
		salud = map.get("salud").intValue();
		energia = map.get("energia").intValue();
		super.setDefensa(map.get("defensa").intValue());
		casta.setProbabilidadEvitarDano(map.get("probEvitarDanio").doubleValue());
	}

	/**
	 * Realiza un trueque. <br>
	 * @param misItems
	 *            Items del personaje. <br>
	 * @param aPoner
	 *            Items a recibir. <br>
	 * @param aSacar
	 *            Items a sacar. <br>
	 */
	public void trueque(final ArrayList<Item> misItems, final ArrayList<Item> aPoner,
			final DefaultListModel<String> aSacar) {
		int j = 0;
		boolean loop = true;
		ArrayList<Item> aux = misItems;
		while (aSacar.size() > 0) {
			while (loop) {
				if (misItems.get(j).getNombre().equals(aSacar.get(0))) {
					aSacar.remove(0);
					aux.remove(misItems.get(j));
					loop = false;
				}
				j++;
			}
			j = 0;
			loop = true;
		}
		for (Item item : aPoner) {
			aux.add(item);
		}
		super.setItem(aux);
	}

	/**
	 * Devuelve la fuerza inicial del personaje. <br>
	 * @return Fuerza inicial del personaje. <br>
	 */
	public int getFuerzaInicial() {
		return FUERZA_INICIAL;
	}

	/**
	 * Devuelve la destreza inicial del personaje. <br>
	 * @return Destreza inicial del personaje. <br>
	 */
	public int getDestrezaInicial() {
		return DESTREZA_INICIAL;
	}

	/**
	 * Devuelve la inteligencia inicial del personaje. <br>
	 * @return Inteligencia inicial del personaje. <br>
	 */
	public int getInteligenciaInicial() {
		return INTELIGENCIA_INICIAL;
	}
}
