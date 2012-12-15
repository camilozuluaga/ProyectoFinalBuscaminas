/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazRGI;

import java.util.ArrayList;

/**
 *
 * @author jucazuse
 */
public class TareaMostrarRegistrados extends Thread {

    ArrayList<Usuarios> listaUsuarios;

    public TareaMostrarRegistrados(ArrayList<Usuarios> listaUsuarios) {

        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public void run() {

        InterfazModoJuego rg = new InterfazModoJuego(listaUsuarios);
        rg.setVisible(true);
    }
}
