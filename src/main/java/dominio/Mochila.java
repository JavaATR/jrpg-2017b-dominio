package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que administra la mochila de un personaje. <br>
 */
public class Mochila implements Serializable {
    /**
     * Serial version. <br>
     */
    private static final long serialVersionUID = 1L;
    /**
     * Id de la mochila. <br>
     */
    private int idMochila;
    /**
     * Id del item 1. <br>
     */
    private int item1 = -1;
    /**
     * Id del item 2. <br>
     */
    private int item2 = -1;
    /**
     * Id del item 3. <br>
     */
    private int item3 = -1;
    /**
     * Id del item 4. <br>
     */
    private int item4 = -1;
    /**
     * Id del item 5. <br>
     */
    private int item5 = -1;
    /**
     * Id del item 6. <br>
     */
    private int item6 = -1;
    /**
     * Id del item 7. <br>
     */
    private int item7 = -1;
    /**
     * Id del item 8. <br>
     */
    private int item8 = -1;
    /**
     * Id del item 9. <br>
     */
    private int item9 = -1;
    /**
     * Id del item 10. <br>
     */
    private int item10 = -1;
    /**
     * Id del item 11. <br>
     */
    private int item11 = -1;
    /**
     * Id del item 12. <br>
     */
    private int item12 = -1;
    /**
     * Id del item 13. <br>
     */
    private int item13 = -1;
    /**
     * Id del item 14. <br>
     */
    private int item14 = -1;
    /**
     * Id del item 15. <br>
     */
    private int item15 = -1;
    /**
     * Id del item 16. <br>
     */
    private int item16 = -1;
    /**
     * Id del item 17. <br>
     */
    private int item17 = -1;
    /**
     * Id del item 18. <br>
     */
    private int item18 = -1;
    /**
     * Id del item 19. <br>
     */
    private int item19 = -1;
    /**
     * Id del item 20. <br>
     */
    private int item20 = -1;

    /**
     * Crea una mochila. <br>
     */
    public Mochila() {

    }

    /**
     * Ordena la mochila. <br>
     *
     * @param items
     *            Lista de items. <br>
     */
    public void ordenarMochila(final ArrayList<Item> items) {
        // Reasigno los items para que sea coherente con la lista de items del
        // personaje.
        for (int index = 0; index < items.size(); index++) {
            this.agregarItem(items.get(index).getIdItem(), index);
        }
        // Relleno los vacios o los items que se movieron con -1.
        for (int others = items.size(); others < 20; others++) {
            this.agregarItem(-1, others);
        }
    }

    /**
     * Agrega un item en la mochila. <br>
     *
     * @param itemId
     *            Id del item. <br>
     * @param posicion
     *            Posición que ocupa en la mochila. <br>
     */
    public void agregarItem(final int itemId, final int posicion) {
        switch (posicion) {
        case 1:
            this.item1 = itemId;
            break;
        case 2:
            this.item2 = itemId;
            break;
        case 3:
            this.item3 = itemId;
            break;
        case 4:
            this.item4 = itemId;
            break;
        case 5:
            this.item5 = itemId;
            break;
        case 6:
            this.item6 = itemId;
            break;
        case 7:
            this.item7 = itemId;
            break;
        case 8:
            this.item8 = itemId;
            break;
        case 9:
            this.item9 = itemId;
            break;
        case 10:
            this.item10 = itemId;
            break;
        case 11:
            this.item11 = itemId;
            break;
        case 12:
            this.item12 = itemId;
            break;
        case 13:
            this.item13 = itemId;
            break;
        case 14:
            this.item14 = itemId;
            break;
        case 15:
            this.item15 = itemId;
            break;
        case 16:
            this.item16 = itemId;
            break;
        case 17:
            this.item17 = itemId;
            break;
        case 18:
            this.item18 = itemId;
            break;
        case 19:
            this.item19 = itemId;
            break;
        case 20:
            this.item20 = itemId;
            break;
        }
    }

    /**
     * Devuelve el id de la mochila. <br>
     *
     * @return Id de la mochila. <br>
     */
    public int getIdMochila() {
        return idMochila;
    }

    /**
     * Establece el id de la mochila. <br>
     *
     * @param idMochila
     *            Id de la mochila. <br>
     */
    public void setIdMochila(int idMochila) {
        this.idMochila = idMochila;
    }

