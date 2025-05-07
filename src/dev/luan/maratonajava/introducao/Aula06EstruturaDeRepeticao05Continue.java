 package dev.luan.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05Continue {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valCar = 30000;
        for (int parc = (int) valCar; parc >= 1; parc--) {
            double valParc = valCar / parc;
            if (valParc < 1000){
                continue;
            }
            System.out.printf("Parcela " + parc + " R$ %.2f \n", valParc );

        }
    }
}
