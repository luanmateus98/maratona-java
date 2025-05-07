package dev.luan.maratonajava.introducao;

public class Aula05EstruturasCondicionais04AndOr {
    // Euro 0 à 37.712 - 9,90%
    // Euro 34.713 à  68.507 37,35%
    // Euro 68.508 49,50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.90 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double impostoAnual;
        
        if (salarioAnual <= 34712){
            impostoAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            impostoAnual = salarioAnual * segundaFaixa;
        } else {
            impostoAnual = salarioAnual * terceiraFaixa;
        }

        System.out.printf("Será cobrado: %,.2f", impostoAnual);
    }
}