    /**
     * Devuelve el id del item 1. <br>
     *
     * @return Id item 1. <br>
     */
    public int getItem1() {
        return item1;
    }

    /**
     * Establece el id del item 1. <br>
     *
     * @param itemNro1
     *            Id item 1. <br>
     */
    public void setItem1(int itemNro1) {
        this.item1 = itemNro1;
    }

    /**
     * Devuelve el id del item 2. <br>
     *
     * @return Id item 2. <br>
     */
    public int getItem2() {
        return item2;
    }

    /**
     * Establece el id del item 2. <br>
     *
     * @param itemNro2
     *            Id item2. <br>
     */
    public void setItem2(int itemNro2) {
        this.item2 = itemNro2;
    }

    /**
     * Devuelve el id del item 3. <br>
     *
     * @return Id item 3. <br>
     */
    public int getItem3() {
        return item3;
    }

    /**
     * Establece el id del item 3. <br>
     *
     * @param itemNro3
     *            Id item 3. <br>
     */
    public void setItem3(int itemNro3) {
        this.item3 = itemNro3;
    }

    /**
     * Devuelve el id del item 4. <br>
     *
     * @return Id item 4. <br>
     */
    public int getItem4() {
        return item4;
    }

    /**
     * Establece el id del item 4. <br>
     *
     * @param itemNro4
     *            Id item 4. <br>
     */
    public void setItem4(int itemNro4) {
        this.item4 = itemNro4;
    }

    /**
     * Devuelve el id del item 5. <br>
     *
     * @return Id item 5. <br>
     */
    public int getItem5() {
        return item5;
    }

    /**
     * Establece el id del item 5. <br>
     *
     * @param itemNro5
     *            Id item 5. <br>
     */
    public void setItem5(int itemNro5) {
        this.item5 = itemNro5;
    }

    /**
     * Devuelve el id del item 6. <br>
     *
     * @return Id item 6. <br>
     */
    public int getItem6() {
        return item6;
    }

    /**
     * Establece el id del item 6. <br>
     *
     * @param itemNro6
     *            Id item 6. <br>
     */
    public void setItem6(int itemNro6) {
        this.item6 = itemNro6;
    }

    /**
     * Devuelve el id del item 7. <br>
     *
     * @return Id item 7. <br>
     */
    public int getItem7() {
        return item7;
    }

    /**
     * Establece el id del item 7. <br>
     *
     * @param itemNro7
     *            Id item 7. <br>
     */
    public void setItem7(int itemNro7) {
        this.item7 = itemNro7;
    }

    /**
     * Devuelve el id del item 8. <br>
     *
     * @return Id item 8. <br>
     */
    public int getItem8() {
        return item8;
    }

    /**
     * Establece el id del item 8. <br>
     *
     * @param itemNro8
     *            Id item 8. <br>
     */
    public void setItem8(int itemNro8) {
        this.item8 = itemNro8;
    }

    /**
     * Devuelve el id del item 9. <br>
     *
     * @return Id item 9. <br>
     */
    public int getItem9() {
        return item9;
    }

    /**
     * Establece el id del item 9. <br>
     *
     * @param itemNro9
     *            Id item 9. <br>
     */
    public void setItem9(int itemNro9) {
        this.item9 = itemNro9;
    }

    /**
     * Devuelve el id del item 10. <br>
     *
     * @return Id item 10. <br>
     */
    public int getItem10() {
        return item10;
    }

    /**
     * Establece el id del item 10. <br>
     *
     * @param itemNro10
     *            Id item 10. <br>
     */
    public void setItem10(int itemNro10) {
        this.item10 = itemNro10;
    }

    /**
     * Devuelve el id del item 11. <br>
     *
     * @return Id item 11. <br>
     */
    public int getItem11() {
        return item11;
    }

    /**
     * Establece el id del item 11. <br>
     *
     * @param itemNro11
     *            Id item 11. <br>
     */
    public void setItem11(int itemNro11) {
        this.item11 = itemNro11;
    }

    /**
     * Devuelve el id del item 12. <br>
     *
     * @return Id item 12. <br>
     */
    public int getItem12() {
        return item12;
    }

    /**
     * Establece el id del item 12. <br>
     *
     * @param itemNro12
     *            Id item 12. <br>
     */
    public void setItem12(int itemNro12) {
        this.item12 = itemNro12;
    }

    /**
     * Devuelve el id del item 13. <br>
     *
     * @return Id item 13. <br>
     */
    public int getItem13() {
        return item13;
    }

