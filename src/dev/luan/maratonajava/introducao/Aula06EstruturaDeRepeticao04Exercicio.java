package dev.luan.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04Exercicio {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valCar = 30000;
        for (int parc = 1; parc < valCar; parc++) {
            double valParc = valCar / parc;
            double jurosExponencial = Math.pow(1.005, parc) - 1; // Faz o valor da parcela subir na forma exponencial - o menos -1 faz com que tire o 1 do 1.005
            // só reste o 005
            double valParcJuros = valParc + (valParc * jurosExponencial) ;
            if (valParc >=1000){
                System.out.printf("Parcela " + parc + " R$ %.2f \n", valParc );
                System.out.printf("Parcela juros " + parc + " R$ %.2f \n", valParcJuros );
                System.out.println();
            } else {
                break;
            }
            //System.out.println(parc);
        }
    }
}
