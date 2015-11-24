
import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class juego {

    private int num, numIntentos, numeroacertar;

    public int numeroaacertar() {
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a acertar"));

            return num;
        } while (num > 1 && num < 50);
    }

    public int numerointentos() {
        do {
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
            return numIntentos;
        } while (numIntentos >= 0);
    }

    public void programaOrientativo() {
        int i;
        boolean gameover = true;
        for (i = 0; i < numIntentos; i++) {
            numeroacertar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero "));
            if (num > numeroacertar) {
                JOptionPane.showMessageDialog(null, "El numero es mayor del que has metido");
            } else if (num < numeroacertar) {
                JOptionPane.showMessageDialog(null, "El numero es menor del que has metido");
            } else {
                JOptionPane.showMessageDialog(null, "HAS ACERTADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO !!!!!!!");
                gameover=false;
                break;
            }

        }
        
        if(gameover==true){
            JOptionPane.showMessageDialog(null, "HAS PERDIDOOOOOOOOOOOOOOOOOOOOOOO !!!!!!!");
        }
    }
}
