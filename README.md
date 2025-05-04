# 🎉 Sistema de Gerenciamento de Eventos

Este projeto é um sistema de gerenciamento de eventos acadêmicos, desenvolvido em **Java** utilizando **Spring Boot**, com banco de dados **H2** em memória.

O objetivo é cadastrar e gerenciar **participantes**, **atividades**, **categorias** e **blocos** de eventos de forma simples e eficiente.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Banco de Dados H2
- Maven
- IntelliJ IDEA (ou qualquer IDE Java)

---

## 📂 Estrutura de Pacotes


---

## 🛠 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   
Importe o projeto no IntelliJ IDEA (ou outra IDE).

Garanta que o Maven baixe todas as dependências.

Rode a classe principal:

bash
Copiar
Editar
SeuEventoApplication.java
Acesse o H2 Console:

bash
Copiar
Editar
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (deixe em branco)

As tabelas e dados de teste serão gerados automaticamente pelo DatabaseSeeder.

🗂 Funcionalidades
Cadastro automático de atividades e participantes.

Associação de atividades a blocos e categorias.

Banco de dados em memória para facilitar o desenvolvimento e testes.

⚙️ Configurações Importantes
Arquivo: src/main/resources/application.properties

Porta padrão: 8080

H2 Console habilitado em /h2-console

Banco de dados configurado como in-memory (H2)

📈 Melhorias Futuras
Implementar autenticação e autorização (Spring Security).

Desenvolver CRUD completo para Participantes, Atividades, Categorias e Blocos.

Implementar testes unitários com JUnit e Mockito.

Deploy do sistema na nuvem (Heroku, Render, etc).

👨‍💻 Autor
 Lucas Costa 🚀
LinkedIn: https://www.linkedin.com/in/lucas-costa-894397255/ | GitHub: https://github.com/Lucasdev796

