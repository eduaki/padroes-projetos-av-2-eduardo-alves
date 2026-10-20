Este repositório contém a resolução da avaliação prática B1-2 da disciplina de Padrões de Projetos. O objetivo é aplicar padrões de projeto criacionais do catálogo GoF (Gang of Four) para resolver problemas reais de arquitetura de software, garantindo baixo acoplamento, alta coesão e princípios SOLID (como o Aberto/Fechado).

O projeto está dividido em duas pastas independentes, uma para cada questão, contendo o código-fonte Java e o diagrama de classes UML correspondente.

---

## Questão 1: Emissão de Passagens (Padrão Factory Method)

### Contexto de Negócio
Uma agência de viagens online vende passagens de três modais: Aéreo, Rodoviário e Ferroviário. Anteriormente, a rotina de emissão ficava em uma única classe que utilizava `if` e `switch` para decidir qual passagem criar, o que gerava alto acoplamento e exigia a alteração dessa classe sempre que um novo modal era adicionado.

### A Solução
Para resolver o problema, foi aplicado o padrão **Factory Method**.

*   O procedimento de emissão (criar, calcular taxa e imprimir resumo) foi escrito uma única vez na classe abstrata `EmissaoPassagem` (método `emitir`).
*   A classe abstrata não conhece as passagens concretas; ela delega a criação para as subclasses (`EmissaoPassagemAerea`, `EmissaoPassagemRodoviaria`, `EmissaoPassagemFerroviaria`).
*   **Benefício:** Se a agência criar um novo modal (ex: Marítimo), basta criar novas classes, sem alterar nenhuma linha de código existente (atende ao RNF03).

---

## Questão 2: Matrículas Internacionais (Padrão Abstract Factory)

### Contexto de Negócio
Uma plataforma brasileira de cursos online expandiu suas vendas para o Chile. Durante o piloto, uma aluna chilena recebeu uma nota fiscal brasileira e um comprovante com CPF, gerando problemas de compliance e recusa de reembolso. A empresa exigiu que os três artefatos de uma matrícula (documento fiscal, pagamento e comprovante) pertençam **sempre ao mesmo país**.

### A Solução
A solução adotada foi o padrão **Abstract Factory**.

*   Criou-se a interface `FabricaArtefatosMatricula`, que define a criação dos três artefatos.
*   Foram criadas fábricas concretas para cada país: `FabricaBrasil` e `FabricaChile`.
*   A classe `Matricula` recebe uma fábrica pelo construtor. Ela não conhece as classes concretas de cada país (sem `if`/`switch`) e apenas chama os métodos de criação da fábrica.
*   **Benefício:** A estrutura do código garante que é impossível criar uma matrícula com artefatos de países diferentes, pois a própria fábrica é responsável por criar toda a família. Além disso, para adicionar um novo país, basta criar novas fábricas e produtos sem alterar a classe `Matricula` (atende ao RNF03).

---

## Estrutura do Repositório

```text
padroes-projetos-av-seu-nome/
├── README.md
├── questao1/
│   ├── diagrama/
│   │   └── diagrama questao1.jpg
│   └── src/
│       ├── Main.java
│       ├── Passagem.java
│       ├── PassagemAerea.java
│       ├── PassagemRodoviaria.java
│       ├── PassagemFerroviaria.java
│       ├── EmissaoPassagem.java
│       ├── EmissaoPassagemAerea.java
│       ├── EmissaoPassagemRodoviaria.java
│       └── EmissaoPassagemFerroviaria.java
└── questao2/
    ├── diagrama/
    │   └── diagrama-q2.puml
    └── src/
        ├── Main.java
        ├── Matricula.java
        ├── FabricaArtefatosMatricula.java
        ├── FabricaBrasil.java
        ├── FabricaChile.java
        ├── DocumentoFiscal.java
        ├── Pagamento.java
        ├── ComprovanteMatricula.java
        ├── NFSeBrasil.java
        ├── PixBrasil.java
        ├── ComprovanteBrasil.java
        ├── BoletaChile.java
        ├── WebpayChile.java
        └── ComprovanteChile.java
```

## Como executar

```bash
javac -encoding UTF-8 -d out questao2/src/*.java
java -cp out Main
```
