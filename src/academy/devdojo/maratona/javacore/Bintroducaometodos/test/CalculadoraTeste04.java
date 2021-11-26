package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        // IMPORTANTE: Quando passamos tipos primitivos para outro método passamos, na verdade, UMA CÓPIA deles!!
        // Veja o resultado ...

        // Dentro das classes, quando passamos tipos primitivos nas variaveis, eles nunca são alterados!
        // Não importa o que aconteça com  os métodos subsequentes...

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTeste04");
        System.out.println(num1);
        System.out.println(num2);

    }
}
