/**
 *
 * @author felipe.godoy
 */

package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo"); //Objeto
        String res;
        res = (nome1==nome3)?"igual":"diferente";
//      A estruta de uma variável simples é diferente, mas o conteúdo é igual, 
//      e para comparar o conteúdo, deve usar o equals
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}