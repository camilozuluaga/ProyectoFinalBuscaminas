package InterfazRGI;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabian
 */
public class TareaMostrarRegistrados2 extends Thread {

    ArrayList<Usuarios2> listaUsuarios2;

    public TareaMostrarRegistrados2(ArrayList<Usuarios2> listaUsuarios2) {

        this.listaUsuarios2 = listaUsuarios2;
    }

    @Override
    public void run() {

        Interfaz rg = new Interfaz(listaUsuarios2);
        rg.setVisible(true);
    }
}