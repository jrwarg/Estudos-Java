package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("TáLoco");
        funcionario.setIdade(33);
        funcionario.setSalarios(new double[]{1200.00, 2340.78, 987.99});

        funcionario.imprime();
    }

}
