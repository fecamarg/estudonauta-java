/**
 *
 * @author felipe.godoy
 */

package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?n1:n2; // Se n1 for maior que n2, ele mostra n1, senão n2
        System.out.println(r);
    }
}