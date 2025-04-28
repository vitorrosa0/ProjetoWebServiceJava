📦 Projeto Web Service em Java com Spring Boot


📖 Descrição

Este projeto é um Web Service RESTful desenvolvido em Java utilizando o Spring Boot.
Ele simula operações básicas de uma loja virtual, manipulando recursos como usuários, produtos, categorias, pedidos e pagamentos.

A aplicação implementa:

CRUD de recursos

Tratamento global de exceções

Relacionamentos entre entidades (muitos-para-muitos, muitos-para-um)

Uso de JPA/Hibernate para persistência

Controle de erros com resposta estruturada em JSON


📁 Estrutura de Pastas

Pasta	Descrição

config/	  Configurações gerais da aplicação

entities/	  Entidades do modelo de domínio (User, Product, Order, etc.)

entities/enums/	  Enumerações usadas nas entidades, como status de pedidos

entities/pk/	  Chave composta para entidade de itens de pedido

repositories/	  Interfaces de repositórios JPA

resources/	  Controllers responsáveis pelos endpoints REST

resources/exceptions/	  Tratamento global de exceções

services/	  Regras de negócio para os recursos

services/exceptions/	  Exceções específicas usadas no serviço

🚀 Tecnologias Utilizadas
Java 17 

Spring Boot 3.4.5

Spring Data JPA

Hibernate

H2 Database (banco em memória para testes)

Maven para gerenciamento de dependências

🧠 Funcionalidades
Listar todos os usuários, produtos, categorias e pedidos.

Buscar recurso por ID.

Criar, atualizar e deletar registros.

Tratamento de exceções personalizadas (ResourceNotFoundException, DatabaseException).

Relacionamento entre entidades:

Usuários e pedidos (um-para-muitos)

Produtos e categorias (muitos-para-muitos)

Pedidos e itens de pedido (chave composta)

Pedido e pagamento (um-para-um)






🎯 Endpoints Principais

Método	Rota	Descrição

GET	/users	Listar usuários

GET	/products	Listar produtos

GET	/orders	Listar pedidos

GET	/categories	Listar categorias

POST	/users	Criar usuário

PUT	/users/{id}	Atualizar usuário

DELETE	/users/{id}	Deletar usuário

(Semelhante para outros recursos)	

⚠️ Tratamento de Exceções
404 Not Found: Quando o recurso não é encontrado.

400 Bad Request: Para erros de banco de dados (como violação de integridade).

Retorno de erro personalizado:

{

  "timestamp": "2025-04-28T20:15:30.00Z",
  
  "status": 404,
  
  "error": "Resource not found",
  
  "message": "Resource not found. Id 99999",
  
  "path": "/users/99999"
  
}

DOMÍNIO DE MODELO

![image](https://github.com/user-attachments/assets/d27c9a71-adb0-45fd-9e63-d80772885125)

DOMÍNIO DE INSTANCIAS

![image](https://github.com/user-attachments/assets/1795c055-d223-4c12-b3bb-21e66e2d0241)

