# DSCommerce

Projeto de e-commerce desenvolvido durante o curso da
**[DevSuperior - Escola de Programacao](https://devsuperior.com.br)**,
ministrado pelo professor **Nelio Alves**.

O projeto tem fins educacionais e faz parte do meu aprendizado em
**Java**, **Spring Boot** e desenvolvimento de APIs REST para aplicacoes
back-end.

> Status: projeto em fase inicial de desenvolvimento.

## Sobre o projeto

O **DSCommerce** simula uma loja virtual e sera construido gradualmente com
funcionalidades comuns a sistemas de e-commerce, como catalogo de produtos,
carrinho de compras, pedidos, usuarios e controle de acesso.

Durante o desenvolvimento, serao praticados conceitos como:

- criacao de APIs REST;
- arquitetura em camadas;
- entidades e relacionamentos;
- persistencia em banco de dados;
- operacoes CRUD;
- validacao de dados;
- tratamento de excecoes;
- autenticacao e autorizacao;
- perfis de acesso.

## Estado atual

Neste momento, o projeto possui:

- estrutura inicial de uma aplicacao Spring Boot;
- entidade `User` mapeada com JPA;
- modelo inicial de `Order`;
- enumeracao `OrderStatus`;
- perfil de teste configurado;
- banco de dados H2 em memoria;
- console web do H2 habilitado.

## Funcionalidades planejadas

### Publicas

- consultar o catalogo de produtos;
- filtrar produtos por nome;
- visualizar os detalhes de um produto;
- gerenciar o carrinho de compras;
- cadastrar-se no sistema;
- realizar login.

### Cliente

- atualizar os proprios dados;
- registrar pedidos;
- visualizar os proprios pedidos.

### Administrador

- cadastrar, editar, listar e remover produtos;
- cadastrar, editar, listar e remover categorias;
- gerenciar usuarios;
- registrar pagamentos;
- gerar relatorios de pedidos.

## Modelo de dominio

O modelo de dominio previsto inclui as seguintes entidades:

- `User`;
- `Role`;
- `Product`;
- `Category`;
- `Order`;
- `OrderItem`;
- `Payment`.

Os principais relacionamentos planejados sao:

- um produto pode pertencer a varias categorias;
- uma categoria pode possuir varios produtos;
- um usuario pode realizar varios pedidos;
- um pedido pode possuir varios itens;
- cada item de pedido representa um produto e sua quantidade;
- um usuario pode possuir um ou mais perfis de acesso.

## Tecnologias

- Java 21;
- Spring Boot 4.0.6;
- Spring Web MVC;
- Spring Data JPA;
- Hibernate;
- H2 Database;
- Lombok;
- Maven;
- Git e GitHub.

## Pre-requisitos

Para executar o projeto, e necessario ter instalado:

- JDK 21;
- Git.

O Maven nao precisa ser instalado separadamente, pois o projeto inclui o
Maven Wrapper.

## Como executar

1. Clone o repositorio:

```bash
git clone https://github.com/Ric-ardo28/dscommerce.git
```

2. Acesse a pasta do projeto:

```bash
cd dscommerce
```

3. Execute a aplicacao no Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Por padrao, a aplicacao fica disponivel em:

```text
http://localhost:8080
```

## Banco H2

O perfil ativo e o `test`, configurado para utilizar um banco H2 em memoria.
Com a aplicacao em execucao, o console pode ser acessado em:

```text
http://localhost:8080/h2-console
```

Dados de conexao:

| Campo | Valor |
| --- | --- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| Usuario | `sa` |
| Senha | vazia |

## Testes

Para executar os testes automatizados:

No Linux ou macOS:

```bash
./mvnw test
```

No Windows:

```powershell
.\mvnw.cmd test
```

## Estrutura atual

```text
src
|-- main
|   |-- java/com/ricardodev/dscommerce
|   |   |-- DscommerceApplication.java
|   |   `-- entities
|   |       |-- Order.java
|   |       |-- OrderStatus.java
|   |       `-- User.java
|   `-- resources
|       |-- application.properties
|       `-- application-test.properties
`-- test
    `-- java/com/ricardodev/dscommerce
        `-- DscommerceApplicationTests.java
```

A estrutura sera ampliada conforme o projeto evoluir, com camadas para
controllers, DTOs, repositories, services e configuracoes.

## Objetivo de aprendizado

O principal objetivo e consolidar conhecimentos em desenvolvimento back-end
com Java e Spring Boot, aplicando conceitos utilizados em sistemas reais e
evoluindo as funcionalidades ao longo do curso.

## Autor

Desenvolvido por **Ricardo Rodrigues Santana**.

GitHub: [@Ric-ardo28](https://github.com/Ric-ardo28)

## Creditos

Projeto baseado no curso da
**[DevSuperior - Escola de Programacao](https://devsuperior.com.br)**,
ministrado pelo professor **Nelio Alves**.
