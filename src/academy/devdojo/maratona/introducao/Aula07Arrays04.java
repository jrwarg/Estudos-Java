package academy.devdojo.maratona.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int[] numeros1 = {1,2, 3,4,5};
        int[] numeros2 = new int[]{1,2, 3,4,5};
//          for (int i = 0; i < numeros1.length; i++){
//              System.out.println(numeros1[i]);
//          }
          for (int i: numeros1){
              System.out.println(i);
          }
    }
}
