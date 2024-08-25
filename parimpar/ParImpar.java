package com.mycompany.parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PilhaDinamicaPar pilhaPar = new PilhaDinamicaPar();
        PilhaDinamicaImpar pilhaImpar = new PilhaDinamicaImpar();
        PilhaGeral pilhaGeral = new PilhaGeral();

        int valor = 999;
        while (valor != 0) {
            System.out.println("Digite um valor entre -127 e 128/ 0 para parar!");
            valor = scan.nextInt();
            scan.nextLine();
            if (valor < -127 || valor > 128) {
                System.out.println("voce digitou um valor invalido, tente novamente!");
            } else if (valor != 0) {
                pilhaGeral.push(valor);
            }
        }

        while (pilhaGeral.isEmpty() != true) {
            try {
                if (pilhaGeral.peek() % 2 == 0) {
                    pilhaPar.push(pilhaGeral.pop());
                } else {
                    pilhaImpar.push(pilhaGeral.pop());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        do {
            try {
                System.out.println("Par = " + pilhaPar.pop());
                System.out.println("Impar = " + pilhaImpar.pop());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        } while (pilhaPar.isEmpty() != true && pilhaImpar.isEmpty() != true);
        
        if (pilhaPar.isEmpty() != true) {
            System.out.println("PilhaPar falta " + pilhaPar.size() + " Elemento(s)!");
        } else if (pilhaImpar.isEmpty() != true) {
            System.out.println("PilhaImpar falta " + pilhaImpar.size() + " Elemento(s)!");
        }
    }
}
