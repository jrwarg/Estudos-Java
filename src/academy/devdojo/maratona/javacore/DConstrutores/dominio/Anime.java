package academy.devdojo.maratona.javacore.DConstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // CONSTRUTORES NÃO TEM NENHUM TIPO DE RETORNO:
    // Sempre são criados por PADRÃO no Java -> dão origem a um Objeto!
    public Anime(String nome, String tipo, int episodios, String genero){
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    /*
    * Se quisermos adicionar outro objeto (impossível através de outra instância, pois está limitada pelo construtor)
    * poderemos utilizar a
    * SOBRECARGA DE CONSTRUTORES
    * O segundo construtor não recebe parâmetros, poderíamos colocá-los separadamente....
    *
    * */

    public Anime(){

    }

//      MÉTODOS ABAIXO SUBSTITUÍDOS PELO CONSTRUTOR...
//    public void init (String nome, String tipo, int episodios){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//    }
//
//    // Para evitar inconsistência entre métodos aplicados, por exemplo, em horários diferentes na mesma equipe
//    // criamos um novo método = SOBRECARGA DE MÉTODOS
//
//    public void init(String nome, String tipo, int episodios, String genero){
//        this.init(nome,tipo,episodios);
//        this.genero = genero;
//    };

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
