package application;

import java.util.Scanner;

import model.exceptions.ParametrosInvalidosException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro parametro: ");
            int primeiroParametro = sc.nextInt();

            System.out.print("Digite o segundo parametro: ");
            int seguntoParametro = sc.nextInt();

            contar(primeiroParametro, seguntoParametro);

            sc.close();

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int primeiroParametro, int seguntoParametro) {
        if (primeiroParametro > seguntoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = seguntoParametro - primeiroParametro;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
