# Gerenciamento de Contas Bancárias
Este projeto implementa um sistema de gerenciamento de contas bancárias utilizando Java e Java Swing. Ele permite criar e gerenciar contas bancárias associadas a proprietários, com uma interface gráfica simples e amigável. O projeto organiza o código em diferentes camadas (domínio e interface) para facilitar a manutenção e a extensibilidade.
## **Índice**
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Configurar e Executar](#como-configurar-e-executar)
- [Exemplo de Uso](#exemplo-de-uso)
- [Contribuições](#contribui%C3%A7%C3%B5es)

## **Funcionalidades**
Este software oferece as seguintes funcionalidades:
- **Gerenciamento de Contas:**
    - Criação, edição e exibição de contas bancárias.

- **Associação de Proprietários:**
    - Mapeamento de uma conta a um ou mais proprietários.

- **Interface Gráfica:**
    - Controle acessível e interativo usando botões, menus e caixas de texto criados com **Java Swing**.

- **Eventos de Interação:**
    - Utiliza `ActionListeners` para tratar ações do usuário na interface gráfica.

## **Tecnologias Utilizadas**
As seguintes tecnologias foram utilizadas no desenvolvimento deste projeto:
- **Linguagem de Programação:** Java 8 ou superior.
- **Interface Gráfica:** Java Swing.
- **IDE Recomendadas:** IntelliJ IDEA ou qualquer outra compatível com projetos Java.
- **Organização do Projeto:** Programação Orientada a Objetos (POO).

## **Estrutura do Projeto**
A organização do código está clara e separada em pacotes. Abaixo está uma visão geral da estrutura:
``` 
🚀 Projeto
 ┣ 📂 domain
 ┃ ┣ 📄 Account.java      // Classe que representa uma conta bancária
 ┃ ┣ 📄 Owner.java        // Classe que representa o proprietário de uma conta
 ┣ 📂 test
 ┃ ┣ 📄 Main.java         // Ponto de entrada da aplicação, responsável pela interface gráfica
 ┣ 📄 README.md           // Arquivo de documentação do projeto
```
### Principais componentes:
1. **Package `domain`:**
    - Define as classes principais relacionadas ao domínio do sistema, como `Account` e `Owner`.
    - Exemplo:
        - O objeto `Account` possui informações como saldo, número da conta e tipo.
        - O objeto `Owner` descreve o proprietário (nome, CPF, outros detalhes).

2. **Classe Principal `Main`:**
    - Localizada em `test.Main`.
    - Contém a lógica principal para exibir a interface gráfica e configurar a aplicação.
    - A interface é feita utilizando os componentes básicos do **Java Swing**, como:
        - `JFrame` para a janela principal;
        - `JButton`, `JTextField` e `JLabel` para interação.

## **Como Configurar e Executar**
Siga as etapas abaixo para fazer o projeto funcionar na sua máquina:
### Pré-requisitos
- Verifique se o Java 8 ou superior está instalado:
``` bash
  java -version
```
Caso não esteja instalado, [baixe aqui](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html).
- **(Opcional)** Configure uma IDE, como IntelliJ IDEA ou Eclipse.

### Passo-a-passo
1. **Clone o Repositório** Utilize o seguinte comando para clonar o projeto:
``` bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
```
1. **Importe para sua IDE** Abra seu IntelliJ IDEA ou Eclipse e importe o projeto como um projeto de Java.
2. **Execute a Classe Principal** Navegue até a classe `Main`, localizada em `test/Main.java`, e execute o método `main`.

## **Exemplo de Uso**
Ao executar o projeto, será aberta uma interface gráfica que permite ao usuário:
1. Criar uma conta bancária.
2. Associar um proprietário à conta.
3. Realizar operações básicas diretamente pela interface.

### Exemplo:
- Um **pop-up** é usado para mostrar mensagens de erro ou sucesso de cada ação.
- Botões permitem submeter ou atualizar informações das contas.

## **Possíveis Expansões**
Este projeto pode ser estendido com alguns recursos adicionais, como:
- Integração com um banco de dados para persistência de dados (ex.: MySQL, PostgreSQL).
- Relatórios em PDF ou outras exportações para dados.
- Melhorias na interface gráfica para modernizar o design.

## **Contribuições**
Contribuições são sempre bem-vindas! Torne este projeto ainda melhor:
1. Faça um fork:
``` bash
   git fork https://github.com/seu-usuario/nome-do-repositorio.git
```
2. Crie uma nova branch:
``` bash
   git checkout -b feature/minha-melhoria
```
3. Envie suas alterações:
``` bash
   git push origin feature/minha-melhoria
```
4. Abra um Pull Request no GitHub.
