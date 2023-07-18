package horadosistema;

import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        // quando se usa o new, está criando um novo objeto
        System.out.println("A hora do sistema é " + relogio.toString());
    }
}
