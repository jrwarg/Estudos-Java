package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fulano de Tal";
        funcionario.idade = 33;
        funcionario.salarios = new double[]{1200.00, 2340.78, 987.99};

        funcionario.imprime();
    }

}
