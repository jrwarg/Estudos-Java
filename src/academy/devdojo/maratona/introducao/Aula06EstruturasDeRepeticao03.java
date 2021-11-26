package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor, por ex. 50

        int valorMax = 50;
      /*
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
               break;
            }
            System.out.println(i);
        }
        */
        int i = 0;
        while (i <= valorMax) {
            if (i < 25) {
                System.out.println(i++);
            }
        }
        }
    }

