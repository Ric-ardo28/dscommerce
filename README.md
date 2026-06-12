# DSCommerce

Projeto de e-commerce desenvolvido durante o curso da
**[DevSuperior - Escola de Programação](https://devsuperior.com.br)**,
ministrado pelo professor **Nélio Alves**.

O projeto tem fins educacionais e faz parte da minha jornada de aprendizado em
**Java**, **Spring Boot**, **JPA/Hibernate** e desenvolvimento de **APIs REST**
para aplicações back-end.

> Status: projeto em desenvolvimento, acompanhando a evolução das aulas do curso.

---

## Sobre o projeto

O **DSCommerce** simula uma aplicação de e-commerce, com o objetivo de praticar
conceitos utilizados em sistemas reais, como cadastro de produtos, categorias,
usuários, pedidos, pagamentos e controle de acesso.

Durante o desenvolvimento do projeto, serão trabalhados conceitos como:

- criação de APIs REST com Spring Boot;
- arquitetura em camadas;
- modelagem de domínio;
- mapeamento objeto-relacional com JPA/Hibernate;
- relacionamentos entre entidades;
- persistência em banco de dados;
- operações CRUD;
- tratamento de exceções;
- validação de dados;
- autenticação e autorização;
- perfis de acesso de usuários.

---

## Estado atual

Neste momento, o projeto possui:

- estrutura inicial de uma aplicação Spring Boot;
- configuração com Maven Wrapper;
- perfil de teste ativo;
- banco de dados H2 em memória;
- console web do H2 habilitado;
- entidades iniciais mapeadas com JPA;
- relacionamento entre `Product` e `Category`;
- relacionamento entre `Order`, `User` e `Payment`.

Entidades já criadas:

- `User`;
- `Order`;
- `OrderStatus`;
- `Category`;
- `Product`;
- `Payment`.

---

## Funcionalidades planejadas

### Públicas

- consultar o catálogo de produtos;
- filtrar produtos por nome;
- visualizar detalhes de um produto;
- gerenciar carrinho de compras;
- cadastrar-se no sistema;
- realizar login.

### Cliente

- atualizar os próprios dados;
- registrar pedidos;
- visualizar os próprios pedidos;
- consultar o histórico de compras.

### Administrador

- cadastrar, editar, listar e remover produtos;
- cadastrar, editar, listar e remover categorias;
- gerenciar usuários;
- registrar pagamentos;
- consultar pedidos;
- gerar relatórios de pedidos.

---

## Modelo de domínio

O modelo de domínio previsto para o projeto inclui as seguintes entidades:

- `User`;
- `Role`;
- `Product`;
- `Category`;
- `Order`;
- `OrderItem`;
- `Payment`.

Principais relacionamentos previstos:

- um produto pode pertencer a várias categorias;
- uma categoria pode possuir vários produtos;
- um usuário pode realizar vários pedidos;
- um pedido pertence a um usuário;
- um pedido pode possuir vários itens;
- cada item de pedido representa um produto e sua quantidade;
- um pedido pode possuir um pagamento;
- um usuário pode possuir um ou mais perfis de acesso.

---

## Tecnologias utilizadas

- Java 21;
- Spring Boot 4.0.6;
- Spring Web MVC;
- Spring Data JPA;
- Hibernate;
- H2 Database;
- Lombok;
- Maven;
- Git e GitHub.

---

## Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- JDK 21;
- Git.

O Maven não precisa ser instalado separadamente, pois o projeto utiliza o
**Maven Wrapper**.

---

## Como executar o projeto

Clone o repositório:

```bash
git clone https://github.com/Ric-ardo28/dscommerce.git
```

Acesse a pasta do projeto:

```bash
cd dscommerce
```

Execute a aplicação no Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Por padrão, a aplicação ficará disponível em:

```text
http://localhost:8080
```

---

## Banco de dados H2

O projeto utiliza o perfil `test`, configurado para usar um banco H2 em memória.
Com a aplicação em execução, o console do H2 pode ser acessado em:

```text
http://localhost:8080/h2-console
```

Dados de conexão:

| Campo | Valor |
| --- | --- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| Usuário | `sa` |
| Senha | deixe em branco |

---

## Executando os testes

No Linux ou macOS:

```bash
./mvnw test
```

No Windows:

```powershell
.\mvnw.cmd test
```

---

## Estrutura atual do projeto

```text
src
|-- main
|   |-- java/com/ricardodev/dscommerce
|   |   |-- DscommerceApplication.java
|   |   `-- entities
|   |       |-- Category.java
|   |       |-- Order.java
|   |       |-- OrderStatus.java
|   |       |-- Payment.java
|   |       |-- Product.java
|   |       `-- User.java
|   `-- resources
|       |-- application.properties
|       `-- application-test.properties
`-- test
    `-- java/com/ricardodev/dscommerce
        `-- DscommerceApplicationTests.java
```

A estrutura será ampliada conforme o projeto evoluir, com novas camadas como:

- controllers;
- services;
- repositories;
- DTOs;
- configurações de segurança;
- carga inicial de dados.

---

## Próximos passos

Alguns próximos passos previstos para a evolução do projeto:

- finalizar o mapeamento das entidades do domínio;
- criar a entidade `OrderItem`;
- criar a entidade `Role`;
- criar os repositories;
- popular o banco de dados de teste;
- criar DTOs para entrada e saída de dados;
- implementar services e controllers;
- adicionar validações;
- implementar tratamento de exceções;
- implementar autenticação e autorização.

---

## Objetivo de aprendizado

O principal objetivo deste projeto é consolidar conhecimentos em desenvolvimento
back-end com Java e Spring Boot, aplicando conceitos usados em sistemas reais e
evoluindo a aplicação de forma gradual conforme o andamento do curso.

---

## Autor

Desenvolvido por **Ricardo Rodrigues Santana**.

GitHub: [@Ric-ardo28](https://github.com/Ric-ardo28)

LinkedIn: [Ricardo Rodrigues Santana](https://www.linkedin.com/in/ricardo-rodrigues-santana-741536286/)

---

## Créditos

Projeto baseado no curso da
**[DevSuperior - Escola de Programação](https://devsuperior.com.br)**,
ministrado pelo professor **Nélio Alves**.
