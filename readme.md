# 🗂️ Gerenciador de Boards

Projeto em Java que simula um sistema de gerenciamento de boards (como um Kanban), com suporte a criação de colunas e cards, movimentação de tarefas e controle por status.

## 🚀 Funcionalidades

- Criar boards com colunas personalizadas
- Criar e visualizar cards
- Mover cards entre colunas
- Bloquear/desbloquear cards
- Cancelar cards
- Visualizar detalhes de board, colunas e cards

## 🧰 Tecnologias Utilizadas

- Java 17+
- Gradle (Kotlin DSL)
- MySQL 8 (em container Docker)
- Lombok
- Liquibase (para migrações de banco de dados)

## 🗄️ Estrutura do Projeto

```
    src/
    └── main/
    └── java/
    └── br/
    └── com/
    └── dio/
    ├── Main.java
    ├── ui/ # Interfaces de console (menus)
    ├── service/ # Regras de negócio
    ├── persistence/ # Configuração, entidades, DAO
```

---

## ⚙️ Como executar

1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/gerenciador-boards.git
cd gerenciador-boards
```
2. Suba o MySQL com Docker

```bash
docker run -d \
  --name mysql-dev \
  -e MYSQL_ROOT_PASSWORD=senha123 \
  -e MYSQL_DATABASE=meubanco \
  -p 3306:3306 \
  mysql:8.0
```
Obs: A aplicação usa por padrão:
```bash
    Usuário: root
    Senha: senha123
    Banco: meubanco
```

3. Compile e gere o .jar

```bash
.\gradlew.bat clean build
```

4. Execute o programa

```bash
java -jar build\libs\Board-1.0-SNAPSHOT.jar
```

Executar apenas migrações:

```bash
java -jar build\libs\Board-1.0-SNAPSHOT.jar migrate
```

📝 Exemplo de uso

```bash
    Bem vindo ao gerenciador de boards, escolha a opção desejada
    1 - Criar um novo board
    2 - Selecionar um board existente
    3 - Excluir um board
    4 - Sair
```

📌 Requisitos

- Java 17 ou superior
- Docker (para o banco de dados)
- Gradle instalado (ou usar o wrapper gradlew)

👨‍💻 Autor
Alexandre Alves
