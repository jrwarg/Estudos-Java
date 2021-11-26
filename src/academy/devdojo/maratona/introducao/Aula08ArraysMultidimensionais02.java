package academy.devdojo.maratona.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        int [] array = {1,2};
        arrayInt[0] = array;
        arrayInt[1] = new int[]{1,2,3}; // possível inicialização, também...
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        // Outra forma de inicializar o array multidimensional:
        int[][] arrayInt2 = {{1,2},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n----------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
