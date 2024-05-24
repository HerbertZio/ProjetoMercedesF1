# Mercedes F1 Team Database

Este repositório contém o projeto JAVA e os comandos SQL para criar o banco de dados da equipe Mercedes de Fórmula 1.

## Como Utilizar

1. Primeiro, crie um novo banco de dados chamado `Mercedes`:

    ```sql
    CREATE DATABASE Mercedes;
    ```

2. Em seguida, utilize o banco de dados recém-criado:

    ```sql
    USE Mercedes;
    ```

3. Agora, crie as tabelas necessárias para o banco de dados:

    ```sql
    CREATE TABLE Equipe (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        idade INT NOT NULL,
        nacionalidade VARCHAR(50) NOT NULL,
        salario DOUBLE NOT NULL
    );

    CREATE TABLE Veiculo (
        id INT AUTO_INCREMENT PRIMARY KEY,
        numero INT NOT NULL,
        modelo VARCHAR(100) NOT NULL
    );

    CREATE TABLE Atleta (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        idade INT NOT NULL,
        nacionalidade VARCHAR(50) NOT NULL,
        salario DOUBLE NOT NULL,
        altura DOUBLE NOT NULL,
        peso DOUBLE NOT NULL,
        vitorias INT NOT NULL,
        titulos INT NOT NULL,
        veiculo_id INT,
        FOREIGN KEY (veiculo_id) REFERENCES Veiculo(id)
    );

    CREATE TABLE Mecanico (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        idade INT NOT NULL,
        nacionalidade VARCHAR(50) NOT NULL,
        salario DOUBLE NOT NULL,
        especialidade VARCHAR(100) NOT NULL,
        anos_experiencia INT NOT NULL
    );

    CREATE TABLE Circuito (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        pais VARCHAR(50) NOT NULL,
        record INT NOT NULL
    );
    ```

## Descrição das Tabelas

- `Equipe`: Armazena informações sobre os membros da equipe.
- `Veiculo`: Armazena informações sobre os veículos utilizados pela equipe.
- `Atleta`: Armazena informações sobre os atletas (pilotos) da equipe.
- `Mecanico`: Armazena informações sobre os mecânicos da equipe.
- `Circuito`: Armazena informações sobre os circuitos de corrida.

Cada tabela tem suas próprias colunas para armazenar dados específicos relacionados à equipe Mercedes de Fórmula 1.

