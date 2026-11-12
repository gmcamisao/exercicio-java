# Exercícios de Java

Repositório com meus exercícios de estudo em Java.

## Desafio: Menu de Conta Bancária

Programa de console que simula operações básicas de uma conta corrente. O cliente do exemplo é fictício (Pedro Martins, conta corrente, saldo inicial de R$ 2.500,00).

### Funcionalidades

1. **Consultar saldo**: mostra o saldo atual.
2. **Receber valor**: soma um valor ao saldo.
3. **Transferir valor**: subtrai um valor do saldo, com validação de saldo insuficiente.
4. **Sair**: encerra o programa.

O menu se repete com um laço `while` até o usuário escolher a opção 4, e o saldo é mantido entre as operações.

### Conceitos praticados

- Entrada de dados com `Scanner`
- Variáveis e tipos (`String`, `int`, `double`)
- Estruturas condicionais (`if / else if / else`)
- Laço de repetição (`while`)

### Como executar

Pré-requisito: Java 17 ou superior instalado.

    cd desafio/demo
    javac -d out src/main/java/com/example/Main.java
    java -cp out com.example.Main

## Autor

Gustavo
