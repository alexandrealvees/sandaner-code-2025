# 🧩 Sudoku no Terminal com Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Terminal](https://img.shields.io/badge/Modo-Terminal-black?style=for-the-badge)
![DIO](https://img.shields.io/badge/DIO.me-Educação-red?style=for-the-badge)

Projeto prático da trilha **Java** da [Digital Innovation One (DIO)](https://www.dio.me/), onde construímos um jogo de Sudoku no terminal utilizando **estrutura de dados**, **POO**, **parsing de argumentos via linha de comando** e **impressão formatada** no console.

---

## 📌 Descrição

Neste desafio, o jogador preenche a matriz do Sudoku através de argumentos passados na linha de comando.

Cada argumento possui o seguinte formato:

x,y;valor,editavel


📥 **Exemplo de entrada:**

```bash
java Main "0,0;4,false" "1,0;7,false" "2,0;9,true"
```
📤 Saída esperada no terminal:

```
┌───────┬───────┬───────┐
│ 4 7 9 │ . . . │ . . . │
│ . . . │ . . . │ . . . │
│ . . . │ . . . │ . . . │
├───────┼───────┼───────┤
│ . . . │ . . . │ . . . │
│ . . . │ . . . │ . . . │
│ . . . │ . . . │ . . . │
├───────┼───────┼───────┤
│ . . . │ . . . │ . . . │
│ . . . │ . . . │ . . . │
│ . . . │ . . . │ . . . │
└───────┴───────┴───────┘
```

🧱 Estrutura do Projeto
```
📁 sudoku/
├── Celula.java
├── Sudoku.java
└── Main.java
```

▶️ Como Executar

``` bash
javac *.java
```

✅ Compilar

``` bash
javac *.java
```

✅ Executar (com argumentos válidos)

``` bash
java Main "0,0;4,false" "1,0;7,false" "2,0;9,true"
```
📌 Dica para Windows PowerShell: coloque cada argumento entre aspas.

👨‍💻 Autor
Feito com 💻 por Alexandre Alves