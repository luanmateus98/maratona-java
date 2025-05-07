package dev.luan.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Luan";
        String endereco = "Rua Regis Bittencourt";
        double salario = 3635.23;
        String dataRecebimentoSalario = "05/04/25";

        String relario = "Eu " + nome + ", morando no endereço " + endereco +
                ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relario);

    }
}
