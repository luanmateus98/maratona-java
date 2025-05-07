package dev.luan.maratonajava.introducao;

public class Aula05EstruturasCondicionais01If {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebidaAlcólica = idade > 18;

        if (isAutorizadoComprarBebidaAlcólica){
            System.out.println("Autorizado a Comprar Bebida Alcólica.");
        } else {
            System.out.println("Não Autorizado a Comprar Bebida Alcólica."); //Entra nessa condição se o if for falso
        }

        if (!isAutorizadoComprarBebidaAlcólica){ // Mesma coisa que isAutorizadoComprarBebidaAlcólica == false.
            System.out.println("Não Autorizado a Comprar Bebida Alcólica.");
        }

        boolean c = false;
        if (c = true){ //Nunca deve ser feito isso. Mas pode cair em provas.
            System.out.println("Dentro de algo que deve ser feito.");
        }

        System.out.println("Fora do if");
    }
}
