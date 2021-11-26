package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade > 18 categoria juvenil

        int idade = 45;
        if(idade < 15){
            System.out.println("A idade é " + idade + ", pertence à Categoria Infantil");
        }else if(idade >=15 && idade < 18){
            System.out.println("A idade é " + idade + ", pertence à Categoria Juvenil");
        }else {
            System.out.println("A idade é " + idade + ", pertence à Categoria Adulto");
        }
    }
}
