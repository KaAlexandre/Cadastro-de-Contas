# Cadastro de Contas
Este projeto é uma aplicação simples em **Java** que simula o gerenciamento de contas bancárias. Ele permite ao usuário realizar cadastro de contas, depósitos, saques e exibição de informações da conta diretamente no terminal.
## Funcionalidades
- **Cadastro de Conta:**
    - O usuário pode criar uma nova conta informando:
        - Número da conta.
        - Nome do titular.

    - A conta é criada com saldo inicial igual a **0** (zero), caso nenhum depósito inicial seja realizado.

- **Depósito Inicial (opcional):**
    - Após o cadastro, o sistema pergunta se o usuário deseja realizar um depósito inicial no momento da criação da conta.

- **Operações Disponíveis:**
    - Após criar a conta, o sistema permite:
        1. Fazer Depósitos.
        2. Realizar Saques.
        3. Sair do programa.

- **Atualização Automática dos Dados:**
    - Após cada operação (depósito ou saque), os dados da conta são atualizados e exibidos ao usuário.

## Estrutura do Projeto
O projeto é organizado em múltiplas classes para facilitar a separação de responsabilidades:
- `Main.java`: Classe principal que contém a lógica de interação com o usuário via terminal.
- `Account.java`: Classe que representa a conta bancária, com atributos como número da conta, titular e saldo. Também possui métodos para:
    - Depósito (`deposit`).
    - Saque (`withdrawal`).
    - Exibição dos dados da conta (`print`).

- `Owner.java`: Classe que representa o titular (proprietário) da conta.

## Pré-requisitos
- **Java Development Kit (JDK):** Versão 8 ou superior.
- Um terminal ou console para compilar e executar o programa.

## Como Executar
Siga os passos abaixo para compilar e executar o programa:
1. Clone este repositório para o seu computador:
``` bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
```
1. Compile os arquivos Java utilizando o compilador do JDK:
``` bash
   javac src/test/Main.java
```
1. Execute o programa:
``` bash
   java src/test/Main
```
1. Siga as instruções exibidas no terminal para gerenciar as contas.

## Exemplo de Fluxo
1. **Criação de Conta:**
    - O sistema solicita o número da conta e o nome do titular.
    - Pergunta se deseja realizar um depósito inicial.

2. **Operações Disponíveis:**
    - Escolha o que deseja fazer:
        - **Depósito:** Insira o valor a ser depositado.
        - **Saque:** Informe o valor a ser sacado.
        - **Encerrar o Programa:** Encerre a execução.

3. **Exibição de Dados:**
    - Após qualquer operação, o saldo atualizado será exibido.

## Estrutura de Código (Simplificada)
``` bash
src/
├── domain/
│   ├── Account.java   # Representa a conta bancária
│   └── Owner.java     # Representa o titular da conta
└── test/
    └── Main.java      # Lógica principal da aplicação
```
