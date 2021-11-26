package academy.devdojo.maratona.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        int cast = (int) 1000000000L; // casting para permitir ultrapassar o limite dos inteiros (transf em Long)
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Goku";


        System.out.println("A idade é " + idade + " anos");
        System.out.println("char " + caractere);
        System.out.println(cast);
        System.out.println("Oi, meu nome é "+ nome);
    }
}
