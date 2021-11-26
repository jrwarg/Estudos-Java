package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;
        // Operador ternário: String resultado = (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? " Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        /*
        Nos moldes normais seria:
        if(salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/
        System.out.println(resultado);
    }
}
