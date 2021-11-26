package academy.devdojo.maratona.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // ** Somente tipos referência (não primitivos) podem ser iniciados com o valor null **
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 12;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


    }
}
