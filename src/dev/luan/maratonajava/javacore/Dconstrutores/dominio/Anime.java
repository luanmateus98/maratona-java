package dev.luan.maratonajava.javacore.Dconstrutores.dominio;

/**
 * Construtor serve para inicializar o objeto com os parâmetros passados, obrigando a inicialização do modo feito igual no construtor
 *
 * Sobrecarga de Construtores
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //Construtor com Parâmetros
    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); // This só pode ser usado assim no corpo (dentro) de um construtor e é obrigatório ser a primeira linha
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //Construtor sem Parâmetros
    public Anime(){
        System.out.println("Dentro do construtor vazio");
    }

    //Construtor com Parâmetros e sobrecarga
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