    /**
     * Establece el id del item 13. <br>
     *
     * @param itemNro13
     *            Id item 13. <br>
     */
    public void setItem13(int itemNro13) {
        this.item13 = itemNro13;
    }

    /**
     * Devuelve el id del item 14. <br>
     *
     * @return Id item 14. <br>
     */
    public int getItem14() {
        return item14;
    }

    /**
     * Establece el id del item 14. <br>
     *
     * @param itemNro14
     *            Id item 14. <br>
     */
    public void setItem14(int itemNro14) {
        this.item14 = itemNro14;
    }

    /**
     * Devuelve el id del item 15. <br>
     *
     * @return Id item 15. <br>
     */
    public int getItem15() {
        return item15;
    }

    /**
     * Establece el id del item 15. <br>
     *
     * @param itemNro15
     *            Id item 15. <br>
     */
    public void setItem15(int itemNro15) {
        this.item15 = itemNro15;
    }

    /**
     * Devuelve el id del item 16. <br>
     *
     * @return Id item 16. <br>
     */
    public int getItem16() {
        return item16;
    }

    /**
     * Establece el id del item 16. <br>
     *
     * @param itemNro16
     *            Id item 16. <br>
     */
    public void setItem16(int itemNro16) {
        this.item16 = itemNro16;
    }

    /**
     * Devuelve el id del item 17. <br>
     *
     * @return Id item 17. <br>
     */
    public int getItem17() {
        return item17;
    }

    /**
     * Establece el id del item 17. <br>
     *
     * @param itemNro17
     *            Id item 17. <br>
     */
    public void setItem17(int itemNro17) {
        this.item17 = itemNro17;
    }

    /**
     * Devuelve el id del item 18. <br>
     *
     * @return Id item 18. <br>
     */
    public int getItem18() {
        return item18;
    }

    /**
     * Establece el id del item 18. <br>
     *
     * @param itemNro18
     *            Id item 18. <br>
     */
    public void setItem18(int itemNro18) {
        this.item18 = itemNro18;
    }

    /**
     * Devuelve el id del item 19. <br>
     *
     * @return Id item 19. <br>
     */
    public int getItem19() {
        return item19;
    }

    /**
     * Establece el id del item 19. <br>
     *
     * @param itemNro19
     *            Id item 19. <br>
     */
    public void setItem19(int itemNro19) {
        this.item19 = itemNro19;
    }

    /**
     * Devuelve el id del item 20. <br>
     *
     * @return Id item 20. <br>
     */
    public int getItem20() {
        return item20;
    }

    /**
     * Establece el id del item 20. <br>
     *
     * @param itemNro20
     *            Id item 20. <br>
     */
    public void setItem20(int itemNro20) {
        this.item20 = itemNro20;
    }

    /**
     * Devuelve la cantidad de items en el inventario. <br>
     *
     * @return Cantidad de items en el inventario. <br>
     */
    public int cantidadItems() {
        int cantidadItems = 0;
        if (this.item1 != -1) {
            cantidadItems++;
        }
        if (this.item2 != -1) {
            cantidadItems++;
        }
        if (this.item3 != -1) {
            cantidadItems++;
        }
        if (this.item4 != -1) {
            cantidadItems++;
        }
        if (this.item5 != -1) {
            cantidadItems++;
        }
        if (this.item6 != -1) {
            cantidadItems++;
        }
        if (this.item7 != -1) {
            cantidadItems++;
        }
        if (this.item8 != -1) {
            cantidadItems++;
        }
        if (this.item9 != -1) {
            cantidadItems++;
        }
        if (this.item10 != -1) {
            cantidadItems++;
        }
        if (this.item11 != -1) {
            cantidadItems++;
        }
        if (this.item12 != -1) {
            cantidadItems++;
        }
        if (this.item13 != -1) {
            cantidadItems++;
        }
        if (this.item14 != -1) {
            cantidadItems++;
        }
        if (this.item15 != -1) {
            cantidadItems++;
        }
        if (this.item16 != -1) {
            cantidadItems++;
        }
        if (this.item17 != -1) {
            cantidadItems++;
        }
        if (this.item18 != -1) {
            cantidadItems++;
        }
        if (this.item19 != -1) {
            cantidadItems++;
        }
        if (this.item20 != -1) {
            cantidadItems++;
        }
        return cantidadItems;
    }
}
