/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author felipe.godoy
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        float nota = 8.5f;
//        float nota = (float) 8.5;
//        String nome = "Gustavo";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
//        System.out.println("A nota é " + nota);

//        System.out.printf("A nota de %s é %.2f \n", nome, nota);
//        Essa forma você usa o sinal de porcentagem %.2, o . significa que é
//        decimal, por ser float, e o número após o ponto, significa o número de
//        casas decimais, após o ponto. Detalhe que na concatenção, se deve
//        usar , ao invés de +

        System.out.format("A nota de %s é %.2f \n", nome, nota);
//        Nessa maneira, usamos o format ao invés do printf, e substituímos o nome
//        por %s
   
    }
}
