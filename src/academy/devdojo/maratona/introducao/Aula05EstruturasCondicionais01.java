package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais01<c> {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade > 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado!");
        }
        if(!isAutorizadoComprarBebida)
            System.out.println("Não autorizado!");
    }
}
