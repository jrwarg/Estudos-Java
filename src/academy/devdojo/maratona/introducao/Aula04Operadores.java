package academy.devdojo.maratona.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // resto = %
        int resto = 33 & 23;
        System.out.println(resto);

        // <> <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualaVinte);

        // Operadores Lógicos -> &&(AND) ||(OR) !(Negação)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentrodaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel " +  isPlaystationCincoCompravel);

        // = += -= *= /= &=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador ++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); // imprima e depois acrescente mais um...
        System.out.println(contador2);
        System.out.println(++contador2);// acrescente um e depois imprima = 2...


    }
}