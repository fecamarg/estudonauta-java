/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author felipe.godoy
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int n1 = 3;
//        int n2 = 5;
//        float m = (n1 + n2)/2;
//        System.out.println("A média é igual a " + m);
        
//        int numero = 10;
//        int valor = 4 + numero--; //Vai somar + 1 depois da execução da operação
//        System.out.println(valor);
//        System.out.println(numero);
        
        /*
        * Em relação ao incremento e decremento, quando ele vier antes da 
        * variavel, exemplo ++numero, ele incrementa + 1 imediatamente ao valor 
        * dela, e quando vier depois, exemplo numero++, ele não será aplicado 
        * naquela linha, mas posteriormente. Assim como o descremento.
        */
        
//        int x = 4;
//        x += 2; // Igual a ele mesmo + 2, ou seja, 4 + 2
//        System.out.println(x);
        
//        float v = 8.5f;
////        int ar = (int) Math.floor(v); //Arredondar para baixo
////        int ar = (int) Math.ceil(v); //Arredondar para cima
//        int ar = (int) Math.round(v); //Arredondar
//        System.out.println(ar);

        double ale = Math.random();
        // Gera númnero aleatório entre 0 e 1
        int n = (int) (15 + ale * (50-15));
        System.out.println(n);
    }
}