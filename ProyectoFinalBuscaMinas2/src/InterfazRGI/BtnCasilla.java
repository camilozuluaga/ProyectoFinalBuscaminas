package InterfazRGI;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joxezitho
 */
public class BtnCasilla extends JButton {

    int value = 0;

    public BtnCasilla(int value) {
        this.value = value;
    }

    BtnCasilla() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int mostrar() throws IOException, LineUnavailableException {
        this.setIcon(null);
        switch (getValue()) {
            case -1:
                this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomb.png")));

                Clip sonido = null;
                try {
                    sonido = AudioSystem.getClip();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(BtnCasilla.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    sonido.open(AudioSystem.getAudioInputStream(new File("C:/Users/Brayhan/Documents/NetBeansProjects/Buscaminas/src/sonido.wav")));
                    sonido.start();
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(BtnCasilla.class.getName()).log(Level.SEVERE, null, ex);
                }


                break;
            case 0:
                break;
            default:
                this.setText(String.valueOf(getValue()));
        }
        this.setEnabled(false);
        return value;
    }

    public void bandera() {
        this.setIcon(this.getIcon() == null ? new javax.swing.ImageIcon(getClass().getResource("/bandera.png")) : null);
    }
}
