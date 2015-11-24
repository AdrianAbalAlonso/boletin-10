
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aabalalonso
 */
public class Juego {

    private int num, numIntentos, numeroacertar;

    public void numeroaacertar() {

        numeroacertar = (int) Math.floor(Math.random() * 50 + 1);
    }

    public void numerointentos() {
        numIntentos = (int) Math.floor(Math.random() * 10 + 1);
    }

    public void programaOrientativo() {
        int i;
        boolean gameover = true;
        for (i = 0; i < numIntentos; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero "));
            if (num - numeroacertar > 20 || numeroacertar - num > 20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            } else if (Math.abs(num - numeroacertar) < 20 && Math.abs(num - numeroacertar) > 10) {
                JOptionPane.showMessageDialog(null, "Lonxe");
            } 
            else if (Math.abs(num - numeroacertar) < 10 && Math.abs(num - numeroacertar) > 5) {
                JOptionPane.showMessageDialog(null, "Preto");
            } 
            else if (Math.abs(num - numeroacertar) > 0 && Math.abs(num - numeroacertar) <=5) {
                JOptionPane.showMessageDialog(null, "Moi Preto");
            } 
            else {
                JOptionPane.showMessageDialog(null, "HAS ACERTADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO !!!!!!!");
                gameover = false;
                break;
            }

        }

        if (gameover == true) {
            JOptionPane.showMessageDialog(null, "HAS PERDIDOOOOOOOOOOOOOOOOOOOOOOO !!!!!!!");
        }
    }
}
