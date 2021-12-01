package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
//        int[] numeros = {1,2,3,4,5};
//        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
        // aqui a vantagem é que o parâmetro foi transf num array...
        // Também IMPORTANTE: Se houver outro argumento no parâmetro, tem que vir ANTES DO VAR ARGS!

    }
}
