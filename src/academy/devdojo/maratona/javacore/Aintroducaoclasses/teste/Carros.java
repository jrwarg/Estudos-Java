package academy.devdojo.maratona.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class Carros {
    public static void main(String[] args) {
        Carro carros = new Carro();
        Carro carros1 = new Carro();

        carros.nome = "Jaguar";
        carros.modelo = "X9";
        carros.ano = 2021;

        carros1.nome = "Mercedes-Benz";
        carros1.modelo = "XZ1";
        carros1.ano = 2022;

        carros = carros1;

        System.out.println("Carros");
        System.out.println("--------------");
        System.out.println("Marca: " + carros.nome + ", Modelo: " + carros.modelo + ", Ano: " + carros.ano);
        System.out.println("Marca: " + carros1.nome + ", Modelo: " + carros1.modelo + ", Ano: " + carros1.ano);
        System.out.println("---------------");


    }
}
