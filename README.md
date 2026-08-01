# 12 Semanas Dev

![Status](https://img.shields.io/badge/Status%20do%20projeto-Em%20andamento-yellow)
![Fase](https://img.shields.io/badge/Fase-Semana%200%20-blue)
![Linguagem](https://img.shields.io/badge/Linguagem-Java-orange)
![Regra](https://img.shields.io/badge/IA-Não%20permitida%20nos%20exerc%C3%ADcios-red)

Código, exercícios e diário de progresso da minha prática diária de programação em Java.

## 📌 Sobre este repositório

Este repositório documenta minha prática de código, escrita e revisão como parte da minha preparação técnica para vagas de desenvolvedor júnior.

O núcleo do processo é uma regra simples: **🔒 Os blocos de prática são escritos a partir de um arquivo vazio, com IA fechada** - sem Copilot, sem ChatGPT, sem Stack Overflow. Apenas documentação oficial (Oracle Java Docs, Spring Docs, Livros e Apostilas) é permitida.

A duração muda por fase:

| Fase | 🔒 Blocos sem IA                                                        | Total/dia |
|---|-------------------------------------------------------------------------|-----------|
| 0 | período de adaptação ao cronograma da Fase 1                            | ~ 150 min |
| 1 | arquivo em branco 90 min + reconstrução 60 min                          | 150 min   |
| 2 | arquivo em branco 60 min + reconstrução 45 min + projeto próprio 90 min | 195 min   |
| 3 | arquivo em branco 60 min (+ testes sem IA na semana 9)                  | 60 min    |

Todo exercício registrado aqui foi **escrito** assim, e embora nem todos tenham sido resolvidos, o `diario.md` registra a tentativa, não o sucesso, e é essa a informação que interessa.

## 📁 Estrutura

```
12-semanas-dev/
├── pratica/
│   └── src/
│       ├── beecrowd/    soluções por número de problema
│       ├── exercism/    exercícios da trilha Java
│       └── javanauta/
│           ├── reconstrucao/    exemplo da aula refeito do zero, video e IDE fechados
│           └── exercicios/      exercícios propostos pelo curso, resolvidos a mao
├── .gitattributes
├── .gitignore
├── convencao-de-commits.md
├── diario.md            registro diário: minutos sem IA, exercícios, onde travei
└── README.md
```

## 📆 Como ler o `diario.md`

Cada dia de estudo segue o padrão:

```
📆 AAAA-MM-DD | ⌛ Xmin sem IA
- 📝 [Nome do exercício] ([linguagem]) | 📍 Local: [link ou arquivo] | 👀 Travei: [Sim (motivo) / Não] | [✅/❌] Resolvi sozinho: [Sim/Não]

```

## 🔀 Como ler os commits

Convenção adotada em 30/07/2026, válida a partir do Dia 4. Commits anteriores seguem o formato antigo (`Dia N (DD/MM) | Exercícios: ...`) e não foram reescritos de propósito.

```
tipo(escopo): descricao no infinitivo
```
| Tipo | Significa                                                                                    |
|---|----------------------------------------------------------------------------------------------|
| `feat` | capacidade nova - exercício resolvido pela primeira vez, reconstrução que passou a funcionar |
| `fix` | existia e estava errado                                                                      |
| `refactor` | estrutura muda, comportamento não                                                            |
| `test` | testes (Fase 3, semana 9)                                                                    |
| `docs` | `diario.md`, `README.md`, documentação                                                       |
| `chore` | config, pasta, arquivo movido                                                                |

Escopos: `beecrowd` · `exercism` · `javanauta` · `diario` · sem escopo para a raiz.

Regras: infinitivo, minúscula inicial, sem ponto final, sem acento, até ~50 caracteres. Teste: se a palavra não encaixa depois de *"este commit irá ___"*, está errada.

**Um exercício resolvido = um commit.** A contagem não vai na mensagem: quantos está no `diario.md`, e o log já responde *quais*.

```bash
git log --oneline --grep="beecrowd"   # todos os exercícios do Beecrowd
git log --oneline --grep="^feat"      # capacidades novas, na ordem
```

O raciocínio completo, com os casos de fronteira e o que foi deliberadamente não adotado (SemVer, estratégia de branch), está em [`convencao-de-commits.md`](convencao-de-commits.md).

## 🤖 Sobre o uso de IA

Uso IA de forma deliberada, mas nunca antes de existir uma versão minha funcionando. Primeiro escrevo sozinho; só depois abro a ferramenta para revisão e crítica, e refatoro eu mesmo com base nela (não colo o código sugerido).

A inversão é o ponto: em vez de a IA escrever e eu aceitar, eu escrevo e a IA critica.

## 📊 Progresso

Critério de execução do plano: **% de dias úteis com a regra cumprida.** Abaixo de 70% o problema não é o plano, é execução. Fim de semana é opcional e conta à parte.

| Fase | Semanas | Foco                               | % dias úteis | Status |
|---|---|------------------------------------|--------------|---|
| 0 | Semana 0 | Diagnóstico e período de adaptação | 100%         | 🔄 em andamento |
| 1 · Fluência | 1 a 4 | Sintaxe, POO, algoritmos           | —            | ⏳ não iniciada |
| 2 · Construir | 5 a 8 | API própria com Spring Boot        | —            | ⏳ não iniciada |
| 3 · Empregabilidade | 9 a 12 | Testes, Docker, deploy real        | —            | ⏳ não iniciada |

Revisões obrigatórias ao fim das semanas 4 (30/08), 8 (27/09) e 12 (25/10). Não se avança de fase sem as metas verificáveis da fase anterior.
