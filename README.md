# 🧮 Calculadora de Custo para Impressão 3D

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java)

## 📄 Descrição

Este projeto é uma ferramenta de console, desenvolvida em Java, que replica e melhora a lógica de uma planilha de cálculo de custos para peças de impressão 3D. A aplicação permite ao usuário inserir diversas variáveis sobre o material e o processo de impressão para obter um orçamento preciso, incluindo o custo total de produção e preços de venda sugeridos para os mercados B2B (empresas) e B2C (clientes finais).

Este projeto foi desenvolvido como parte dos meus estudos em Java, com foco em aplicar os princípios da Programação Orientada a Objetos para resolver um problema do mundo real.

## 📸 Screenshot da Aplicação

<img width="345" height="150" alt="image" src="https://github.com/user-attachments/assets/8f87a414-09a8-4701-ac50-e54923808ba5" />


## ✨ Funcionalidades

* **Cálculo de Custo Detalhado:** Calcula o custo total da peça com base em:
    * Custo do material (filamento)
    * Custo de energia elétrica
    * Custo de mão de obra (pós-processamento)
    * Custo de manutenção da máquina
* **Preços de Venda Dinâmicos:** Sugere preços de venda com base em markups (margens de lucro) personalizáveis para clientes B2B e B2C.
* **Interface Interativa via Console:** O programa interage com o usuário para coletar todos os dados necessários de forma clara e sequencial.
* **Estrutura Orientada a Objetos:** O código é bem estruturado, separando a lógica de cálculo em uma classe `Calculadora3D` robusta e reutilizável.

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 17+)**
* **Programação Orientada a Objetos (POO):**
    * Encapsulamento
    * Métodos e Construtores
    * Uso de constantes `static final` para regras de negócio.
* **Git & GitHub** para controle de versão.

## 🚀 Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

1.  **Pré-requisitos:**
    * Ter o **Java (JDK 17 ou superior)** instalado e configurado no seu sistema.
    * Ter o **Git** instalado.

2.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/guifolco/calculadora-impressao-3D/](https://github.com/guifolco/calculadora-impressao-3D/)
    ```

3.  **Navegue até a Pasta do Projeto:**
    ```bash
    cd calculadora-impressao-3D
    ```

4.  **Navegue até a Pasta `src`:**
    ```bash
    cd src
    ```

5.  **Compile o Código:**
    ```bash
    # O comando javac compilará todos os arquivos .java necessários
    javac *.java
    ```

6.  **Execute o Programa:**
    ```bash
    # O comando java executa a classe que contém o método main (substitua 'Main' se o nome for diferente)
    java App
    ```
    Após executar, o programa começará a pedir os dados de entrada no terminal.

## ✒️ Autor

Desenvolvido por **Guilherme Folco Lima**

[<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/guilherme-folco-lima-a5a451243/)
