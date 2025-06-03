package dev.luan.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimirDados {
    private double somaSalario;
    private int totCadastroSalario;
    private Funcionario funcionario;

    public ImprimirDados() {
    }

    public void imprimir(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.printf("Salário:  %,.2f", funcionario.getSalario());
        System.out.println("\n");
    }

    public void mediaSalario(Funcionario funcionario1, Funcionario funcionario2, Funcionario funcionario3 ){
        this.setSomaSalario(funcionario1.getSalario() + funcionario2.getSalario() + funcionario3.getSalario());
        System.out.printf("A soma dos salários foi: %,.2f \n", this.getSomaSalario());
        double media = this.getSomaSalario() /3;
        System.out.printf("A média foi: %,.2f \n", media);

    }

    public double getSomaSalario() {
        return somaSalario;
    }

    public void setSomaSalario(double somaSalario) {
        this.somaSalario = somaSalario;
    }

    public int getTotCadastroSalario() {
        return totCadastroSalario;
    }

    public void setTotCadastroSalario(int totCadastroSalario) {
        this.totCadastroSalario = totCadastroSalario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
