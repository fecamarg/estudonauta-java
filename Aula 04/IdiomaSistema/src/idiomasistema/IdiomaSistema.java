package idiomasistema;

import java.util.Locale;
//Este comando importa a classe Locale do pacote java.util. A classe Locale é
//usada para representar um local, como um país, região ou idioma.

public class IdiomaSistema {

    public static void main(String[] args) {
        
        Locale idioma = Locale.getDefault();
        // Este comando cria um objeto Locale e define-o como o local padrão do
        // sistema. O local padrão do sistema é o local que é usado pelo sistema
        // para formatar datas, números e strings.
                
        System.out.println("O idioma do sistema é " + idioma.getDisplayLanguage() + ".");
        // Este comando obtém o idioma do objeto Locale. O idioma do objeto Locale
        // é o idioma que é usado pelo sistema para exibir mensagens ao usuário.
    } 
}
