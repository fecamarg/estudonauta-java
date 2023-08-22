/**
 *
 * @author felipe.godoy
 */

package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas você tem? ");
        int perna = teclado.nextInt();
        String tipo;
        
        switch (perna) {
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bípede";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrúpede";
            break;
        case 5:
            tipo = "Aranha";
            break;
        default:
            tipo = "ET";
            break;
        }
        System.out.println("\nVocê tem " + perna + " perna(s)!? Então você é um...\n\n" + tipo + ". ;)\n");
    }
}
