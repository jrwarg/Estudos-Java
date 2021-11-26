package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Métodos somaDoisNumeros");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando Métodos subtraiDoisNumeros");
        calculadora.multiplicaDoisNumeros(10, 20.5F);
        System.out.println("Finalizando Métodos multiplicaDoisNumeros");
    }
}
