package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

       for(int i = 1; i <= 100000; i++){
           if(i % 2 == 0){
               System.out.println(i);
           }
       }
    }
}
