# 💳 Projeto ContaBanco

🚀 Exercício proposto na trilha **Java Básico** da [Digital Innovation One (DIO)](https://www.dio.me/), com foco em sintaxe e entrada de dados via terminal.

---

## 🧠 Objetivo

Criar um programa Java simples que simula o cadastro de uma conta bancária via terminal, recebendo dados do usuário e exibindo as informações formatadas de forma amigável.

---

## 📋 Funcionalidades

✔️ Recebe os seguintes dados via terminal:
- Número da Conta 🧾  
- Número da Agência 🏦  
- Nome do Cliente 🙋‍♂️  
- Saldo 💰  

✔️ Exibe os dados formatados como uma "tabela" no terminal  
✔️ Mensagem personalizada de boas-vindas

---

## 💻 Tecnologias utilizadas

| Tecnologia | Versão |
|------------|--------|
| `Java`     | 17+    |
| `Scanner`  | Entrada de dados via terminal |
| `System.out.printf` | Saída formatada |

---

## ▶️ Como executar o projeto

### 🔧 Pré-requisitos
- Java instalado e configurado (versão 11 ou superior)
- Editor de código ou terminal

### 📥 Clonar o repositório

```bash
git clone https://github.com/seu-usuario/ContaBanco.git
cd ContaBanco/src
```

### ⚙️ Compilar
```bash
javac ContaTerminal.java
```

### ⚙️ Executar
```bash
java ContaTerminal
```

### 🧪 Exemplo de uso
```bash
Por favor, digite o número da Conta: 36295
Por favor, digite o número da Agência: 1252
Por favor, digite o nome do cliente: alexandre alves
Por favor, digite o saldo: 1500
```

### 📤 Saída esperada:
```bash
==========================================
Nome do Cliente : alexandre alves
Agência         : 1252
Conta           : 36295
Saldo           : R$ 1500.00
==========================================

Olá alexandre alves, obrigado por criar uma conta em nosso banco.

```