package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
       String nome = "Pedro Cu";
       String tipoConta = "corrente";
       double saldo = 2500.0;

    System.out.println("**************************************");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo da conta:" + tipoConta);
    System.out.println("Saldo atual: R$" + saldo);
    System.out.println("\n**************************************");

    int opcaoDesejada = 0;

    while (opcaoDesejada != 4) {
       System.out.println("\nOperações:");;
       System.out.println("\n1- Consultar saldo");
       System.out.println("2- Receber valor");
       System.out.println("3- Transferir valor");
       System.out.println("4- Sair");
       System.out.println("\nDigite a opção desejada:");

    opcaoDesejada = leitura.nextInt();

    if (opcaoDesejada == 1) {
        System.out.println("Seu saldo é: R$" + saldo);
      } else if (opcaoDesejada == 2) {
        System.out.println("Qual o valor a ser recebido?");
        double valorRecebido = leitura.nextDouble();
        saldo += valorRecebido;
        System.out.println("Saldo atual: " + saldo);
      } else if (opcaoDesejada == 3) {
        System.out.println("Qual o valor a ser transferido?");
        double valorTransferido = leitura.nextDouble();
        if (valorTransferido > saldo) {
        System.out.println("Saldo indisponível");
        } else {
        saldo -= valorTransferido;
        System.out.println("Saldo atual: " + saldo);
        }
        } else if (opcaoDesejada == 4) {
            System.out.println("Saindo...");
        } else { 
            System.out.println("Operação inválida.");
        }
      }
   }
}