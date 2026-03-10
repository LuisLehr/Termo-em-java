# Termo Pirata V1.0 🎮

Um jogo estilo **Wordle/Termo** desenvolvido em Java, onde você tem 6 tentativas para adivinhar uma palavra de 5 letras sorteada aleatoriamente.

## 🎯 Objetivo

Adivinhe a palavra secreta em até 6 tentativas! Cada tentativa oferecerá pistas sobre quais letras estão corretas, presentes no lugar errado ou ausentes da palavra.

## 📋 Regras do Jogo

- Você tem **6 tentativas** para adivinhar a palavra
- A palavra possui sempre **5 letras**
- Digitar palavras **sem acento** (acentos serão removidos automaticamente)
- Após cada tentativa, as letras mudam de cor:
  - 🟩 **VERDE**: Letra no lugar correto
  - 🟨 **AMARELO**: Letra existe na palavra, mas no lugar errado
  - ⬜ **CINZA**: Letra não existe na palavra

## 🚀 Como Executar

### Requisitos
- **Java 8+** instalado no seu computador
- Terminal ou prompt de comando

### Passos

1. Clone ou baixe este repositório
   ```bash
   git clone <url-do-repositorio>
   cd Termo-V1
   ```

2. Compile o projeto
   ```bash
   javac src/*.java
   ```

3. Execute o programa
   ```bash
   java -cp src Main
   ```

## 📁 Estrutura do Projeto

```
Termo V1/
├── README.md                        # Este arquivo
├── palavras.txt                     # Lista de palavras para sorteio
└── src/
    ├── Main.java                    # Ponto de entrada da aplicação
    ├── Menu.java                    # Classe responsável pelos menus
    ├── Jogo.java                    # Lógica principal do jogo
    ├── SortearPalavra.java          # Sorteio aleatório de palavras
    ├── leitorDePalavras.java        # Leitura e validação de entrada
    ├── ComparadorDePalavras.java    # Comparação de palavras e resultado
    ├── Resultado.java               # Enum com estados das letras
    └── Utils.java                   # Funções utilitárias (remoção de acentos)
```

## 🎮 Menu Principal

Ao iniciar o programa, você encontrará as seguintes opções:

```
1 - Iniciar jogo
2 - Ler as regras
3 - Sair
```

## 💻 Exemplo de Gameplay

```
Tentativa 1
Digite uma palavra: AREIA

 A  R  E  I  A  

BOM JOGO!
Tentativa 2
Digite uma palavra: PORTA

 P  O  R  T  A  

Parabéns! Você acertou!
```

## 🔧 Tecnologias Utilizadas

- **Linguagem**: Java
- **Padrão de Cores**: ANSI Escape Codes para terminal
- **Normalização de Texto**: `java.text.Normalizer` para remoção de acentos
- **I/O de Arquivo**: `java.nio.file.Files` para leitura da lista de palavras

## 📝 Arquivo de Palavras

O arquivo `palavras.txt` deve conter uma lista de palavras de 5 letras, uma por linha. Exemplo:

```
AREIA
PORTA
CASA
LIVRO
GATO
...
```

## 📚 Boas Práticas de Código

Este projeto segue padrões como:
- Separação de responsabilidades (cada classe com uma função específica)
- Uso de Enums para estados
- Métodos com nomes descritivos
- Tratamento de exceções

## ✒ Autores

* **Luis Henrique Lehr** - *Desenvolvimento* - [LuisLehr](https://github.com/LuisLehr)
  

Bom jogo! 🎉
