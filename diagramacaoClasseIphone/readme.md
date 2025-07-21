# 📱 Desafio POO - iPhone com Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/Programação%20Orientada%20a%20Objetos-OOP-blueviolet?style=for-the-badge)
![DIO](https://img.shields.io/badge/DIO.me-Plataforma%20de%20Educação-EC1C24?style=for-the-badge)

> Desafio proposto na plataforma [DIO](https://www.dio.me) para aplicar conceitos de **POO em Java**, modelando um iPhone com base na apresentação original de 2007 feita por Steve Jobs.

---

## 🎯 Objetivo

Modelar e implementar uma aplicação Java orientada a objetos que simule o comportamento de um **iPhone**, considerando três funcionalidades principais:

- 🎵 **Reprodutor Musical**
- ☎️ **Aparelho Telefônico**
- 🌐 **Navegador na Internet**

---

## 📐 Diagrama UML (Mermaid)

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet

```

🧩 Estrutura de Arquivos

``` css
        📁 src/
    ├── AparelhoTelefonico.java
    ├── NavegadorInternet.java
    ├── ReprodutorMusical.java
    ├── iPhone.java
    └── Main.java
```
▶️ Como Executar

1. Clone o repositório:

```
git clone https://github.com/alexandrealvees/sandaner-code-2025.git
cd sandaner-code-2025
```
2. Compile os arquivos:

```bash
javac *.java
```

3. Execute o programa:

```bash
java Main
```

🧪 Exemplo de Saída

```less
🎵 Tocando música...
🎶 Música selecionada: Imagine - John Lennon
⏸️ Música pausada.
📞 Ligando para: 11999999999
✅ Chamada atendida.
📬 Iniciando correio de voz...
🌐 Exibindo página: https://www.apple.com
🆕 Nova aba adicionada.
🔄 Página atualizada.
```

👨‍💻 Autor

Desenvolvido por Alexandre Alves para o desafio da DIO
