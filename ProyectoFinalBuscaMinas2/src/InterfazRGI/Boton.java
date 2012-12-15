/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazRGI;

import javax.swing.JButton;

/**
 *
 * @author jucazuse
 */
public class Boton extends JButton {

    private boolean mina;

    public Boton() {
        super();
        double random = Math.random();
        if (random > 0.8) {
            mina = true;
            /**
             * si el valor disminiye aca la dificulta va a ser mayor
             */
        } else {
            mina = false;
        }
    }

    public void bandera() {
        this.setIcon(this.getIcon() == null ? new javax.swing.ImageIcon(getClass().getResource("/imagenes/bandera.png")) : null);
    }

    public boolean estaMinado() {
        return mina;

        /**
         * regresa el valor de mina si esta minado manda verdadero de lo
         * contrario manda falso
         */
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }
}
