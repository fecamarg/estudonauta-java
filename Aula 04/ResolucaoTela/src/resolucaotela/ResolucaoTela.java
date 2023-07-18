package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        Dimension resolucao = toolkit.getScreenSize();
        
        int largura = (int) Math.floor(resolucao.getWidth());
        int altura = (int) Math.floor(resolucao.getHeight());
        
        System.out.println("A resolução da sua tela é de " + largura + " x " + altura + ".");
    }
}
